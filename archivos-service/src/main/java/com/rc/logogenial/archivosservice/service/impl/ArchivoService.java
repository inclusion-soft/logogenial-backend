package com.rc.logogenial.archivosservice.service.impl;

import com.rc.logogenial.archivosservice.entity.Archivo;
import com.rc.logogenial.archivosservice.exception.ResourceNotFoundException;
import com.rc.logogenial.archivosservice.repository.IArchivoRepository;
import com.rc.logogenial.archivosservice.service.interfaz.BaseService;
import com.rc.logogenial.archivosservice.service.interfaz.IArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class ArchivoService extends BaseService<Archivo> implements IArchivoService<Archivo, MultipartFile> {

    @Autowired
    private IArchivoRepository repository;

    @Override
    public Archivo create( MultipartFile archivo) throws IOException {
        if(!archivo.isEmpty()){
            Archivo archivoEntidad = new Archivo();
            String nombreArchivo = this.copiarArchivo(archivo);
            archivoEntidad.setNombre(nombreArchivo);
            return repository.save(archivoEntidad);
        }
        throw new IOException("No fue posible registrar el archivo");
    }

    public String copiarArchivo(MultipartFile archivo)  throws IOException{
        int posicionExtension =  archivo.getOriginalFilename().indexOf(".");
        String extension = archivo.getOriginalFilename().substring(posicionExtension+1);
        String nombreArchivo =archivo.getName() + java.time.LocalDateTime.now().toString().replace(":","_").replace(".","_") + "."+ extension;
        Path rutaArchivo = Paths.get("C:\\dev\\upload-logogenial").resolve(nombreArchivo);
        Files.copy(archivo.getInputStream(),rutaArchivo );
        return  nombreArchivo;
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

