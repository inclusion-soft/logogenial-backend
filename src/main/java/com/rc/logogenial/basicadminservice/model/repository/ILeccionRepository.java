package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Leccion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ILeccionRepository extends CrudRepository<Leccion,Integer> {
    Page<Leccion> findAll(Pageable paging);
    List<Leccion> findAllByGrupoNivelTema_Id(int nivelId);
    //Page<Leccion> findAllByGrupoNivel_IdNivel(Pageable paging, int nivelId);
    //Page<Leccion> findAllByGrupoNivelTema_GrupoNivel_Id(Pageable paging, int nivelId);
}