package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.AvancePregunta;
import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

public interface IAvancePreguntaService {
    public AvancePregunta create(AvancePregunta entity);
    public Iterable<AvancePregunta> findAllByEstudianteId(int id) ;
}
