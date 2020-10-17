package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.entity.LeccionConsulta;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

public interface ILeccionConsultaService  {
    Iterable<LeccionConsulta> findAllByGrupoNivelTemaId(int id);
}
