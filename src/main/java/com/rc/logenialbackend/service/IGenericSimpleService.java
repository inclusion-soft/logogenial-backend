package com.rc.logenialbackend.service;

import com.rc.logenialbackend.exception.ResourceNotFoundException;

public interface IGenericSimpleService<T>{
    T create(T T);

    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<T> findAll();

    T findById(int id) throws ResourceNotFoundException;

    T update(T T) throws ResourceNotFoundException;
}