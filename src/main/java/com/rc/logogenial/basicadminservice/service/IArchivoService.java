package com.rc.logogenial.basicadminservice.service;

import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
public interface IArchivoService <T, W>{
    T create( W w) throws IOException;
    T findById(int id) throws ResourceNotFoundException;
    Resource cargar(int idFoto) throws MalformedURLException;
}