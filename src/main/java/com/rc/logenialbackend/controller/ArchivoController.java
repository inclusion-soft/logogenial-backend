package com.rc.logenialbackend.controller;

import com.rc.logenialbackend.entity.Archivo;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.service.IFileService;
import com.rc.logenialbackend.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RequestMapping({ "/archivo-api" })
@CrossOrigin(origins= {"*"})
public class ArchivoController {
    @Autowired
    private IFileService<Archivo, MultipartFile> service;

    @PostMapping("/create")
    public ResponseEntity<Archivo> create(
            @RequestBody Archivo data,
            @RequestParam("archivo") MultipartFile archivo)
            throws IOException
    {
        return new ResponseEntity<>(service.create(data,archivo), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Archivo> findById(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

}
