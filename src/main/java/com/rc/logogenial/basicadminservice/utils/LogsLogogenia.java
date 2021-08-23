package com.rc.logogenial.basicadminservice.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogsLogogenia {

    public LogsLogogenia(){
        // No requiere implementacion
    }

    private static final Logger LOG = LoggerFactory.getLogger(LogsLogogenia.class);

    public static void info(String mensaje){
        LOG.info(mensaje);
    }

    public static void warning(String mensaje){
        LOG.warn(mensaje);
    }

    public static void error(String mensaje){
        LOG.error(mensaje);
    }
}
