package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.GrupoNivel;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGrupoNivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/grupo-nivel-api" })
@CrossOrigin(origins= {"*"})
public class GrupoNivelController {

    @Autowired
    private IGrupoNivelService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GrupoNivel> create(@RequestBody GrupoNivel Niveles) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(Niveles), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<GrupoNivel> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<GrupoNivel> update(@RequestBody GrupoNivel Niveles) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(Niveles), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<GrupoNivel>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<GrupoNivel>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                               @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder, @RequestParam(name = "grupoId") int grupoId) {
        PageablePrimitive pag = new PageablePrimitive(page, size,sortBy, sortOrder);
        ResultSearchData<GrupoNivel> datos = service.Search(pag, grupoId);
        return new ResponseEntity<ResultSearchData<GrupoNivel>>(datos, new HttpHeaders(), HttpStatus.OK);
    }

}
