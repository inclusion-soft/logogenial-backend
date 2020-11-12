package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IResultadoPreguntaService {

    Iterable<ResultadoPregunta> findAllByUsuarioEstudianteId(int id);

    Iterable<ResultadoPregunta> findAllPuntajeByUsuarioEstudianteId(int id);

    Iterable<ResultadoPregunta> findLastHitsByFechaAndUsuarioId(int id, int cantidad);
}
