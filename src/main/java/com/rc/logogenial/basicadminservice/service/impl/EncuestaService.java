package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Encuesta;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.IEncuestaRepository;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IEncuestaService;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class EncuestaService extends BaseService<Encuesta> implements IGenericService<Encuesta>  {
    @Autowired
    private IEncuestaRepository repository;

    @Override
    public Encuesta create(Encuesta encuesta) {
        encuesta.setFechaCreacion( new Date());
        return repository.save(encuesta);
    }

    @Override
    public void delete(Encuesta encuesta) throws ResourceNotFoundException {
        if (repository.findById(encuesta.getId()).isPresent()) {
            repository.delete(encuesta);
        }
        throw new ResourceNotFoundException("encuesta", "id", Integer.toString(encuesta.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("encuesta", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Encuesta> findAll() {
        return repository.findAll();
    }

    @Override
    public Encuesta findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        } else {
            throw new ResourceNotFoundException("encuesta", "id", Integer.toString(id));
        }
    }

    @Override
    public Encuesta update(Encuesta encuesta) throws ResourceNotFoundException {
        if (repository.findById(encuesta.getId()).isPresent()) {
            return repository.save(encuesta);
        }
        throw new ResourceNotFoundException("encuesta", "id", Integer.toString(encuesta.getId()));
    }

    @Override
    public ResultSearchData<Encuesta> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, sortOrder.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending());
        Page<Encuesta> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Encuesta>) this.getResultSearch(pagedResult);
    }

}
