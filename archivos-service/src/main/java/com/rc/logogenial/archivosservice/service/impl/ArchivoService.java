package com.rc.logogenial.archivosservice.service.impl;

import com.rc.logogenial.archivosservice.entity.Archivo;
import com.rc.logogenial.archivosservice.exception.ResourceNotFoundException;
import com.rc.logogenial.archivosservice.repository.IArchivoRepository;
import com.rc.logogenial.archivosservice.service.interfaz.BaseService;
import com.rc.logogenial.archivosservice.service.interfaz.IArchivoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

@Service
public class ArchivoService extends BaseService<Archivo> implements IArchivoService<Archivo, MultipartFile> {

    @Autowired
    private IArchivoRepository repository;
    private final Logger log = LoggerFactory.getLogger(ArchivoService.class);
    private final static String DIRECTORIO_UPLOAD =  "archivos-service\\uploads" ;


    @Override
    public Archivo create( MultipartFile archivo) throws IOException {
        if(!archivo.isEmpty()){
            Archivo archivoEntidad = new Archivo();
            String nombreArchivo = this.copiarArchivo(archivo);
            archivoEntidad.setNombre(nombreArchivo);
            return repository.save(archivoEntidad);
        }
        throw new IOException("No fue posible registrar el archivo.");
    }

    public String copiarArchivo(MultipartFile archivo)  throws IOException{
        int posicionExtension =  archivo.getOriginalFilename().indexOf(".");
        String extension = archivo.getOriginalFilename().substring(posicionExtension+1);
        String nombreArchivo =archivo.getName() + java.time.LocalDateTime.now().toString().replace(":","_").replace(".","_") + "."+ extension;
        Path rutaArchivo = Paths.get(DIRECTORIO_UPLOAD).resolve(nombreArchivo);
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

    @Override
    public Resource cargar(int idFoto) throws MalformedURLException {
        Archivo archivo = repository.findById(idFoto);
        Resource recurso = null;
        if(archivo != null){
            Path rutaArchivo = Paths.get(DIRECTORIO_UPLOAD).resolve(archivo.getNombre())
                    .toAbsolutePath();
            recurso = new UrlResource(rutaArchivo.toUri());

            //Path rutaArchivo = this.getPath(DIRECTORIO_UPLOAD+ "//"+archivo.getNombre());
            log.info(rutaArchivo.toString());
//            recurso = new UrlResource(rutaArchivo.toUri());

            if (!recurso.exists() && !recurso.isReadable()) {
                rutaArchivo = Paths.get("src/main/resources/static/images").resolve("no-usuario.png").toAbsolutePath();
                recurso = new UrlResource(rutaArchivo.toUri());
                log.error("No se pudo cargar la imagen " + idFoto);
            }
        }
        return recurso;
    }

    public Path getPath(String nombreFoto) {
        return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreFoto).toAbsolutePath();
    }

}

