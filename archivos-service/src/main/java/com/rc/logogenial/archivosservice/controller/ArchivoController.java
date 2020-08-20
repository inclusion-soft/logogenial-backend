package com.rc.logogenial.archivosservice.controller;

import com.rc.logogenial.archivosservice.entity.Archivo;
import com.rc.logogenial.archivosservice.exception.ResourceNotFoundException;
import com.rc.logogenial.archivosservice.service.interfaz.IArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import java.io.IOException;
import java.net.MalformedURLException;

@RestController
@RequestMapping({ "v1/archivo-api" })
@CrossOrigin(origins= {"*"})
public class ArchivoController {
    @Autowired
    private IArchivoService<Archivo, MultipartFile> service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(
            //@RequestBody Archivo data,
            @RequestParam("archivo") MultipartFile archivo)
            throws IOException
    {
        return new ResponseEntity<>(service.create( archivo), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Archivo> findById(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/uploads/img/{idFoto}")
    public ResponseEntity<Resource> verFoto(@PathVariable int idFoto) throws MalformedURLException {

        Resource recurso = null;
        recurso = service.cargar(idFoto);

        // para que se pueda descargar
        HttpHeaders cabecera = new HttpHeaders();
        if(recurso != null){
            cabecera.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\""+ recurso.getFilename() +"\"");
        }
        return new  ResponseEntity<Resource>(recurso,cabecera, HttpStatus.OK);
    }

}

