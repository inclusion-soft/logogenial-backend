package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.GrupoNivel;
import com.rc.logogenial.basicadminservice.entity.GrupoNivelTema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IGrupoNivelTemaRepository extends CrudRepository<GrupoNivelTema,Integer> {
    Page<GrupoNivelTema> findAll(Pageable paging);
    List<GrupoNivelTema> findAllByGrupoNivel_Id(int grupoId);
    Page<GrupoNivelTema> findAllByGrupoNivel_Id(Pageable paging, int nivelId);
}