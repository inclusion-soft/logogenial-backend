package com.rc.logenialbackend.controller;

import com.rc.logenialbackend.entity.Categoria;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.ResultSearchData;
import com.rc.logenialbackend.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/categoria-api" })
@CrossOrigin(origins= {"*"})
public class CategoriaController  {

    @Autowired
    private ICategoriaService service;

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

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody Categoria Categoria) throws ResourceNotFoundException {
        service.delete(Categoria);
        return new ResponseEntity<>(HttpStatus.OK);
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

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<Categoria>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                              @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder ) {
        ResultSearchData<Categoria> datos = service.findAllSearch(page, size,sortBy, sortOrder);
        return new ResponseEntity<ResultSearchData<Categoria>>(datos, new HttpHeaders(), HttpStatus.OK);
    }
}
