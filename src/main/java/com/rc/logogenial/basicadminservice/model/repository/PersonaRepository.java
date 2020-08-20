package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.dto.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Integer>{
    Page<Persona> findAll(Pageable paging);
}
