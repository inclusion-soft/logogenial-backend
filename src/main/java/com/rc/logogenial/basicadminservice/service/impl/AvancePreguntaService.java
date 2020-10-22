package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.AvancePregunta;
import com.rc.logogenial.basicadminservice.model.repository.IAvancePreguntaRepository;
import com.rc.logogenial.basicadminservice.service.IAvancePreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AvancePreguntaService implements IAvancePreguntaService {

    @Autowired
    private IAvancePreguntaRepository repository;

    @Override
    public AvancePregunta create(AvancePregunta avancePregunta) {
        avancePregunta.setFechaCreacion(new Date());
        return repository.save(avancePregunta);
    }

    @Override
    public Iterable<AvancePregunta> findAllByEstudianteId(int id) {
        return  repository.findAllByEstudiante_Id(id);
    }
}
