package com.rc.logenialbackend.service;

import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;

public interface IGenericService<T> {
    T create(T T);

    void delete(T T) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<T> findAll();

    T findById(int id) throws ResourceNotFoundException;

    T update(T T) throws ResourceNotFoundException;

    ResultSearchData<T> findAllSearch(int page, int size, String sortBy, String sortOrder );
}