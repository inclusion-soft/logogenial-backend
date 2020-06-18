package com.rc.logenialbackend.controller;

import com.rc.logenialbackend.dto.Persona;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.shared.ResultSearchData;
import com.rc.logenialbackend.service.IPersonaService;
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
    private IPersonaService personaService;

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

    @DeleteMapping("/delete")
    public ResponseEntity<Object> delete(@RequestBody Persona Persona) throws ResourceNotFoundException {
        personaService.delete(Persona);
        return new ResponseEntity<>(HttpStatus.OK);
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

    /*@GetMapping
    public Page<PersonaPagination> search(@RequestParam(name = "page", defaultValue = "0") int page,
                                        @RequestParam(name = "size", defaultValue = "10") int size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        List<Persona> list = personaService.findAll(pageRequest);

        List<PersonaPagination> todos = pageResult
                .stream()
                .map(TodoResponse::new)
                .collect(toList());

        return new PageImpl<>(todos, pageRequest, pageResult.getTotalElements());

    }*/

    @GetMapping("/search")
    public ResponseEntity<ResultSearchData<Persona>> search(@RequestParam(name = "pageIndex", defaultValue = "0") int pageIndex,
                                          @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
        //PageRequest pageRequest = PageRequest.of(page, size);
        ResultSearchData<Persona> datos = personaService.findAllSearch(pageIndex, pageSize);
        return new ResponseEntity<ResultSearchData<Persona>>(datos, new HttpHeaders(), HttpStatus.OK);

    }
}
