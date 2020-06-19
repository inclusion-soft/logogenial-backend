package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.entity.Categoria;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.repository.ICategoriaRepository;
import com.rc.logenialbackend.service.IGenericSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService extends BaseService<Categoria> implements IGenericSimpleService<Categoria> {

    @Autowired
    private ICategoriaRepository repository;

    @Override
    public Categoria create(Categoria Categoria) {
        return repository.save(Categoria);
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            repository.deleteById(id);
        }
        else
        {
            throw new ResourceNotFoundException("Categoria", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Categoria> findAll() {
        List<Categoria> lista = (List<Categoria>) repository.findAll();
        return lista;
    }

    @Override
    public Categoria findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            return repository.findById(id).get();
        }
        else
        {
            throw new ResourceNotFoundException("Categoria", "id",  Integer.toString(id));
        }
    }

    @Override
    public Categoria update(Categoria Categoria) throws ResourceNotFoundException {
        if (repository.findById(Categoria.getId()).isPresent())
        {
            return repository.save(Categoria);
        }
        throw new ResourceNotFoundException("Categoria", "id", Integer.toString(Categoria.getId()));
    }
}
