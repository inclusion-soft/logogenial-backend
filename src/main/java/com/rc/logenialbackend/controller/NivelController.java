package com.rc.logenialbackend.controller;

import com.rc.logenialbackend.entity.Nivel;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;
import com.rc.logenialbackend.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/nivel-api" })
@CrossOrigin(origins= {"*"})
public class NivelController {

    @Autowired
    private IGenericService<Nivel> service;

    @PostMapping
    public ResponseEntity<Nivel> create(@RequestBody Nivel Nivel) {
        return new ResponseEntity<>(service.create(Nivel), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Nivel> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Nivel> update(@RequestBody Nivel Nivel) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(Nivel), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Nivel>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<Nivel>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                              @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder ) {
        ResultSearchData<Nivel> datos = service.findAllSearch(page, size,sortBy, sortOrder);
        return new ResponseEntity<ResultSearchData<Nivel>>(datos, new HttpHeaders(), HttpStatus.OK);
    }
}
