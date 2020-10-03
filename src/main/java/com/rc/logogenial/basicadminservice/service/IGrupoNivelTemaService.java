package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.GrupoNivelTema;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;

public interface IGrupoNivelTemaService extends IGenericSimpleService<GrupoNivelTema> {
    public void delete(GrupoNivelTema nivel) throws ResourceNotFoundException;
    public ResultSearchData<GrupoNivelTema> Search(PageablePrimitive pag, int grupoId);
}
