package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.GrupoEstudiante;

import java.util.List;

public interface IGrupoEstudianteService extends IGenericService<GrupoEstudiante> {
    public List<GrupoEstudiante> findAllByEstudianteId(int grupoId);
}
