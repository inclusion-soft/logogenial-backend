package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.GrupoEstudiante;
import com.rc.logogenial.basicadminservice.entity.Leccion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ILeccionRepository extends CrudRepository<Leccion,Integer> {
    Page<Leccion> findAll(Pageable paging);
    List<Leccion> findAllByGrupoNivelTema_Id(int nivelId);

    @Query(value = "select *\n" +
            "from leccion l\n" +
            "inner join grupo_nivel_tema gnt on l.grupo_nivel_tema_id = gnt.id\n" +
            "inner join grupo_nivel gn on gnt.grupo_nivel_id = gn.id\n" +
            "inner join grupo g on g.id = gn.grupo_id\n" +
            "inner join grupo_estudiante ge on g.id = ge.grupo_id\n" +
            "where ge.usuario_estudiante_id = :estudianteId", nativeQuery = true)
    public List<Leccion> findAllByEstudianteId(@Param("estudianteId") int estudianteId);
}