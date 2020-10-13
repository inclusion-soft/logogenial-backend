package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Pregunta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPreguntaRepository extends CrudRepository<Pregunta,Integer> {
    Page<Pregunta> findAll(Pageable paging);
    List<Pregunta> findAllByLeccion_Id(int leccionId);
}