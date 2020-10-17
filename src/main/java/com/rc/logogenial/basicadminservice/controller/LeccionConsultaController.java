package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.entity.LeccionConsulta;
import com.rc.logogenial.basicadminservice.exception.ResourceFoundException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import com.rc.logogenial.basicadminservice.service.ILeccionConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({ "/v1/leccion-consulta-api" })
@CrossOrigin(origins= {"*"})
public class LeccionConsultaController {
    @Autowired
    private ILeccionConsultaService service;

    @GetMapping("/findAllByGrupoNivelTemaId/{id}")
    public ResponseEntity<Iterable<LeccionConsulta>> findAllByGrupoNivelTemaId(@PathVariable("id") int id) {
        return new ResponseEntity<>(service.findAllByGrupoNivelTemaId(id), HttpStatus.OK);
    }
}
