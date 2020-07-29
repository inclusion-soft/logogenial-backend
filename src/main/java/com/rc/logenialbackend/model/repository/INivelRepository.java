package com.rc.logenialbackend.model.repository;

import com.rc.logenialbackend.entity.Nivel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface INivelRepository extends CrudRepository<Nivel,Integer> {
    Page<Nivel> findAll(Pageable paging);
    Nivel findByNombre(String nombre);
}