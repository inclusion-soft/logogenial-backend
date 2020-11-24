package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.OpcionRespuesta;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.service.IOpcionRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/opcion-respuestas-api" })
@CrossOrigin(origins= {"*"})
public class OpcionRespuestaController {

    @Autowired
    private IOpcionRespuestaService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<OpcionRespuesta> create(@RequestBody OpcionRespuesta grupoNivelTema) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(grupoNivelTema), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<OpcionRespuesta> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<OpcionRespuesta> update(@RequestBody OpcionRespuesta grupoNivelTema) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(grupoNivelTema), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<OpcionRespuesta>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findAllByPreguntaId/{id}")
    public ResponseEntity<Iterable<OpcionRespuesta>> findAllByPreguntaId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByPregunta_Id(id), HttpStatus.OK);
    }

}
