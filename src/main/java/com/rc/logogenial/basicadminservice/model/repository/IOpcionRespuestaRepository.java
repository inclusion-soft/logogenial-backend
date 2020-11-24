package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.OpcionRespuesta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IOpcionRespuestaRepository extends CrudRepository<OpcionRespuesta,Integer> {
    Page<OpcionRespuesta> findAll(Pageable paging);
    List<OpcionRespuesta> findAllByPregunta_Id(int leccionId);
}