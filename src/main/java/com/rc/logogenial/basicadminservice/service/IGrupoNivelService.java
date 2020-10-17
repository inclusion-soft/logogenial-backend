package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.GrupoNivel;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;

public interface IGrupoNivelService extends IGenericSimpleService<GrupoNivel> {
    public void delete(GrupoNivel nivel) throws ResourceNotFoundException;
    public ResultSearchData<GrupoNivel> Search(PageablePrimitive pag, int grupoId);
    public Iterable<GrupoNivel>  findAllByGrupoId(int grupoId);
}
