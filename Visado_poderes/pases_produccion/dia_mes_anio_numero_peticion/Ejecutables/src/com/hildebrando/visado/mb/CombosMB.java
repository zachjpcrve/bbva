package com.hildebrando.visado.mb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.dao.support.DaoSupport;

import com.bbva.common.listener.SpringInit.SpringInit;
import com.bbva.common.util.ConstantesVisado;
import com.bbva.persistencia.generica.dao.Busqueda;
import com.bbva.persistencia.generica.dao.ConsultasJDBCDao;
import com.bbva.persistencia.generica.dao.GenericDao;
import com.bbva.persistencia.generica.dao.impl.ConsultasJDBCDaoImpl;
import com.hildebrando.visado.dto.ComboDto;
import com.hildebrando.visado.dto.Estado;
import com.hildebrando.visado.dto.EstadosNivel;
import com.hildebrando.visado.modelo.TiivsEstudio;
import com.hildebrando.visado.modelo.TiivsMiembro;
import com.hildebrando.visado.modelo.TiivsMultitabla;
import com.hildebrando.visado.modelo.TiivsMultitablaId;
import com.hildebrando.visado.modelo.TiivsNivel;
import com.hildebrando.visado.modelo.TiivsOficina1;
import com.hildebrando.visado.modelo.TiivsOperacionBancaria;
import com.hildebrando.visado.modelo.TiivsSolicitudNivel;
import com.hildebrando.visado.modelo.TiivsSolicitudOperban;
import com.hildebrando.visado.modelo.TiivsTerritorio;
import com.hildebrando.visado.modelo.TiivsTiempo;
import com.hildebrando.visado.modelo.TiivsTipoSolicitud;

/**
 * Clase que se encarga de cargar el listado general de combos de la Multitabla como 
 * po ejm: TipoSolicitud, Operaciones bancarias, Nivel, etc.
 * @author samira
 * @version 1.0
 */

@ManagedBean(name = "combosMB")
@SessionScoped
public class CombosMB{ 

	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA LOS LISTADOS YA QUE SE TRAERAN AL MOMENTO DE DEPLOYAR LA APLICACION
	 */
	
 	public static Logger logger = Logger.getLogger(CombosMB.class);
	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA LA MULTITABLA PARA EVITAR ALMACENAR N REGISTROS Y MANTENERLOS EN MEMORIA
	 */
	private List<TiivsMultitabla> lstMultitabla;
	//private List<RangosImporte> lstRangosImporte;
	private List<Estado> lstEstado;
	private List<EstadosNivel> lstEstadoNivel;
	//private List<TiposFecha> lstTiposFecha;
	private List<TiivsEstudio> lstEstudio;
	private List<TiivsNivel> lstNivel;
	private List<TiivsOperacionBancaria> lstOpeBancaria;
	private List<TiivsTerritorio> lstTerritorio;
	private List<TiivsOficina1> lstOficina;
	private List<TiivsOficina1> lstOficina1;
	//private List<Moneda> lstMoneda;
	//private List<TipoDocumento> lstTipoDocumentos;
	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA LAS VARIABLES DEBIDO A QUE NO SE HACE USO EN LA CLASE NI APLICACION
	 */
	//private List<TiivsAgrupacionPersona> lstTiposPersona;
	private List<TiivsSolicitudOperban> lstSolOperBan;
	//private Map<String, String> estados;
	private Map<String, String> niveles;
	//private Map<String, String> estadosNivel;
	private Map<String, String> estudios;
	private Map<String, String> tiposSolicitud;
	private List<ComboDto> lstClasificacionPersona;
	//private List<ComboDto> lstTipoRegistroPersona;
	private List<TiivsMiembro> lstAbogados;
	private List<TiivsTipoSolicitud> lstTipoSolicitud;
	private List<TiivsTiempo> lstTiempo;
	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA LAS VARIABLES DEBIDO A QUE NO SE HACE USO EN LA CLASE NI APLICACION
	 */
	//private TipoDocumento tmpTipoDoc;
	//private List<TipoDocumento> lstTipoDocumentosExtra;
	//private List<TipoDocumento> lstTipoDocumentosExtra2;
	
	/*
	 * CAMBIO 31/07/2014
	 * SE AGREGA LISTA DE NIVELES POR SOLICITUDES PARA EVITAR TIEMPOS
	 * DE CONSULTA EN EL LOOP DE CONSULTA SOLICITUDES
	 */
	private List<TiivsSolicitudNivel> lstSolNiveles;
	
