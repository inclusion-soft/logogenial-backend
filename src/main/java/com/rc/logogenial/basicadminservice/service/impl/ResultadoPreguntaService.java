package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Datagenia;
import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import com.rc.logogenial.basicadminservice.model.repository.IResultadoPreguntaRepository;
import com.rc.logogenial.basicadminservice.service.IResultadoPreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadoPreguntaService implements IResultadoPreguntaService {
    @Autowired
    private IResultadoPreguntaRepository repository;

    @Override
    public Iterable<ResultadoPregunta> findAllByUsuarioEstudianteId(int usuarioEstudianteId) {
        return repository.findAllByUsuarioEstudianteId(usuarioEstudianteId);
    }

    @Override
    public Iterable<ResultadoPregunta> findAllPuntajeByUsuarioEstudianteId(int id) {
        return repository.findAllPuntajeByUsuarioEstudianteId(id);
    }

    @Override
    public List<ResultadoPregunta> findLastHitsByFechaAndUsuarioId(int id, int _cantidad) {
        int cantidad = _cantidad * 2;
        Pageable paging = PageRequest.of(0, cantidad );
        Page<ResultadoPregunta>  listaPaginada = repository.findLastHitsByFechaAndUsuarioId(paging, id);
        return listaPaginada.getContent();
    }


}
