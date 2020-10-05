package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.GrupoNivelTema;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGrupoNivelTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/grupo-nivel-tema-api" })
@CrossOrigin(origins= {"*"})
public class GrupoNivelTemaController {

    @Autowired
    private IGrupoNivelTemaService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<GrupoNivelTema> create(@RequestBody GrupoNivelTema grupoNivelTema) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(grupoNivelTema), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<GrupoNivelTema> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<GrupoNivelTema> update(@RequestBody GrupoNivelTema grupoNivelTema) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(grupoNivelTema), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<GrupoNivelTema>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<GrupoNivelTema>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                               @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder, @RequestParam(name = "grupoNivelId") int grupoNivelId) {
        PageablePrimitive pag = new PageablePrimitive(page, size,sortBy, sortOrder);
        ResultSearchData<GrupoNivelTema> datos = service.Search(pag, grupoNivelId);
        return new ResponseEntity<ResultSearchData<GrupoNivelTema>>(datos, new HttpHeaders(), HttpStatus.OK);
    }

}