	public CombosMB() {
		//**********CAMBIO HVB 21/07/2014*******
		//**********medicion de tiempo*******
		long inicio = System.currentTimeMillis();
		
		/**
		 * CAMBIO HVB 23/07/2014
		 * SE COMENTA LAS VARIABLES DEBIDO A QUE NO SE HACE USO EN LA CLASE NI APLICACION
		 */
		//tmpTipoDoc = new TipoDocumento();
		/**
		 * CAMBIO HVB 23/07/2014
		 * SE COMENTA LAS VARIABLES DEBIDO A QUE NO SE HACE USO EN LA CLASE NI APLICACION
		 */
		//lstTipoDocumentosExtra = new ArrayList<TipoDocumento>();
		//lstTipoDocumentosExtra2 =  new ArrayList<TipoDocumento>();
    	lstMultitabla = new ArrayList<TiivsMultitabla>();
		//lstRangosImporte = new ArrayList<RangosImporte>();
		//lstTipoDocumentos=new ArrayList<TipoDocumento>();
		lstEstado = new ArrayList<Estado>();
		lstEstadoNivel = new ArrayList<EstadosNivel>();
		//lstTiposFecha = new ArrayList<TiposFecha>();
		lstEstudio = new ArrayList<TiivsEstudio>();
		lstNivel = new ArrayList<TiivsNivel>();
		lstOpeBancaria = new ArrayList<TiivsOperacionBancaria>();
		lstTerritorio = new ArrayList<TiivsTerritorio>();
		lstOficina = new ArrayList<TiivsOficina1>();
		lstOficina1 = new ArrayList<TiivsOficina1>();
		//lstMoneda = new ArrayList<Moneda>();
		//estados = new HashMap<String, String>();
		niveles = new HashMap<String, String>();
		tiposSolicitud = new HashMap<String, String>();
		estudios = new HashMap<String, String>();
		//estadosNivel = new HashMap<String, String>();
		lstClasificacionPersona=new ArrayList<ComboDto>();
		//lstTipoRegistroPersona=new ArrayList<ComboDto>();
		lstTipoSolicitud=new ArrayList<TiivsTipoSolicitud>();
		lstSolOperBan= new ArrayList<TiivsSolicitudOperban>();
		lstAbogados=new ArrayList<TiivsMiembro>();
		lstSolNiveles = new ArrayList<TiivsSolicitudNivel>();
		
		cargarMultitabla();
		cargarCombosMultitabla(ConstantesVisado.CODIGO_MULTITABLA_TIPO_REGISTRO_PERSONA);
		cargarCombosNoMultitabla();
	
	}


