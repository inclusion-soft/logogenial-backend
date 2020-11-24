package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import com.rc.logogenial.basicadminservice.service.IResultadoPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({ "/v1/resultado-pregunta-api" })
@CrossOrigin(origins= {"*"})
public class ResultadoPreguntaController {
    @Autowired
    private IResultadoPreguntaService service;

    @GetMapping("/findAllByUsuarioEstudianteId/{id}")
    public ResponseEntity<Iterable<ResultadoPregunta>> findAllByGrupoNivelTemaId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByUsuarioEstudianteId(id), HttpStatus.OK);
    }

    @GetMapping("/findLastHitsByFechaAndUsuarioId/{id}/{cantidad}")
    public ResponseEntity<Iterable<ResultadoPregunta>> findAllByGrupoNivelTemaId(@PathVariable("id") int id,@PathVariable("cantidad") int cantidad) {
        Iterable<ResultadoPregunta> resultados = service.findLastHitsByFechaAndUsuarioId(id, cantidad);
        return new ResponseEntity<>(resultados, HttpStatus.OK);
    }

    @GetMapping("/findAllPuntajeByUsuarioEstudianteId/{id}")
    public ResponseEntity<Iterable<ResultadoPregunta>> findAllPuntajeByUsuarioEstudianteId(@PathVariable("id") int usuarioId) {
        return new ResponseEntity<>(service.findAllPuntajeByUsuarioEstudianteId(usuarioId), HttpStatus.OK);
    }


}
