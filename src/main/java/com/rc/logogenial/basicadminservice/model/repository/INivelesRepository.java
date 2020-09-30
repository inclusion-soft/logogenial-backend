package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Niveles;
import com.rc.logogenial.basicadminservice.entity.Niveles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface INivelesRepository extends CrudRepository<Niveles,Integer> {
    Page<Niveles> findAll(Pageable paging);
    Page<Niveles> findAllByGrupo_Id(Pageable paging, int usuarioId);
    Niveles findByNivel_Nombre(String nombre);
}