	// Descripcion: Metodo que se encarga de cargar los datos que se encuentran
	// en la multitabla. Este metodo se llamara en el constructor
	// de la clase para que este disponible al inicio.
	// @Autor: Cesar La Rosa
	// @Version: 1.0
	// @param: -
	public void cargarMultitabla() {
		GenericDao<TiivsMultitabla, Object> multiDAO = (GenericDao<TiivsMultitabla, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
		Busqueda filtroMultitabla = Busqueda.forClass(TiivsMultitabla.class);

		try {
			long inicio = System.currentTimeMillis();
			lstMultitabla = multiDAO.buscarDinamico(filtroMultitabla);
			logger.debug("Tiempo de respuesta al cargar multitabla: " + (System.currentTimeMillis()-inicio)/1000 + " segundos");
		} catch (Exception e) {
			logger.debug(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de multitablas: ",e);
		}
	}

	// Descripcion: Metodo que se encarga de cargar los combos que se mostraran
	// en la pantalla de Bandeja de solicitudes
	// de acuerdo a la lista de la multitabla previamente cargada.
	// @Autor: Cesar La Rosa
	// @Version: 1.0
	// @param: -
	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA LOS LISTADOS YA QUE SE TRAERAN AL MOMENTO DE DEPLOYAR LA APLICACION
	 */
	
	public void cargarCombosMultitabla(String codigo) {
		//logger.debug("Buscando valores en multitabla con codigo: " + codigo);
		//lstRangosImporte.clear();
		lstEstado.clear();
		lstEstadoNivel.clear();
		//lstTiposFecha.clear();
		lstEstudio.clear();
		lstNivel.clear();
		lstOpeBancaria.clear();
		lstTerritorio.clear();
		lstOficina.clear();
		lstClasificacionPersona.clear();
		//lstTipoRegistroPersona.clear();

		
		//for (TiivsMultitabla res : lstMultitabla) { 
			//@Autor Samira
			// Carga combo Clasificacion Persona
			/*if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_CLASIFICACION_PERSONA)
					&&res.getValor2().trim().equals("1")) {
				ComboDto tmpComboClasi = new ComboDto();
				tmpComboClasi.setKey(res.getId().getCodElem());
				tmpComboClasi.setDescripcion(res.getValor1().toUpperCase());
				lstClasificacionPersona.add(tmpComboClasi);
			}*/
			
			//@Autor Samira
			// Carga combo Tipo Registro Persona
			/*
			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_TIPO_REGISTRO_PERSONA)) {
				ComboDto tmpCombo = new ComboDto();
				tmpCombo.setKey(res.getId().getCodElem());
				tmpCombo.setDescripcion(res.getValor1().toUpperCase());
				lstTipoRegistroPersona.add(tmpCombo);
			}
			*/
			// Carga combo importes
			/*
			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_IMPORTES)) {
				RangosImporte tmpRangos = new RangosImporte();
				tmpRangos.setCodigoRango(res.getId().getCodElem());
				tmpRangos.setDescripcion(res.getValor1().toUpperCase());
				lstRangosImporte.add(tmpRangos);

				
			}
			*/
			/*// Carga combo estados
			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_ESTADOS)) 
			{
				String estadosSolicitudes = traerEstadoSolicitud();
				
				if (estadosSolicitudes.indexOf(res.getId().getCodElem().trim())!=-1)
				{
					Estado tmpEstado = new Estado();
					tmpEstado.setCodEstado(res.getId().getCodElem());
					
					tmpEstado.setDescripcion(res.getValor1().toUpperCase());
					lstEstado.add(tmpEstado);

					int j = 0;

					for (; j <= lstEstado.size() - 1; j++) {
						estados.put(lstEstado.get(j).getDescripcion().toUpperCase(), lstEstado.get(j).getCodEstado());
					}
				}
			}*/

			// Carga combo estados Nivel
			/*
			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_ESTADOS_NIVEL)) {
				EstadosNivel tmpEstadoNivel = new EstadosNivel();
				tmpEstadoNivel.setCodigoEstadoNivel(res.getId().getCodElem());
				tmpEstadoNivel.setDescripcion(res.getValor1().toUpperCase());
				lstEstadoNivel.add(tmpEstadoNivel);


				int j = 0;

				for (; j <= lstEstadoNivel.size() - 1; j++) {
					estadosNivel.put(lstEstadoNivel.get(j).getDescripcion().toUpperCase(),
							lstEstadoNivel.get(j).getCodigoEstadoNivel());
				}

				
			}
			*/
			// Carga combo Tipos de fecha
			/*
			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_TIPOS_FECHA)) {
				TiposFecha tmpTiposFecha = new TiposFecha();
				tmpTiposFecha.setCodigoTipoFecha(res.getId().getCodElem());
				tmpTiposFecha.setDescripcion(res.getValor1().toUpperCase());
				lstTiposFecha.add(tmpTiposFecha);

				
			}
			*/
			// Carga lista de monedas
//			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_MONEDA)) {
//				Moneda tmpMoneda = new Moneda();
//				tmpMoneda.setCodMoneda(res.getId().getCodElem());
//				tmpMoneda.setDesMoneda(res.getValor1().toUpperCase());
//				lstMoneda.add(tmpMoneda);
//
//				
//			}
			
			/*
			// Carga combo Tipos de documento
			if (res.getId().getCodMult().equalsIgnoreCase(ConstantesVisado.CODIGO_MULTITABLA_TIPO_DOC) && res.getValor2().equals("1")) {
				 tmpTipoDoc = new TipoDocumento();
			
				if(res.getValor5()!=null){
					tmpTipoDoc.setCodTipoDoc(res.getId().getCodElem());
					tmpTipoDoc.setDescripcion(res.getValor1().toUpperCase());
					lstTipoDocumentosExtra.add(tmpTipoDoc);
				}else{
					tmpTipoDoc.setCodTipoDoc(res.getId().getCodElem());
					tmpTipoDoc.setDescripcion(res.getValor1().toUpperCase());
					lstTipoDocumentosExtra2.add(tmpTipoDoc);
				}
			}*/
		//}
		
		//if(lstTipoDocumentosExtra.size()!=0)
		//	lstTipoDocumentos.add(lstTipoDocumentosExtra.get(0));
		/*for (int i= 0 ; i< lstTipoDocumentosExtra2.size(); i++){
			lstTipoDocumentos.add(lstTipoDocumentosExtra2.get(i));
		}*/
		
		//Traer listado de clasificacion de persona
		obtenerClasificacionPersona();
		
		//Traer los tipos de documento
		//obtenerTipoDocumentos();
		
		//Traer combo estados 
		//traerEstadosFlujoSolicitud();
	}
	
	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA EL METODO PUESTO QUE SE CARGA LOS TIPOS DE DOCUMENTOS EN INFODEPLOYMB
	 */
	
	/*
	public void obtenerTipoDocumentos()
	{
		List<TiivsMultitabla> tmpLista = new ArrayList<TiivsMultitabla>();
		//List<TipoDocumento> tmpDocs = new ArrayList<TipoDocumento>();
				
		try {
			GenericDao<TiivsMultitabla, Object> service = (GenericDao<TiivsMultitabla, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
			Busqueda filtro = Busqueda.forClass(TiivsMultitabla.class);
			filtro.add(Restrictions.eq("id.codMult", ConstantesVisado.CODIGO_MULTITABLA_TIPO_DOC));
			filtro.add(Restrictions.eq("valor2", "1"));
			//[28-10] Mejora: Se agrega ordenamiento por 'valor5', para mostrar en el 
			//orden solicitado: 1� DNI, 2� Ruc, etc.
			filtro.addOrder(Order.asc("valor5"));
			//filtro.addOrder(Order.asc("valor1"));
			
			tmpLista=service.buscarDinamico(filtro);
			if(tmpLista!=null){
				logger.debug(ConstantesVisado.MENSAJE.TAMANHIO_LISTA+"de Tipo Documentos es: " + tmpLista.size());
			}
		}catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+" de tipos de documento: ",e);
		}
		
		for (TiivsMultitabla tmp: tmpLista)
		{
			TipoDocumento doc = new TipoDocumento();
			doc.setCodTipoDoc(tmp.getId().getCodElem());
			doc.setDescripcion(tmp.getValor1().toUpperCase());
			//logger.debug("-> "+doc.getCodTipoDoc() + "\t"+doc.getDescripcion());
			lstTipoDocumentos.add(doc);
		}
	}
	*/
	
	
	public void obtenerClasificacionPersona()
	{
		List<TiivsMultitabla> tmpLista = new ArrayList<TiivsMultitabla>();
		//List<ComboDto> tmpClas = new ArrayList<ComboDto>();				
		try {
			GenericDao<TiivsMultitabla, Object> service = (GenericDao<TiivsMultitabla, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
			Busqueda filtro = Busqueda.forClass(TiivsMultitabla.class);
			filtro.add(Restrictions.eq("id.codMult", ConstantesVisado.CODIGO_MULTITABLA_CLASIFICACION_PERSONA));
			filtro.add(Restrictions.eq("valor2", "1"));
			filtro.addOrder(Order.asc("valor1"));
			
			tmpLista=service.buscarDinamico(filtro);
		}catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de clasificacion de personas: ",e);
		}
		
		for (TiivsMultitabla tmp: tmpLista)
		{
			ComboDto doc = new ComboDto();
			doc.setKey(tmp.getId().getCodElem());
			doc.setDescripcion(tmp.getValor1().toUpperCase());
			
			lstClasificacionPersona.add(doc);
		}
	}
	
	/**
	 * CAMBIO HVB 23/07/2014
	 * SE COMENTA EL METODO PUESTO QUE SE CARGA LOS TIPOS DE DOCUMENTOS EN INFODEPLOYMB
	 */
	
//	@SuppressWarnings("unchecked")
//	public void traerEstadosFlujoSolicitud()
//	{
//		List<Estado> tmpLista = new ArrayList<Estado>();
		/*SolicitudDao<Estado, Object> solicitudService = (SolicitudDao<Estado, Object>) SpringInit.getApplicationContext().getBean("solicitudEspDao");
		
		try {
			tmpLista = solicitudService.traerEstadosFlujoSolicitud();
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de EstadosFlujoSolicitud: "+e);
		}
		
		int j = 0;
		int indice =-1;
		
		Map<String, String> tmpEstados = new HashMap<String, String>();
		
		for (; j <= tmpLista.size() - 1; j++) 
		{
			tmpEstados.put(tmpLista.get(j).getDescripcion().toUpperCase(), tmpLista.get(j).getCodEstado());
			
			if (tmpLista.get(j).getDescripcion().trim().equals(ConstantesVisado.ESTADOS.ESTADO_VENCIDO_T02.toUpperCase()))
			{
				indice=j;
			}
		}		
		
		if (indice==-1)
		{
			tmpEstados.put(ConstantesVisado.ESTADOS.ESTADO_VENCIDO_T02.toUpperCase(), ConstantesVisado.ESTADOS.ESTADO_COD_VENCIDO_T02);
		}*/
		/*
		Map<String, String> tmpEstados = new HashMap<String, String>();
		GenericDao<TiivsMultitabla, Object> service = (GenericDao<TiivsMultitabla, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
		Busqueda filtro = Busqueda.forClass(TiivsMultitabla.class);
		filtro.add(Restrictions.eq("id.codMult", ConstantesVisado.CODIGO_MULTITABLA_ESTADOS));
		filtro.add(Restrictions.eq("valor2", "1"));
		filtro.add(Restrictions.eq("valor3", ConstantesVisado.FLUJO_ESTADO)); //2013/10/10
		List<TiivsMultitabla> tmpEstado = new ArrayList<TiivsMultitabla>();
		try {
			tmpEstado = service.buscarDinamico(filtro);
			if(tmpEstado!=null){
				for(TiivsMultitabla estado:tmpEstado){
					tmpEstados.put(estado.getValor1().toUpperCase(), estado.getId().getCodElem());
				}
			}
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_EXCEPCION,e);
		}
		
		
		estados = sortByComparator(tmpEstados);
		if(estados!=null){
			logger.debug(ConstantesVisado.MENSAJE.TAMANHIO_LISTA+"EstadosFlujoSolicitud es:"+estados.size());
		}		
		*/
//	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Map sortByComparator(Map unsortMap) {	 
		List list = new LinkedList(unsortMap.entrySet());		
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getKey()).compareTo(((Map.Entry) (o2)).getKey());
			}
		});
 		Map sortedMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
		
	/*
	 * CAMBIO 25/07/2014 HVB
	 * SE COMENTAN LAS CONSULTAS DE HIBERNATE A JDBC PARA TODOS LOS LISTADOS NO MULTITABLAS
	 * OPTIMIZACION
	 */
		
	@SuppressWarnings("unchecked")
	public void cargarCombosNoMultitabla(){
		
		ConsultasJDBCDaoImpl daoJDBC = new ConsultasJDBCDaoImpl();  
		
		try {
//			GenericDao<TiivsMiembro, Object> serviceMiembro = (GenericDao<TiivsMiembro, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//			Busqueda filtroMiembro = Busqueda.forClass(TiivsMiembro.class);
//			filtroMiembro.add(Restrictions.eq("tiivsGrupo.codGrupo", ConstantesVisado.CODIGO_GRUPO_ABOGADOS));
//			lstAbogados=serviceMiembro.buscarDinamico(filtroMiembro);
			lstAbogados = daoJDBC.obtenerAbogados();
		}catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de abogados - miembro: ",e);
		}
		
		// Carga combo de Operacion Bancaria
