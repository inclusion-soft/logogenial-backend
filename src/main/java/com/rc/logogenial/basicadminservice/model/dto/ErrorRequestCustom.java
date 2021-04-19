package com.rc.logogenial.basicadminservice.model.dto;

import lombok.Data;

@Data
public class ErrorRequestCustom {
    String timestamp;
    int status;
    String  error;
    String excepcion;
    String message;
}
