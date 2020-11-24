package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.AvancePregunta;
import org.springframework.data.repository.CrudRepository;

public interface IAvancePreguntaRepository extends CrudRepository<AvancePregunta,Integer> {
    Iterable<AvancePregunta> findAllByEstudiante_Id(int estudianteId);
}