//		GenericDao<TiivsOperacionBancaria, Object> openBanDAO = (GenericDao<TiivsOperacionBancaria, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroOpenBan = Busqueda.forClass(TiivsOperacionBancaria.class);
        try {
//			lstOpeBancaria = openBanDAO.buscarDinamico(filtroOpenBan);
        	lstOpeBancaria = daoJDBC.obtenerOperacionesBancarias();
			if(lstOpeBancaria!=null){
				logger.debug(ConstantesVisado.MENSAJE.TAMANHIO_LISTA+"lstOpeBancaria es:["+lstOpeBancaria.size()+"].");
			}			
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de operaciones bancarias: ",e);
		}
       
//        for (TiivsOperacionBancaria tmpLista: lstOpeBancaria)
//        {
//    	   if (tmpLista!=null)
//    	   {
//    		   if (tmpLista.getDesOperBan()!=null)
//    		   {
//    			   String texto =tmpLista.getDesOperBan().toUpperCase();
//    	    	   tmpLista.setDesOperBan(texto);
//    		   }
//    	   }
//        	
//        }
       
        // Carga combo de Tipo de Solicitud
//		GenericDao<TiivsTipoSolicitud, Object> genTipoSolcDAO = (GenericDao<TiivsTipoSolicitud, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroTipoSolc = Busqueda.forClass(TiivsTipoSolicitud.class);
//		filtroTipoSolc.add(Restrictions.eq("activo", '1'));
		
		try {
//			lstTipoSolicitud = genTipoSolcDAO.buscarDinamico(filtroTipoSolc);
			lstTipoSolicitud = daoJDBC.obtenerTiposSolicitud();
			if(lstTipoSolicitud!=null){
				logger.debug(ConstantesVisado.MENSAJE.TAMANHIO_LISTA+"lstTipoSolicitud es:["+lstTipoSolicitud.size()+"].");
			}
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de tipos de solicitud: ",e);
		}
		
