package com.rc.logenialbackend.service;

import com.rc.logenialbackend.dto.Persona;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IPersonaService {
    Persona create(Persona Persona);

    void delete(Persona Persona) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<Persona> findAll();

    Persona findById(int id) throws ResourceNotFoundException;

    Persona update(Persona Persona) throws ResourceNotFoundException;

    List<Persona> findAllSearch(int page, int size);
}
