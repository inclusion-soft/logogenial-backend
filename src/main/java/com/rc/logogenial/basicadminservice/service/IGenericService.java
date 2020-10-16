package com.rc.logogenial.basicadminservice.service;

import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;

public interface IGenericService<T> {
    T create(T T) throws ResourceFoundException, ResourceNotFoundException;

    void delete(T T) throws ResourceNotFoundException;

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<T> findAll();

    T findById(int id) throws ResourceNotFoundException;

    T update(T T) throws ResourceNotFoundException;

    ResultSearchData<T> findAllSearch(int page, int size, String sortBy, String sortOrder );
}