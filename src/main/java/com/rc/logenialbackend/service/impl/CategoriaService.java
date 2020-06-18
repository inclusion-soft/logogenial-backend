package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.entity.Categoria;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;
import com.rc.logenialbackend.model.repository.ICategoriaRepository;
import com.rc.logenialbackend.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService extends BaseService<Categoria> implements ICategoriaService {

    @Autowired
    private ICategoriaRepository repository;

    @Override
    public Categoria findByName(String nombre) throws ResourceNotFoundException {
        if (repository.findByNombre(nombre) == null)
        {
            return repository.findByNombre(nombre) ;
        }
        else
        {
            throw new ResourceNotFoundException("Categoria", "nombre",  nombre);
        }
    }

    @Override
    public Categoria create(Categoria Categoria) {
        return repository.save(Categoria);
    }

    @Override
    public void delete(Categoria Categoria) throws ResourceNotFoundException {
        if (repository.findById(Categoria.getId()).isPresent())
        {
            repository.delete(Categoria);
        }
        throw new ResourceNotFoundException("Categoria", "id",  Integer.toString(Categoria.getId()));
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

    @Override
    public ResultSearchData<Categoria> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, sortOrder.equals("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending() );
        Page<Categoria> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Categoria>) this.getResultSearch(pagedResult);
    }

}
