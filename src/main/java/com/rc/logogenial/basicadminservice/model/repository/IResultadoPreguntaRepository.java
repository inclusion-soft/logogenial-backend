package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IResultadoPreguntaRepository extends CrudRepository<ResultadoPregunta,Integer> {
    List<ResultadoPregunta> findAllByUsuarioEstudianteId(int usuarioEstudianteId);
}