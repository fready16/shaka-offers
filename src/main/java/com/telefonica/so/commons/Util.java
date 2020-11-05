package com.telefonica.so.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * 
 * @Author: Jose Plaza
 * @Datecreation: October
 * @FileName: Util.java
 * @AuthorCompany: Telefónica
 * @version: 0.1
 * @Description: Métodos útiles del enrutador
 */
@Component
public class Util {

    private static final Logger LOGGER = LogManager.getLogger(Util.class);

    /**
     * Transformar fecha date a string con formato: yyyy-MM-dd'T'HH:mm:ss-05:00
     * 
     * @param datetime
     * @return String
     */
    public static String getStringDateFormatter1(Date datetime) {
	if (datetime != null) {
	    ZonedDateTime date = datetime.toInstant().atZone(ZoneId.of(Constants.ZONE_ID));
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.DATE_FORMATTER1);
	    return date.toLocalDateTime().format(formatter);
	}
	return null;
    }

    /**
     * Transformar fecha date a string
     * 
     * @param date
     * @param format
     * @return String fecha
     */
    public static String getStringFromDate(Date date, String format) {
	SimpleDateFormat sdf = new SimpleDateFormat(format);
	return sdf.format(date);
    }

    /**
     * Transformar fecha string a date
     * 
     * @param String
     * @param SimpleDateFormat
     * @return Date
     */
    public static Date getDateFromString(String date, SimpleDateFormat formatter) {
	if (date != null) {
	    try {
		return formatter.parse(date);
	    } catch (ParseException e) {
		LOGGER.error(e);
	    }
	}
	return null;
    }

    /**
     * 
     * @param dataFormat
     * @return SimpleDateFormat
     */
    public static SimpleDateFormat getSimpleDateFormat(String dataFormat) {

	return new SimpleDateFormat(dataFormat);
    }


    /**
     * Método que devuelve la fecha actual en formato gregoriano.
     * 
     * @return Fecha actual en formato gregoriano.
     */
    public static GregorianCalendar getGCalendar() {
	GregorianCalendar gCalendar = new GregorianCalendar();
	gCalendar.setTime(new Date());
	return gCalendar;
    }

    /**
     * 
     * @param obj
     * @return true si el objeto no es null
     */
    public static boolean isNotNull(Object obj) {
	return obj != null;
    }

    /**
     * 
     * @param obj
     * @return true si el string no es null ni vacío
     */
    public static boolean isNotNullNorEmpty(String obj) {
	return (obj != null && !obj.trim().isEmpty());
    }

    /**
     * 
     * @param text
     * @param beginIndex
     * @param endIndex
     * @return cadena extraída
     */
    public static String substring(String text, int beginIndex, int endIndex) {
	return text.substring(beginIndex > text.length() ? text.length() : beginIndex, endIndex > text.length() ? text.length() : endIndex);
    }

    /**
     * 
     * @param value
     * @param options
     * @return boolean true si el valor contiene algún option
     */
    public static boolean containsIgnoreCase(String value, String... options) {
	for (String option : options) {
	    if (value != null && value.toUpperCase().contains(option.toUpperCase())) {
		return true;
	    }
	}
	return false;
    }

    public static String getTracking() {
	return Thread.currentThread().getName();
    }

    /**
     * Método de formato de fecha y hora utilizado en la clase LoggingAspect.
     * 
     * @return date
     */
    public static String getDateTimeFormatter() {
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(Constants.DATE_TIME);
	LocalDateTime localDateTime = LocalDateTime.now();
	return dateTimeFormatter.format(localDateTime);
    }
    private Util() {

    }

}
