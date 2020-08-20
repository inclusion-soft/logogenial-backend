package com.rc.logogenial.archivosservice.service.interfaz;

import com.rc.logogenial.archivosservice.exception.ResourceNotFoundException;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.net.MalformedURLException;

public interface IArchivoService <T, W>{
        T create( W w) throws IOException;
        T findById(int id) throws ResourceNotFoundException;
        Resource cargar(int idFoto) throws MalformedURLException;
}