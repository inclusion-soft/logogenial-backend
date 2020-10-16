package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

public interface ILeccionService extends IGenericSimpleService<Leccion> {
    public void delete(Leccion nivel) throws ResourceNotFoundException;
    public Iterable<Leccion> findAllByGrupoNivelTemaId(int id) ;

    Iterable<Leccion> findAllByEstudianteId(int id);
}
