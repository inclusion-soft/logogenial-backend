package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.GrupoEstudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IGrupoEstudianteRepository extends CrudRepository<GrupoEstudiante,Integer> {
    Page<GrupoEstudiante> findAll(Pageable paging);

    @Query(value = "Select * from grupo_estudiante where usuario_estudiante_id = :grupoId", nativeQuery = true)
    public List<GrupoEstudiante> findAllByEstudianteId(@Param("grupoId") int grupoId);
}