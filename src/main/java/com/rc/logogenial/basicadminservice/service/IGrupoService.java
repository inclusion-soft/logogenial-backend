package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;

public interface IGrupoService extends IGenericService<Grupo> {
    public void delete(Grupo nivel) throws ResourceNotFoundException;
    //ResultSearchData<Grupo> findAllSearch(int page, int size, String sortBy, String sortOrder );
    Iterable<Grupo> findAllByEstudianteId(int id);
}
