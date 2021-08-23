package com.rc.logogenial.basicadminservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_GATEWAY)
public class BadCommunicationException extends Exception{

    public BadCommunicationException(String error, String ruta) {
        super(String.format("%s Error al comunicarse con la ruta: %s. Error:'%s'",  ruta, error));
    }

    public BadCommunicationException(String error) {
        super(String.format("%s Error de comunicación de servicio: Error:'%s'",  error));
    }
}
