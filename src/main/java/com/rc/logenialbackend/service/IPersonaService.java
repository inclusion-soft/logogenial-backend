package com.rc.logenialbackend.service;

import com.rc.logenialbackend.dto.Persona;
import com.rc.logenialbackend.exception.ResourceNotFoundException;

public interface IPersonaService {
    Persona create(Persona Persona);

    void delete(Persona Persona) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<Persona> findAll();

    Persona findById(int id) throws ResourceNotFoundException;

    Persona update(Persona Persona) throws ResourceNotFoundException;
}
