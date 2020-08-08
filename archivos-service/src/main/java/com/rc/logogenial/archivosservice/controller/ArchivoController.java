package com.rc.logogenial.archivosservice.controller;

import com.rc.logogenial.archivosservice.entity.Archivo;
import com.rc.logogenial.archivosservice.exception.ResourceNotFoundException;
import com.rc.logogenial.archivosservice.service.interfaz.IArchivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

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

}

