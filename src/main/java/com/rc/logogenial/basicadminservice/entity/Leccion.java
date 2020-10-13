package com.rc.logogenial.basicadminservice.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import javax.persistence.Entity;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter

@Entity
@Table(name="leccion", uniqueConstraints =  @UniqueConstraint(name = "leccion_uk", columnNames = {"eliminado","grupo_nivel_tema_id","leyenda"}))
@SQLDelete(sql = "UPDATE leccion SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
public class Leccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "grupo_nivel_tema_id", columnDefinition = "int4 NOT NULL")
    private GrupoNivelTema grupoNivelTema;

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String leyenda;

    @OrderBy
    @Column(name = "enumeracion", columnDefinition = "INT NOT NULL")
    private int enumeracion;


    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    public Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");


}
