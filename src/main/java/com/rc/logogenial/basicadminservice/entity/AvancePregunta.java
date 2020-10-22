package com.rc.logogenial.basicadminservice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "avance_pregunta")
@SQLDelete(sql = "UPDATE avance_pregunta SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
public class AvancePregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "usuario_estudiante_id", columnDefinition = "int4 NOT NULL")
    private Usuario estudiante;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "pregunta", columnDefinition = "int4 NOT NULL")
    private Pregunta pregunta;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "respuesta_pregunta", columnDefinition = "int4 NULL")
    private OpcionRespuesta respuesta;

    @Column(name = "fecha_creacion")
    @Builder.Default
    private Date fechaCreacion = new Date("2020/12/31");

    /** Tipo: Leccion o practica **/
    @Column(name = "tipo_avance", columnDefinition = "INT NOT NULL")
    private int tipoAvance;

    /** Tipo: Correcto 1, Incorrecto 0 **/
    @Column(name = "resultado", columnDefinition = "INT NOT NULL")
    private int resultado;

    @Column(name = "puntaje", columnDefinition = "INT NULL")
    private int puntaje;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    private Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");

}
