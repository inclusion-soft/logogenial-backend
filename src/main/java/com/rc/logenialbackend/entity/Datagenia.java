package com.rc.logenialbackend.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
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

    @Column(columnDefinition = "VARCHAR(200) NOT NULL")
    private String file;

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
