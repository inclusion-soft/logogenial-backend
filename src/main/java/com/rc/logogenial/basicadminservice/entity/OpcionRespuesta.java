package com.rc.logogenial.basicadminservice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter

@Entity
@Table(name="opcion_respuesta", uniqueConstraints =  @UniqueConstraint(name = "opcion_respuesta_uk", columnNames = {"eliminado","pregunta_id","opcion_datagenia_id"}))
@SQLDelete(sql = "UPDATE opcion_respuesta SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
public class OpcionRespuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "pregunta_id", columnDefinition = "int4 NOT NULL")
    private Pregunta pregunta;

    @Column(name = "orden", columnDefinition = "INT NULL")
    private int orden;

    @Column(name = "frase_respuesta",columnDefinition = "VARCHAR(200) NOT NULL")
    private String fraseRespuesta;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "opcion_datagenia_id", columnDefinition = "int4 NOT NULL")
    private Datagenia opcion;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    public Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");


}
