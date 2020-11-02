package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import com.rc.logogenial.basicadminservice.model.repository.IResultadoPreguntaRepository;
import com.rc.logogenial.basicadminservice.service.IResultadoPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultadoPreguntaService implements IResultadoPreguntaService {
    @Autowired
    private IResultadoPreguntaRepository repository;

    @Override
    public Iterable<ResultadoPregunta> findAllByUsuarioEstudianteId(int usuarioEstudianteId) {
        return repository.findAllByUsuarioEstudianteId(usuarioEstudianteId);
    }
}
