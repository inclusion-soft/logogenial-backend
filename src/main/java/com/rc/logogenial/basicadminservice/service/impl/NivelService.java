package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Nivel;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.INivelRepository;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class NivelService extends BaseService<Nivel> implements IGenericService<Nivel> {
    @Autowired
    private INivelRepository repository;

    @Override
    public Nivel create(Nivel nivel) {

        return repository.save(nivel);
    }

    @Override
    public void delete(Nivel nivel) throws ResourceNotFoundException {
        if (repository.findById(nivel.getId()).isPresent()) {
            repository.delete(nivel);
        }
        throw new ResourceNotFoundException("nivel", "id", Integer.toString(nivel.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("nivel", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Nivel> findAll() {
        return repository.findAll();
    }

    @Override
    public Nivel findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent()) {
            return repository.findById(id).get();
        } else {
            throw new ResourceNotFoundException("nivel", "id", Integer.toString(id));
        }
    }

    @Override
    public Nivel update(Nivel nivel) throws ResourceNotFoundException {
        if (repository.findById(nivel.getId()).isPresent()) {
            return repository.save(nivel);
        }
        throw new ResourceNotFoundException("nivel", "id", Integer.toString(nivel.getId()));
    }

    @Override
    public ResultSearchData<Nivel> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, sortOrder.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending());
        Page<Nivel> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Nivel>) this.getResultSearch(pagedResult);
    }

}
