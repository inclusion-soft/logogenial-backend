package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface IResultadoPreguntaRepository extends CrudRepository<ResultadoPregunta,Integer> {

    @Query(value = "select ROW_NUMBER () OVER (\\n\" +\n" +
            "                \"           ORDER BY usuario_estudiante_id\\n\" +\n" +
            "                \"        ) as id, usuario_estudiante_id, date_trunc('day',fecha_creacion) as fecha, tipo_avance, count(tipo_avance) as cantidad\n" +
            "from avance_pregunta\n" +
            "where usuario_estudiante_id = :id \n" +
            "group by usuario_estudiante_id, date_trunc('day',fecha_creacion), tipo_avance\n" +
            "order by date_trunc('day',fecha_creacion), tipo_avance",nativeQuery = true)
    Iterable<ResultadoPregunta> findAllByUsuarioEstudianteId(int id);

    @Query(value = "select ROW_NUMBER () OVER () as id, usuario_estudiante_id, date_trunc('day',fecha_creacion) as fecha, tipo_avance as tipo, count(tipo_avance) as cantidad\n" +
            "from avance_pregunta\n" +
            "where usuario_estudiante_id = :id \n" +
            "group by usuario_estudiante_id, date_trunc('day',fecha_creacion), tipo_avance\n" +
            "order by date_trunc('day',fecha_creacion) desc, tipo_avance",
            countQuery = "select count(c.cantidad) from ( select count(*) as cantidad from avance_pregunta where usuario_estudiante_id = :id group by usuario_estudiante_id, date_trunc('day',fecha_creacion), tipo_avance) c",
            nativeQuery = true)
    Page<ResultadoPregunta> findLastHitsByFechaAndUsuarioId(Pageable pageable, int id);

    @Query(value = "select ROW_NUMBER () OVER (\n" +
            "    ORDER BY tipo_avance\n" +
            "    ) as id, now() as fecha, usuario_estudiante_id, tipo_avance as tipo,  count(tipo_avance) as cantidad\n" +
            "    from avance_pregunta\n" +
            "        where usuario_estudiante_id = :id\n" +
            "    group by usuario_estudiante_id, tipo_avance\n" +
            "        order by tipo_avance",nativeQuery = true)
    Iterable<ResultadoPregunta> findAllPuntajeByUsuarioEstudianteId(int id);
}