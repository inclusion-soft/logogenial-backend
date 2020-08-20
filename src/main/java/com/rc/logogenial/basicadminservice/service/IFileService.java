package com.rc.logogenial.basicadminservice.service;

import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

import java.io.IOException;

public interface IFileService<T, W>{
    T create(T T, W w) throws IOException;
    T findById(int id) throws ResourceNotFoundException;
}
