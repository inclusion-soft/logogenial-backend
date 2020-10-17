package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import com.rc.logogenial.basicadminservice.service.IGrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/grupo-api" })
@CrossOrigin(origins= {"*"})
public class GrupoController {

    @Autowired
    private IGrupoService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Grupo> create(@RequestBody Grupo Grupo) throws ResourceFoundException, ResourceNotFoundException {
        return new ResponseEntity<>(service.create(Grupo), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Grupo> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Grupo> update(@RequestBody Grupo Grupo) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(Grupo), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Grupo>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findAllByEstudianteId/{id}")
    public ResponseEntity<Iterable<Grupo>> findAllByEstudianteId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByEstudianteId(id), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<Grupo>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                          @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder ) {
        ResultSearchData<Grupo> datos = service.findAllSearch(page, size,sortBy, sortOrder);
        return new ResponseEntity<ResultSearchData<Grupo>>(datos, new HttpHeaders(), HttpStatus.OK);
    }

}