//		int x = 0;
//		for (; x <= lstTipoSolicitud.size() - 1; x++) 
//		{
//			tiposSolicitud.put(lstTipoSolicitud.get(x).getDesTipServicio().toUpperCase(),	lstTipoSolicitud.get(x).getCodTipSolic());
//		}
		
		// Carga combo de Territorio
//		GenericDao<TiivsTerritorio, Object> terrDAO = (GenericDao<TiivsTerritorio, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroTerr = Busqueda.forClass(TiivsTerritorio.class);

		try {
//			lstTerritorio = terrDAO.buscarDinamico(filtroTerr);
			lstTerritorio = daoJDBC.obtenerTerritorios();
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de territorios :",e);
		}
		
//		for (TiivsTerritorio tmpLista: lstTerritorio)
//        {
//    	   if (tmpLista!=null)
//    	   {
//    		   if (tmpLista.getDesTer()!=null)
//    		   {
//    			   String texto =tmpLista.getDesTer().toUpperCase();
//    	    	   tmpLista.setDesTer(texto);
//    		   }
//    	   }
//        	
//        }

		// Carga combo de Oficinas
//		GenericDao<TiivsOficina1, Object> oficDAO = (GenericDao<TiivsOficina1, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroOfi = Busqueda.forClass(TiivsOficina1.class);
//		filtroOfi.add(Restrictions.isNotNull("tiivsTerritorio.codTer"));
//		filtroOfi.add(Restrictions.eq("activo", '1'));
//		filtroOfi.addOrder(Order.asc(ConstantesVisado.CAMPO_COD_OFICINA));
//		filtroOfi.setMaxResults(5000);
		try {
//			lstOficina = oficDAO.buscarDinamico(filtroOfi);
//			lstOficina1 = oficDAO.buscarDinamico(filtroOfi);
			lstOficina = daoJDBC.obtenerOficinas(5000);
			lstOficina1.addAll(lstOficina);
//			lstOficina1.addAll()
			if(lstOficina!=null){
				logger.debug(ConstantesVisado.MENSAJE.TAMANHIO_LISTA+"Oficinas es: [" +lstOficina.size()+"].");
			}
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de oficinas: ",e);
		}
		
