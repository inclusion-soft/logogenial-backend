package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.Niveles;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;

public interface INivelesService extends IGenericSimpleService<Niveles> {
    public void delete(Niveles nivel) throws ResourceNotFoundException;
    public ResultSearchData<Niveles> Search(PageablePrimitive pag, int grupoId);
}
