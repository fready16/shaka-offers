package com.telefonica.so.commons;

/**
 * 
 * @Author: Jose Plaza
 * @Datecreation: October 2020
 * @FileName: Util.java
 * @AuthorCompany: Telefónica
 * @version: 0.1
 * @Description: Constantes usadas en el servicio de ofertas sugeridas fijas
 */
public class Constants {

    // Header
    public static final String UNICA_SERVICE_ID	= "UNICA-ServiceId";
    public static final String UNICA_TIMESTAMP	= "UNICA-Timestamp";
    
    // Formato Fecha
    public static final String DATE_FORMATTER1 = "yyyy-MM-dd'T'HH:mm:ss-05:00";
    public static final String DATE_FORMATTER2 = "dd/MM/yyyy";
    public static final String ZONE_ID	       = "UTC";

    // Gestión de Log y entornos.
    public static final String NEW_LINE = System.getProperty("line.separator");
    public static final String CLASS_LOG_LABEL = "[Class]: ";
    public static final String METHOD_LOG_LABEL = "[Method]: ";
    public static final String PARAMETERS_LOG_LABEL = "()";
    public static final String INPUT_PARAMETERS_LABEL = "[Input Params]: ";
    public static final String INPUT_PARAMETER_LABEL = "[Input]: ";
    public static final String OUTPUT_LABEL = "[Output Object]: ";
    public static final String SEPARATOR = "===================================================================================================================================================================================";
    public static final String PARSE_JSON_RESPONSE    = "[No se pudo analizar el JSON del response del método (Verificar el Log)]";
    public static final String DEV_ENVIRONMENT	      = "dev";
    public static final String EXCEPTION_WAS_THROWN   = "-> An exception was thrown by method: ";
    public static final String DATE_TIME = "dd/MM/yy ' ' HH:mm:ss";
    
    // TIPOS DE SERVICIO
    public static final String ELEGIBLES = "elegibles";
    public static final String SUGERIDAS = "sugeridas";
    public static final String LANDLINE = "landline";
    public static final String MT = "mt";
    public static final String MOBILE = "mobile";
    public static final String SVA = "sva";
    
    
    private Constants() {

    }

}