//		for (TiivsOficina1 tmpLista: lstOficina1)
//        {
//    	   if (tmpLista!=null)
//    	   {
//    		   if (tmpLista.getDesOfi()!=null)
//    		   {
//    			   String texto =tmpLista.getDesOfi().toUpperCase();
//    	    	   tmpLista.setDesOfi(texto);
//    		   }
//    	   }
//        	
//        }
		
		// Carga data de Operaciones Bancarias por Solicitud
//		GenericDao<TiivsSolicitudOperban, Object> operBanDAO = (GenericDao<TiivsSolicitudOperban, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroOperBan = Busqueda.forClass(TiivsSolicitudOperban.class);
//		filtroOperBan.addOrder(Order.asc(ConstantesVisado.CAMPO_ID_CODIGO_SOLICITUD_ALIAS));
		
		try {
			lstSolOperBan = daoJDBC.obtenerSolicitudesxOperacionesBancarias();
//			lstSolOperBan = operBanDAO.buscarDinamico(filtroOperBan);
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de tipos de persona: ",e);
		}
		
		// Carga combo Nivel
//		GenericDao<TiivsNivel, Object> nivelDAO = (GenericDao<TiivsNivel, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroNivel = Busqueda.forClass(TiivsNivel.class);

		try {
//			lstNivel = nivelDAO.buscarDinamico(filtroNivel);
			lstNivel = daoJDBC.obtenerNiveles();

		} catch (Exception e) {			
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de niveles :",e);
		}
		
//		int w = 0;
//		String tmp = "";
//
//		for (; w <= lstNivel.size() - 1; w++) {
//			if (tmp.compareTo(lstNivel.get(w).getDesNiv()) != 0) {
//				niveles.put(lstNivel.get(w).getDesNiv().toUpperCase(), lstNivel.get(w).getDesNiv());
//				tmp = lstNivel.get(w).getCodNiv();
//			}
//		}
		
		// Carga combo de Estudios
