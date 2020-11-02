package com.rc.logogenial.basicadminservice.service;


import com.rc.logogenial.basicadminservice.entity.ResultadoPregunta;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IResultadoPreguntaService {
    @Query(value = "select 0 as id, usuario_estudiante_id, date_trunc('day',fecha_creacion) as fecha, tipo_avance, count(tipo_avance) as cantidad\n" +
            "from avance_pregunta\n" +
            "where usuario_estudiante_id = :id \n" +
            "group by usuario_estudiante_id, date_trunc('day',fecha_creacion), tipo_avance\n" +
            "order by date_trunc('day',fecha_creacion), tipo_avance",nativeQuery = true)
    Iterable<ResultadoPregunta> findAllByUsuarioEstudianteId(int id);
}
