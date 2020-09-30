package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IGrupoRepository extends CrudRepository<Grupo,Integer> {
    Page<Grupo> findAll(Pageable paging);

    Page<Grupo> findAllByUsuario_Id(Pageable paging, int usuarioId);
    Grupo findByNombre(String nombre);
}