//		GenericDao<TiivsEstudio, Object> estudioDAO = (GenericDao<TiivsEstudio, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroEstudio = Busqueda.forClass(TiivsEstudio.class);
//		filtroEstudio.add(Restrictions.eq("activo", '1'));
		try {
//			lstEstudio = estudioDAO.buscarDinamico(filtroEstudio);
			lstEstudio = daoJDBC.obtenerEstudios();
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de estudios: ",e);
		}

//		int j = 0;
//
//		for (; j <= lstEstudio.size() - 1; j++) {
//			estudios.put(lstEstudio.get(j).getDesEstudio().toUpperCase(), lstEstudio.get(j)
//					.getCodEstudio());
//		}
		
		//Carga datos de anio, mes, dia
//		GenericDao<TiivsTiempo, Object> tDAO = (GenericDao<TiivsTiempo, Object>) SpringInit.getApplicationContext().getBean("genericoDao");
//		Busqueda filtroTiempo = Busqueda.forClass(TiivsTiempo.class);

		try {
//			lstTiempo = tDAO.buscarDinamico(filtroTiempo);
			lstTiempo = daoJDBC.obtenerTiempos();
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+" de anio, mes y dia: ",e);
		}	
		
		// Carga data de Solicitud Nivel
		try {
			lstSolNiveles = daoJDBC.obtenerSolicitudesxNiveles();
		} catch (Exception e) {
			logger.error(ConstantesVisado.MENSAJE.OCURRE_ERROR_CARGA_LISTA+"de solicitud x nivel: ",e);
	}
	}
	
	
	public TiivsMultitabla getRowFromMultiTabla(String codTabla, String codElem){
		TiivsMultitabla result=null;
		if(this.lstMultitabla!=null){
			for(TiivsMultitabla multi : this.lstMultitabla){			
				if(multi.getId().equals(new TiivsMultitablaId(codTabla,codElem))){
					result = multi;
					break;
				}
			}	
		}
		return result;
	}	
	
	

	public void setLstMultitabla(List<TiivsMultitabla> lstMultitabla) {
		this.lstMultitabla = lstMultitabla;
	}


//	public List<RangosImporte> getLstRangosImporte() {
//		return lstRangosImporte;
//	}
//
//
//	public void setLstRangosImporte(List<RangosImporte> lstRangosImporte) {
//		this.lstRangosImporte = lstRangosImporte;
//	}


	public List<Estado> getLstEstado() {
		return lstEstado;
	}


	public void setLstEstado(List<Estado> lstEstado) {
		this.lstEstado = lstEstado;
	}


	public List<EstadosNivel> getLstEstadoNivel() {
		return lstEstadoNivel;
	}


	public void setLstEstadoNivel(List<EstadosNivel> lstEstadoNivel) {
		this.lstEstadoNivel = lstEstadoNivel;
	}


//	public List<TiposFecha> getLstTiposFecha() {
//		return lstTiposFecha;
//	}
//
//
//	public void setLstTiposFecha(List<TiposFecha> lstTiposFecha) {
//		this.lstTiposFecha = lstTiposFecha;
//	}


	public List<TiivsEstudio> getLstEstudio() {
		return lstEstudio;
	}


	public void setLstEstudio(List<TiivsEstudio> lstEstudio) {
		this.lstEstudio = lstEstudio;
	}


	public List<TiivsNivel> getLstNivel() {
		return lstNivel;
	}


	public void setLstNivel(List<TiivsNivel> lstNivel) {
		this.lstNivel = lstNivel;
	}


	public List<TiivsOperacionBancaria> getLstOpeBancaria() {
		return lstOpeBancaria;
	}


	public void setLstOpeBancaria(List<TiivsOperacionBancaria> lstOpeBancaria) {
		this.lstOpeBancaria = lstOpeBancaria;
	}


	public List<TiivsTerritorio> getLstTerritorio() {
		return lstTerritorio;
	}


	public void setLstTerritorio(List<TiivsTerritorio> lstTerritorio) {
		this.lstTerritorio = lstTerritorio;
	}


	public List<TiivsOficina1> getLstOficina() {
		return lstOficina;
	}


	public void setLstOficina(List<TiivsOficina1> lstOficina) {
		this.lstOficina = lstOficina;
	}


