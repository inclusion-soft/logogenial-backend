package com.rc.logogenial.basicadminservice.entity;

import lombok.*;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter

@NoArgsConstructor

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Builder
@Subselect(
        "select\n" +
                "       l.id, l.grupo_nivel_tema_id, l.enumeracion, l.leyenda,\n" +
                "       max(d.archivo_id) as archivo_pregunta_id, count(p.id) as cantidad_preguntas\n" +
                "from leccion l\n" +
                "inner join pregunta p on l.id = p.leccion_id\n" +
                "inner join datagenia d on d.id = p.respuesta_datagenia_id\n" +
                "where l.eliminado = to_date('09-09-1999','dd-mm-yyyy')\n" +
                "group by  l.id, l.leyenda\n" +
                "order by  l.enumeracion"
)
@AllArgsConstructor
@Entity
public class LeccionConsulta {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "grupo_nivel_tema_id")
    private int grupoNivelTemaId;

    //@OrderBy
    @Column(name =  "enumeracion")
    private String enumeracion;

    @Column(name = "leyenda")
    private String leyenda;

    @Column(name = "archivo_pregunta_id")
    private int archivoPreguntaId;

    @Column(name = "cantidad_preguntas")
    private int cantidadPreguntas;

}
