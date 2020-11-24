package com.rc.logogenial.basicadminservice.entity;

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
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
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

    @Column(name = "archivo_id", columnDefinition = "INT NOT NULL")
    private int archivoId;

    @Column(name = "dificultad")
    private int dificultad;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    private Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");

}
