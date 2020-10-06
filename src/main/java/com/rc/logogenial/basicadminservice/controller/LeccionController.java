package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.ILeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/lecciones-api" })
@CrossOrigin(origins= {"*"})
public class LeccionController {

    @Autowired
    private ILeccionService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Leccion> create(@RequestBody Leccion grupoNivelTema) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(grupoNivelTema), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Leccion> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Leccion> update(@RequestBody Leccion grupoNivelTema) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(grupoNivelTema), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Leccion>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findAllByGrupoNivelTemaId/{id}")
    public ResponseEntity<Iterable<Leccion>> findAllByGrupoNivelTemaId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByGrupoNivelTemaId(id), HttpStatus.OK);
    }



//    @GetMapping("/search")
//    public ResponseEntity<ResultSearchData<Leccion>> search(@RequestParam(name = "page", defaultValue = "0") int page,
//                                                               @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
//            , @RequestParam(name = "sortOrder") String sortOrder, @RequestParam(name = "grupoNivelId") int grupoNivelId) {
//        PageablePrimitive pag = new PageablePrimitive(page, size,sortBy, sortOrder);
//        ResultSearchData<Leccion> datos = service.Search(pag, grupoNivelId);
//        return new ResponseEntity<ResultSearchData<Leccion>>(datos, new HttpHeaders(), HttpStatus.OK);
//    }

}
