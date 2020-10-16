package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.GrupoEstudiante;
import com.rc.logogenial.basicadminservice.entity.Pregunta;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGrupoEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/grupo-estudiante-api" })
@CrossOrigin(origins= {"*"})
public class GrupoEstudianteController {

    @Autowired
    private IGrupoEstudianteService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GrupoEstudiante> create(@RequestBody GrupoEstudiante Niveles) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(Niveles), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<GrupoEstudiante> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<GrupoEstudiante> update(@RequestBody GrupoEstudiante Niveles) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(Niveles), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<GrupoEstudiante>> findAllByEstudianteId() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findAllByEstudianteId/{id}")
    public ResponseEntity<Iterable<GrupoEstudiante>> findAllByEstudianteId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByEstudianteId(id), HttpStatus.OK);
    }

}
