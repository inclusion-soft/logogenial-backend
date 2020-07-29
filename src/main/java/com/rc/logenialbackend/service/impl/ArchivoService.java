package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.entity.Archivo;
import com.rc.logenialbackend.entity.Categoria;
import com.rc.logenialbackend.entity.Datagenia;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.repository.IArchivoRepository;
import com.rc.logenialbackend.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ArchivoService extends BaseService<Archivo> implements IFileService<Archivo, MultipartFile> {

    @Autowired
    private IArchivoRepository repository;

    @Override
    public Archivo create(Archivo datosArchivo, MultipartFile archivo) throws IOException {
        if(!archivo.isEmpty()){
            String nombreArchivo = archivo.getName() + java.time.LocalDate.now();
            Path rutaArchivo = Paths.get("C:\\dev\\upload-logogenial").resolve(nombreArchivo);
            Files.copy(archivo.getInputStream(),rutaArchivo );
            datosArchivo.setNombre(nombreArchivo);
            return datosArchivo;
        }
        throw new IOException("No fue posible registrar el archivo");
    }

    @Override
    public Archivo findById(int id) throws ResourceNotFoundException {
        Archivo archivo = repository.findById(id);
        if(archivo == null) {
            throw new ResourceNotFoundException("Archivo", "id", Integer.toString(archivo.getId()));
        }
        return archivo;
    }

}

