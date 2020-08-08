package com.rc.logogenial.archivosservice.service.interfaz;

import com.rc.logogenial.archivosservice.exception.ResourceNotFoundException;

import java.io.IOException;

public interface IArchivoService <T, W>{
        T create( W w) throws IOException;
        T findById(int id) throws ResourceNotFoundException;
}