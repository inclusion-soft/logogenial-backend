package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.LeccionConsulta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILeccionConsultaRepository extends CrudRepository<LeccionConsulta,Integer> {
    List<LeccionConsulta> findAllByGrupoNivelTemaId(int grupoNivelId);
}