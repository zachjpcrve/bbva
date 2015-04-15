spool 12_updateBlob_DECISOR_PARAM.log

DECLARE
  TMP_BLOB BLOB := EMPTY_BLOB();
  SRC_CHUNK_01 RAW(32767);
BEGIN
  SRC_CHUNK_01 := UTL_RAW.CAST_TO_RAW('[{"class":"com.bbva.batch.util.DeciderParam","name":"flagIICE","query":"SELECT VALOR_VARIABLE FROM CONELE.TBL_CE_IBM_PARAMETROS_CONF WHERE CODIGO_APLICATIVO=1000 AND NOMBRE_VARIABLE=\u0027PB_APAGAR_APLICACION_PLD\u0027","value":null}]');

  UPDATE CONELE.MNTR_PARAMETRO SET BINARIO = EMPTY_BLOB() WHERE ID = 14;

  SELECT BINARIO INTO TMP_BLOB
  FROM CONELE.MNTR_PARAMETRO
  WHERE ID = 14 FOR UPDATE;
  
  DBMS_LOB.WRITEAPPEND(TMP_BLOB, UTL_RAW.LENGTH(SRC_CHUNK_01), SRC_CHUNK_01);

  COMMIT;
END;
/

spool off