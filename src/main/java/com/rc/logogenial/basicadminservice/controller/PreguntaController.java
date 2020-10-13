package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.Pregunta;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.service.IPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/v1/preguntas-api" })
@CrossOrigin(origins= {"*"})
public class PreguntaController {

    @Autowired
    private IPreguntaService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pregunta> create(@RequestBody Pregunta grupoNivelTema) throws ResourceFoundException {
        return new ResponseEntity<>(service.create(grupoNivelTema), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Pregunta> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<Pregunta> update(@RequestBody Pregunta grupoNivelTema) throws ResourceNotFoundException {
        return new ResponseEntity<>(service.update(grupoNivelTema), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") int id) throws ResourceNotFoundException {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Pregunta>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/findAllByLeccionId/{id}")
    public ResponseEntity<Iterable<Pregunta>> findAllByLeccion_Id(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByLeccion_Id(id), HttpStatus.OK);
    }



//    @GetMapping("/search")
//    public ResponseEntity<ResultSearchData<Pregunta>> search(@RequestParam(name = "page", defaultValue = "0") int page,
//                                                               @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
//            , @RequestParam(name = "sortOrder") String sortOrder, @RequestParam(name = "grupoNivelId") int grupoNivelId) {
//        PageablePrimitive pag = new PageablePrimitive(page, size,sortBy, sortOrder);
//        ResultSearchData<Pregunta> datos = service.Search(pag, grupoNivelId);
//        return new ResponseEntity<ResultSearchData<Pregunta>>(datos, new HttpHeaders(), HttpStatus.OK);
//    }

}
