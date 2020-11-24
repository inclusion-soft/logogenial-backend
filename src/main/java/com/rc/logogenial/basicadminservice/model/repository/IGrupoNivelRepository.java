package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.GrupoNivel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IGrupoNivelRepository extends CrudRepository<GrupoNivel,Integer> {
    Page<GrupoNivel> findAll(Pageable paging);
    Page<GrupoNivel> findAllByGrupo_Id(Pageable paging, int grupoId);
    List<GrupoNivel> findAllByGrupo_Id(int grupoId);
    GrupoNivel findByNivel_Nombre(String nombre);
}