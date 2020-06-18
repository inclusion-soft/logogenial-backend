package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.dto.Persona;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.repository.PersonaRepository;
import com.rc.logenialbackend.model.shared.ResultSearchData;
import com.rc.logenialbackend.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends BaseService<Persona> implements IPersonaService {
    @Autowired
    private PersonaRepository repository;

    @Override
    public Persona create(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(Persona persona) throws ResourceNotFoundException {
        if (repository.findById(persona.getId()).isPresent()) {
            repository.delete(persona);
        }
        throw new ResourceNotFoundException("User", "id", Integer.toString(persona.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("User", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Persona findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        } else {
            throw new ResourceNotFoundException("User", "id", Integer.toString(id));
        }
    }

    @Override
    public Persona update(Persona persona) throws ResourceNotFoundException {
        if (repository.findById(persona.getId()).isPresent()) {
            return repository.save(persona);
        }
        throw new ResourceNotFoundException("User", "id", Integer.toString(persona.getId()));
    }

    @Override
    public ResultSearchData<Persona> findAllSearch(int page, int size) {
        Pageable paging = PageRequest.of(page, size);
        Page<Persona> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Persona>) this.getResultSearch(pagedResult);
    }

}
