package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.dto.Persona;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping({ "/persona-api" })
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    private IGenericService<Persona> personaService;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Persona> create(@RequestBody Persona persona) {
        return new ResponseEntity<>(personaService.create(persona), HttpStatus.OK);
    }

    @GetMapping("/findById")
    public ResponseEntity<Persona> findOne(@RequestParam int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(personaService.findById(id), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> update(@RequestBody Persona Persona) throws ResourceNotFoundException {
        return new ResponseEntity<>(personaService.update(Persona), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById")
    public ResponseEntity<Object> delete(@RequestParam int id) throws ResourceNotFoundException {
        personaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Persona>> findAll() {
        return new ResponseEntity<>(personaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<Persona>> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                                              @RequestParam(name = "size", defaultValue = "10") int size, @RequestParam(name = "sortBy") String sortBy
            , @RequestParam(name = "sortOrder") String sortOrder ) {
        ResultSearchData<Persona> datos = personaService.findAllSearch(page, size,sortBy, sortOrder);
        return new ResponseEntity<ResultSearchData<Persona>>(datos, new HttpHeaders(), HttpStatus.OK);
    }
}
