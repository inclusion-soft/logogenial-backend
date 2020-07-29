package com.rc.logenialbackend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "datagenia", uniqueConstraints = @UniqueConstraint(name = "datagenia_uk", columnNames = {"nombre","dificultad"}))
@SQLDelete(sql = "UPDATE datagenia SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado is  null")
public class Datagenia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "usuario_creador_id", columnDefinition = "INT NOT NULL")
    private int usuarioCreadorId;

    @Column(name = "compartido")
    private boolean compartido;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    private String nombre;

    @Column(columnDefinition = "VARCHAR(500) NOT NULL")
    private String frase;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "archivo_id", columnDefinition = "int4 NOT NULL")
    @JsonBackReference
    private Archivo archivoId;

    @Column(name = "dificultad")
    private int dificultad;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    private Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    private Date eliminado;

}
