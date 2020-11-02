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
@Table(name="pregunta", uniqueConstraints =  @UniqueConstraint(name = "pregunta_uk", columnNames = {"eliminado","leccion_id","frase_respuesta"}))
@SQLDelete(sql = "UPDATE pregunta SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "leccion_id", columnDefinition = "int4 NOT NULL")
    private Leccion leccion;

    @Column(name = "frase_respuesta",columnDefinition = "VARCHAR(200) NOT NULL")
    private String fraseRespuesta;

    @Column(name = "enumeracion", columnDefinition = "INT NOT NULL")
    private int enumeracion;

    @Column(name = "tipopregunta", columnDefinition = "INT NOT NULL")
    private int tipopregunta;

    @Column(name = "aprobacion", columnDefinition = "BOOLEAN NOT NULL DEFAULT FALSE")
    @Builder.Default
    public Boolean aprobacion = true;


    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "usuario_autor_id", columnDefinition = "int4 NOT NULL")
    private Usuario usuarioautor;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "respuesta_datagenia_id", columnDefinition = "int4 NOT NULL")
    private Datagenia respuesta;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    public Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");


}
