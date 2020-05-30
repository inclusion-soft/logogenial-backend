package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.entity.Usuario;
import com.rc.logenialbackend.exception.ResourceNotFoundException;

import com.rc.logenialbackend.model.ResultSearchData;
import com.rc.logenialbackend.model.UsuarioRepository;
import com.rc.logenialbackend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class UsuarioService extends  BaseService<Usuario> implements IUsuarioService {
    @Autowired
    private UsuarioRepository repository;
    @Override
    public Usuario create(Usuario Usuario) {
        return repository.save(Usuario);
    }

    @Override
    public void delete(Usuario Usuario) throws ResourceNotFoundException {
        if (repository.findById(Usuario.getId()).isPresent())
        {
            repository.delete(Usuario);
        }
        throw new ResourceNotFoundException("User", "id",  Integer.toString(Usuario.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            repository.deleteById(id);
        }
        else
        {
            throw new ResourceNotFoundException("User", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Usuario> findAll() {
        return repository.findAll();
    }

    @Override
    public Usuario findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            return repository.findById(id).get();
        }
        else
        {
            throw new ResourceNotFoundException("User", "id",  Integer.toString(id));
        }
    }

    @Override
    public Usuario update(Usuario Usuario) throws ResourceNotFoundException {
        if (repository.findById(Usuario.getId()).isPresent())
        {
            return repository.save(Usuario);
        }
        throw new ResourceNotFoundException("User", "id", Integer.toString(Usuario.getId()));
    }

    @Override
    public ResultSearchData<Usuario> findAllSearch(int page, int size) {
        Pageable paging = PageRequest.of(page, size
                //        , Sort.by(sortBy)
        );

        Page<Usuario> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Usuario>) this.getResultSearch(pagedResult);

    }

}
