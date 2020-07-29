package com.rc.logenialbackend.controller;

import com.rc.logenialbackend.entity.Datagenia;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;
import com.rc.logenialbackend.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping({ "/datagenia-api" })
@CrossOrigin(origins= {"*"})
public class DatageniaController {

    @Autowired
    private IGenericService<Datagenia> service;

    @PostMapping("/create")
    public ResponseEntity<Datagenia> create(@RequestBody Datagenia Datagenia) {
        return new ResponseEntity<>(service.create(Datagenia), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Datagenia> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Datagenia> update(@RequestBody Datagenia Datagenia) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(Datagenia), HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody Datagenia datagenia) throws ResourceNotFoundException {
        service.delete(datagenia);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<Object> delete(@RequestParam int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Datagenia>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<Datagenia>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                              @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder ) {
        ResultSearchData<Datagenia> datos = service.findAllSearch(page, size,sortBy, sortOrder);
        return new ResponseEntity<ResultSearchData<Datagenia>>(datos, new HttpHeaders(), HttpStatus.OK);
    }
}
