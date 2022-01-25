package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.Encuesta;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.service.IEncuestaService;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/encuesta-api" })
@CrossOrigin(origins= {"*"})
public class EncuestaController {

    @Autowired
    private IGenericService<Encuesta> service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Encuesta> create(@RequestBody Encuesta encuesta) throws ResourceFoundException, ResourceNotFoundException {
        return new ResponseEntity<>(service.create(encuesta), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Encuesta> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Encuesta> update(@RequestBody Encuesta encuesta) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(encuesta), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Encuesta>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

}
