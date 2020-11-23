package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.entity.Leccion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IGrupoRepository extends CrudRepository<Grupo,Integer> {
    Page<Grupo> findAll(Pageable paging);

    Page<Grupo> findAllByUsuario_Id(Pageable paging, int usuarioId);
    Grupo findByNombre(String nombre);

    @Query(value = "select *\n" +
            "from grupo g\n" +
            "inner join grupo_estudiante ge on g.id = ge.grupo_id\n" +
            "where ge.usuario_estudiante_id = :estudianteId", nativeQuery = true)
    public List<Grupo> findAllByEstudianteId(@Param("estudianteId") int estudianteId);

    public List<Grupo> findAllByUsuario_Id(@Param("usuarioId") int usuarioId);
}