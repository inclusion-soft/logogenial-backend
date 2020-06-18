package com.rc.logenialbackend.service;

import com.rc.logenialbackend.dto.Persona;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;

public interface IPersonaService<T> {
    Persona create(Persona Persona);

    void delete(Persona Persona) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<Persona> findAll();

    Persona findById(int id) throws ResourceNotFoundException;

    Persona update(Persona Persona) throws ResourceNotFoundException;

    ResultSearchData<Persona> findAllSearch(int page, int size);
}
