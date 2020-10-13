package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.Pregunta;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

public interface IPreguntaService extends IGenericSimpleService<Pregunta> {
    public void delete(Pregunta nivel) throws ResourceNotFoundException;
    public Iterable<Pregunta> findAllByLeccion_Id(int id) ;

}
