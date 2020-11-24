package com.rc.logogenial.basicadminservice.entity;

import lombok.*;
import org.hibernate.annotations.Subselect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter

@NoArgsConstructor

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Builder
@Subselect(
        "select ROW_NUMBER () OVER (\n" +
                "           ORDER BY usuario_estudiante_id\n" +
                "        ) as id, usuario_estudiante_id, date_trunc('day',fecha_creacion) as fecha, tipo_avance as tipo, count(tipo_avance) as cantidad\n" +
                "from avance_pregunta\n" +
                "group by usuario_estudiante_id, date_trunc('day',fecha_creacion), tipo_avance\n" +
                "order by date_trunc('day',fecha_creacion), tipo_avance"
)
@AllArgsConstructor
@Entity
public class ResultadoPregunta {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "usuario_estudiante_id")
    private int usuarioEstudianteId;

    @Column(name = "fecha")
    @Builder.Default
    private Date fecha = new Date("1999/09/09");

    @Column(name = "tipo")
    private int tipo;

    @Column(name = "cantidad")
    private int cantidad;

}