//	public List<Moneda> getLstMoneda() {
//		return lstMoneda;
//	}
//
//
//	public void setLstMoneda(List<Moneda> lstMoneda) {
//		this.lstMoneda = lstMoneda;
//	}
//
//
//	public Map<String, String> getEstados() {
//		return estados;
//	}
//
//
//	public void setEstados(Map<String, String> estados) {
//		this.estados = estados;
//	}
//
//
//	public Map<String, String> getEstadosNivel() {
//		return estadosNivel;
//	}
//
//
//	public void setEstadosNivel(Map<String, String> estadosNivel) {
//		this.estadosNivel = estadosNivel;
//	}


	public List<ComboDto> getLstClasificacionPersona() {
		return lstClasificacionPersona;
	}


	public void setLstClasificacionPersona(List<ComboDto> lstClasificacionPersona) {
		this.lstClasificacionPersona = lstClasificacionPersona;
	}


//	public List<ComboDto> getLstTipoRegistroPersona() {
//		return lstTipoRegistroPersona;
//	}
//
//
//	public void setLstTipoRegistroPersona(List<ComboDto> lstTipoRegistroPersona) {
//		this.lstTipoRegistroPersona = lstTipoRegistroPersona;
//	}

	

	public List<TiivsTipoSolicitud> getLstTipoSolicitud() {
		return lstTipoSolicitud;
	}

	public void setLstTipoSolicitud(List<TiivsTipoSolicitud> lstTipoSolicitud) {
		this.lstTipoSolicitud = lstTipoSolicitud;
	}

//	public List<TiivsAgrupacionPersona> getLstTiposPersona() {
//		return lstTiposPersona;
//	}
//
//	public void setLstTiposPersona(List<TiivsAgrupacionPersona> lstTiposPersona) {
//		this.lstTiposPersona = lstTiposPersona;
//	}

	public List<TiivsSolicitudOperban> getLstSolOperBan() {
		return lstSolOperBan;
	}

	public void setLstSolOperBan(List<TiivsSolicitudOperban> lstSolOperBan) {
		this.lstSolOperBan = lstSolOperBan;
	}

	public Map<String, String> getTiposSolicitud() {
		return tiposSolicitud;
	}

	public void setTiposSolicitud(Map<String, String> tiposSolicitud) {
		this.tiposSolicitud = tiposSolicitud;
	}

	public List<TiivsOficina1> getLstOficina1() {
		return lstOficina1;
	}

	public void setLstOficina1(List<TiivsOficina1> lstOficina1) {
		this.lstOficina1 = lstOficina1;
	}

	public Map<String, String> getNiveles() {
		return niveles;
	}

	public void setNiveles(Map<String, String> niveles) {
		this.niveles = niveles;
	}

	public Map<String, String> getEstudios() {
		return estudios;
	}

	public void setEstudios(Map<String, String> estudios) {
		this.estudios = estudios;
	}

	public List<TiivsMiembro> getLstAbogados() {
		return lstAbogados;
	}

	public void setLstAbogados(List<TiivsMiembro> lstAbogados) {
		this.lstAbogados = lstAbogados;
	}

	public List<TiivsMultitabla> getLstMultitabla() {
		return lstMultitabla;
	}

	public List<TiivsTiempo> getLstTiempo() {
		return lstTiempo;
	}

	public void setLstTiempo(List<TiivsTiempo> lstTiempo) {
		this.lstTiempo = lstTiempo;
	}

	
	public void setLstSolNiveles(List<TiivsSolicitudNivel> lstSolNiveles) {
		this.lstSolNiveles = lstSolNiveles;
	}


	public List<TiivsSolicitudNivel> getLstSolNiveles() {
		return lstSolNiveles;
	}


//	public TipoDocumento getTmpTipoDoc() {
//		return tmpTipoDoc;
//	}
//
//	public void setTmpTipoDoc(TipoDocumento tmpTipoDoc) {
//		this.tmpTipoDoc = tmpTipoDoc;
//	}
//
//	public List<TipoDocumento> getLstTipoDocumentosExtra() {
//		return lstTipoDocumentosExtra;
//	}
//
//	public void setLstTipoDocumentosExtra(List<TipoDocumento> lstTipoDocumentosExtra) {
//		this.lstTipoDocumentosExtra = lstTipoDocumentosExtra;
//	}
//
//	public List<TipoDocumento> getLstTipoDocumentosExtra2() {
//		return lstTipoDocumentosExtra2;
//	}
//
//	public void setLstTipoDocumentosExtra2(
//			List<TipoDocumento> lstTipoDocumentosExtra2) {
//		this.lstTipoDocumentosExtra2 = lstTipoDocumentosExtra2;
//	}
	
}
