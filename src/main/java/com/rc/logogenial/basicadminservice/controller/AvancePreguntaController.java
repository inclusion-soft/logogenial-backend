package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.AvancePregunta;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.service.IAvancePreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/avance-pregunta-api" })
@CrossOrigin(origins= {"*"})
public class AvancePreguntaController {

    @Autowired
    private IAvancePreguntaService service;

    @PostMapping
    public ResponseEntity<AvancePregunta> create(@RequestBody AvancePregunta avancePregunta) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(avancePregunta), HttpStatus.OK);
    }

    @GetMapping("/findAllByEstudianteId/{id}")
    public ResponseEntity<Iterable<AvancePregunta>> findAllByEstudianteId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByEstudianteId(id), HttpStatus.OK);
    }

}
