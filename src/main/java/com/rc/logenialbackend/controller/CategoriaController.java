package com.rc.logenialbackend.controller;

import com.rc.logenialbackend.entity.Categoria;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.service.IGenericSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/categoria-api" })
@CrossOrigin(origins= {"*"})
public class CategoriaController  {

    @Autowired
    private IGenericSimpleService<Categoria> service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Categoria> create(@RequestBody Categoria Categoria) {
        return new ResponseEntity<>(service.create(Categoria), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Categoria> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Categoria> update(@RequestBody Categoria Categoria) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(Categoria), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<Object> delete(@RequestParam int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Categoria>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

}
