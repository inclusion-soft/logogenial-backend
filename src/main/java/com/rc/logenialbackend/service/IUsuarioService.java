package com.rc.logenialbackend.service;

import com.rc.logenialbackend.entity.Usuario;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.ResultSearchData;

public interface IUsuarioService {

    public Usuario findByUsername(String username);

    Usuario create(Usuario Usuario);

    void delete(Usuario Usuario) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<Usuario> findAll();

    Usuario findById(int id) throws ResourceNotFoundException;

    Usuario update(Usuario Usuario) throws ResourceNotFoundException;

    ResultSearchData<Usuario> findAllSearch(int page, int size);
}