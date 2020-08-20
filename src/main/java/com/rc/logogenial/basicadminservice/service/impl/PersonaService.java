package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.dto.Persona;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.PersonaRepository;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class PersonaService extends BaseService<Persona> implements IGenericService<Persona> {
    @Autowired
    private PersonaRepository repository;

    @Override
    public Persona create(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(Persona T) throws ResourceNotFoundException {

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
    public ResultSearchData<Persona> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, sortOrder.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending());
        Page<Persona> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Persona>) this.getResultSearch(pagedResult);
    }

}
