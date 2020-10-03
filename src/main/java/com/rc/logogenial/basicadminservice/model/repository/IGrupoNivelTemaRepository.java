package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.GrupoNivel;
import com.rc.logogenial.basicadminservice.entity.GrupoNivelTema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface IGrupoNivelTemaRepository extends CrudRepository<GrupoNivelTema,Integer> {
    Page<GrupoNivelTema> findAll(Pageable paging);
    //Page<GrupoNivelTema> findAllByGrupoNivel_IdNivel(Pageable paging, int nivelId);
    Page<GrupoNivelTema> findAllByGrupoNivel_Id(Pageable paging, int nivelId);
}