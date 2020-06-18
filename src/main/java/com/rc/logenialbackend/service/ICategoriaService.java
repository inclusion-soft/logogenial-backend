package com.rc.logenialbackend.service;

import com.rc.logenialbackend.entity.Categoria;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;

public interface ICategoriaService {
    public Categoria findByName(String username) throws ResourceNotFoundException;

    Categoria create(Categoria Categoria);

    void delete(Categoria Categoria) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<Categoria> findAll();

    Categoria findById(int id) throws ResourceNotFoundException;

    Categoria update(Categoria Categoria) throws ResourceNotFoundException;

    ResultSearchData<Categoria> findAllSearch(int page, int size, String orderBy, String sort);
}

