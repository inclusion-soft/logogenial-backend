package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Encuesta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface IEncuestaRepository extends CrudRepository<Encuesta,Integer> {
    Page<Encuesta> findAll(Pageable paging);
}