package com.rc.logogenial.basicadminservice.model.dto.RegistroTercero;

import lombok.Data;

import java.util.Date;

@Data
public class CreacionTerceroDto {
    private String id;
    private String numeroDocumento;
    private String tipoDocumento;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String correo;
    private Date fechaNacimiento;
    private String nacionalidad;
    private String idTIpoForm;
    private String token;
    private boolean marcaPrecioEncargo;
    private String codProyecto;
    private String numeroEncargo;
    private Integer unidad;
}

