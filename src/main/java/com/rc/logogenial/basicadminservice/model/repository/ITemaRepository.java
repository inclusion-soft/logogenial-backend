package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Tema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ITemaRepository extends CrudRepository<Tema,Integer> {
    Page<Tema> findAll(Pageable paging);
    Tema findByNombre(String nombre);
}