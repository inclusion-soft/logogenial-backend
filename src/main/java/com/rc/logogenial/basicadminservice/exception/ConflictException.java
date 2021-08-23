package com.rc.logogenial.basicadminservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ConflictException extends Exception{

    public ConflictException(String error) {
        super(String.format("%s Error de comunicación de servicio: Error:'%s'",  error));
    }
}
