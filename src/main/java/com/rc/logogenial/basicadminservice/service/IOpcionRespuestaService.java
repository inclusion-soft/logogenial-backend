package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.OpcionRespuesta;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

public interface IOpcionRespuestaService extends IGenericSimpleService<OpcionRespuesta> {
    public void delete(OpcionRespuesta nivel) throws ResourceNotFoundException;
    public Iterable<OpcionRespuesta> findAllByPregunta_Id(int id) ;

}
