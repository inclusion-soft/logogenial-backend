package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.Marca;
import com.rc.logogenial.basicadminservice.service.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/v1/marca-api" })
@CrossOrigin(origins= {"*"})
public class MarcaController {

    @Autowired
    private IMarcaService service;

    @GetMapping(value = "/health")
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK-Marca", HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Marca>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

}
