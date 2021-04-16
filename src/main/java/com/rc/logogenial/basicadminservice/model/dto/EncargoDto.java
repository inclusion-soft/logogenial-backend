package com.rc.logogenial.basicadminservice.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class EncargoDto {
    Long idProyecto;
    String idConstructora;
    String nombreProyecto;
    String numeroEncargo;
    String estadoUnidad;
    int unidadInmobiliaria;
    List<TerceroDto> terceros;
}
