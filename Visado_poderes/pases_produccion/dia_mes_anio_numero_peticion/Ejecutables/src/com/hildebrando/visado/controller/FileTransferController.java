package com.hildebrando.visado.controller;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bbva.common.util.ConstantesVisado;
import com.bbva.persistencia.generica.util.Utilitarios;

/**
 * Clase encargada del env�o de archivos al FileServer, esto se realiza cuando es
 * invocada mediante el bot�n "Actualizar" del Applet en el formulario de registro.
 * @author hildebrando
 * @version 1.0
 * **/

@Controller
@RequestMapping("/principal")
public class FileTransferController {
	
	private static Logger logger =  Logger.getLogger(FileTransferController.class);
	private static final String FIELD_FILES_LOADED = "FILES_LOADED=";
	private static final String FIELD_END = "#";
	private static final String FIELD_SEPARATOR = ",";
			
	@RequestMapping(value = "/cargar", method = RequestMethod.POST)	
	public @ResponseBody String procesoCarga(HttpServletResponse response, HttpServletRequest request) throws Exception {
		logger.info("============ INICIA procesoCarga ==========");
		String result="";
			FileItemFactory factory = new DiskFileItemFactory();
			
			ServletFileUpload upload = new ServletFileUpload(factory);
			//upload.setSizeMax(1000000);

		    List<FileItem> fileItems = upload.parseRequest(request);
		    if(fileItems!=null){
		    	logger.debug(ConstantesVisado.MENSAJE.TAMANHIO_LISTA+"fileItems es:"+fileItems.size());
		    }
		    // Process the uploaded items 
		    
		    //String path = request.getRealPath(File.separator) + File.separator + ConstantesVisado.FILES;		    
		    String path = Utilitarios.getPropiedad(ConstantesVisado.KEY_PATH_FILE_SERVER)  + File.separator + ConstantesVisado.FILES + File.separator;
		    //logger.debug("getRealPath: "+request.getRealPath(File.separator));
		    
		    List<String> listaArchivos = new ArrayList<String>();
		    StringBuilder sb = new StringBuilder();
		    sb.append(FIELD_FILES_LOADED);
		    
		    logger.info("[ProcesoCarga]-Carpeta Files : " + path);
		    File filePath = new File(path);
		    if(!filePath.exists()){
		    	logger.debug("Se creara el directorio si no existe");
		    	filePath.mkdir();
		    }
		    	
		    for(int i=0; i<fileItems.size();i++){
		    	FileItem item = fileItems.get(i);
		    	String name = FilenameUtils.getBaseName(item.getName());
		    	String ext = FilenameUtils.getExtension(item.getName()).toLowerCase();
		    	logger.info("[ProcesoCarga]-Archivo recibido " + name + "." + ext);		    	
		    	File file=null;
		    	try {
		    		file = File.createTempFile(name + "_", "." + ext, filePath);
		    		logger.info("[ProcesoCarga]-Archivo copiado a /files/:" + file.getName());
			        item.write(file);
			        listaArchivos.add(file.getName());
			        sb.append(file.getName());
			        if(i == fileItems.size()-1){
			        	sb.append(FIELD_END);
			        } else {
			        	sb.append(FIELD_SEPARATOR);
			        }	     
		    	}catch(Exception e){
		    		logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR + " " + e);
		    	} finally{
		    		if(file!=null){
		    			file.deleteOnExit();
		    		}
		    	}
		    }	   	 	   	    		   
		    result = sb.toString();		
	    
		logger.info("============ SALIENDO de procesoCarga ==========");
		return result;
	}
	
	/****
	  * 
	  * @param ubicacionLocal
	  * @param ubicacion 0:FILES 1:DOCUMENTOS
	  * @return
	  */
	@RequestMapping(value = "/descargarDocumento", method = RequestMethod.POST)
	public @ResponseBody String descargarDocumento(HttpServletResponse response, HttpServletRequest request) throws Exception {
		String ubicacionLocal = request.getParameter("jfNombreReporte");
		String ubicacion = request.getParameter("jfNombreExtension");
		logger.debug("==== INICIA descargarDocumento()===");
		logger.debug("[descargarArchivo]-ubicacionLocal:" + ubicacionLocal);
		logger.debug("[descargarArchivo]-ubicacion:" + ubicacion);

		String sUbicacionTemporal;
		String rutaArchivoProyecto = request.getRealPath(File.separator) + File.separator + ConstantesVisado.FILES + File.separator; 
		logger.debug("[descargarArchivo]-rutaArchivoProyecto:" + rutaArchivoProyecto);

		if (ubicacion.compareTo("0") == 0) {
			sUbicacionTemporal = Utilitarios
					.getPropiedad(ConstantesVisado.KEY_PATH_FILE_SERVER)
					+ File.separator + ConstantesVisado.FILES + File.separator;
		} else {
			sUbicacionTemporal = Utilitarios
					.getPropiedad(ConstantesVisado.KEY_PATH_FILE_SERVER)
					+ File.separator;
		}

		// Archivo a descargar
		File fichTemp = new File(sUbicacionTemporal + ubicacionLocal);
		logger.debug("+++ existe archivo: " + fichTemp.exists());
		// Si existe el archivo
		if (fichTemp.exists()) {
			File rutaProyecto = new File(rutaArchivoProyecto);
			if(!rutaProyecto.exists()){
				rutaProyecto.mkdirs();
			}
			File destFile = new File(rutaArchivoProyecto + ubicacionLocal);
			try {
				// Copia los archivos del File server a la carpeta temporal
				FileUtils.copyFile(fichTemp, destFile);
				logger.debug("+++ Termina de copiar archivo");
			} catch (IOException e) {
				logger.error("Error al descargar archivo: " + ubicacionLocal, e);
			}
		}

		logger.debug("==== SALIENDO de descargarDocumento()===");
		return "";	
	}
}
