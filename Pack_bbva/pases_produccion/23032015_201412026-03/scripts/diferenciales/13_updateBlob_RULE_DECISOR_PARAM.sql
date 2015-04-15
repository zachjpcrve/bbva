spool 13_updateBlob_RULE_DECISOR_PARAM.log

DECLARE
  TMP_BLOB BLOB := EMPTY_BLOB();
  SRC_CHUNK_01 RAW(32767);
BEGIN
  SRC_CHUNK_01 := UTL_RAW.CAST_TO_RAW('[{"class":"com.bbva.batch.util.DeciderParam","name":"PB_RUTA_ARCHIVO","query":"SELECT VALOR_VARIABLE FROM CONELE.TBL_CE_IBM_PARAMETROS_CONF WHERE CODIGO_APLICATIVO=1000 AND NOMBRE_VARIABLE=\u0027PB_RUTA_ARCHIVO\u0027","value":null},{"class":"com.bbva.batch.util.DeciderParam","name":"PB_NOMBRE_ARCHIVO","query":"SELECT VALOR_VARIABLE FROM CONELE.TBL_CE_IBM_PARAMETROS_CONF WHERE CODIGO_APLICATIVO=1000 AND NOMBRE_VARIABLE=\u0027PB_NOMBRE_ARCHIVO\u0027","value":null},{"class":"com.bbva.batch.util.DeciderParam","name":"PB_FORMATO_FECHA_SUFIJO","query":"SELECT VALOR_VARIABLE FROM CONELE.TBL_CE_IBM_PARAMETROS_CONF WHERE CODIGO_APLICATIVO=1000 AND NOMBRE_VARIABLE=\u0027PB_FORMATO_FECHA_SUFIJO\u0027","value":null},{"class":"com.bbva.batch.util.DeciderParam","name":"PB_MESES_ANTERIORES","query":"SELECT VALOR_VARIABLE FROM CONELE.TBL_CE_IBM_PARAMETROS_CONF WHERE CODIGO_APLICATIVO=1000 AND NOMBRE_VARIABLE=\u0027PB_MESES_ANTERIORES\u0027","value":null}]');

  UPDATE CONELE.MNTR_PARAMETRO SET BINARIO = EMPTY_BLOB() WHERE ID = 18;

  SELECT BINARIO INTO TMP_BLOB
  FROM CONELE.MNTR_PARAMETRO
  WHERE ID = 18 FOR UPDATE;
  
  DBMS_LOB.WRITEAPPEND(TMP_BLOB, UTL_RAW.LENGTH(SRC_CHUNK_01), SRC_CHUNK_01);

  UPDATE CONELE.MNTR_PARAMETRO
  SET 
    BINARIO = (SELECT BINARIO FROM CONELE.MNTR_PARAMETRO WHERE ID = 18)
  WHERE ID IN(43, 27, 34); 

  COMMIT;
END;
/

spool off