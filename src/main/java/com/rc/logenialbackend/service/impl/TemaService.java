package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.entity.Tema;
import com.rc.logenialbackend.entity.Tema;
import com.rc.logenialbackend.entity.Tema;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.repository.ITemaRepository;
import com.rc.logenialbackend.model.shared.ResultSearchData;
import com.rc.logenialbackend.service.IGenericService;
import com.rc.logenialbackend.service.IGenericSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService extends BaseService<Tema> implements IGenericService<Tema> {

    @Autowired
    private ITemaRepository repository;

    @Override
    public Tema create(Tema Tema) {
        return repository.save(Tema);
    }

    @Override
    public void delete(Tema tema) throws ResourceNotFoundException {
        if (repository.findById(tema.getId()).isPresent()) {
            repository.delete(tema);
        }
        throw new ResourceNotFoundException("nema", "id", Integer.toString(tema.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            repository.deleteById(id);
        }
        else
        {
            throw new ResourceNotFoundException("Tema", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Tema> findAll() {
        List<Tema> lista = (List<Tema>) repository.findAll();
        return lista;
    }

    @Override
    public Tema findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            return repository.findById(id).get();
        }
        else
        {
            throw new ResourceNotFoundException("Tema", "id",  Integer.toString(id));
        }
    }

    @Override
    public Tema update(Tema Tema) throws ResourceNotFoundException {
        if (repository.findById(Tema.getId()).isPresent())
        {
            return repository.save(Tema);
        }
        throw new ResourceNotFoundException("Tema", "id", Integer.toString(Tema.getId()));
    }

    @Override
    public ResultSearchData<Tema> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, sortOrder.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending());
        Page<Tema> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Tema>) this.getResultSearch(pagedResult);
    }
}
