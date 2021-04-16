package com.rc.logogenial.basicadminservice.exception;


public class CustomApplicationException extends Exception {
    private static final long serialVersionUID = 1L;

    private static String mensaje;

    public CustomApplicationException(String... exceptionMsg) {
        super(llenarMensaje(exceptionMsg));
    }

    private static String llenarMensaje(String... exceptionMsg) {
        mensaje = "";
        for (String data : exceptionMsg) {
            mensaje = mensaje + data;
        }
        //Logs.LOG_ERRORES.error(mensaje);
        return mensaje;
    }
}
