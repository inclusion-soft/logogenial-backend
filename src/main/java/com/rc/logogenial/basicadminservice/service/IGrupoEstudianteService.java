package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.GrupoEstudiante;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IGrupoEstudianteService extends IGenericSimpleService<GrupoEstudiante> {
    public List<GrupoEstudiante> findAllByEstudianteId(int grupoId);
}
