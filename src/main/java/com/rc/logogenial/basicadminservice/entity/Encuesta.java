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
@Table(name="encuesta", uniqueConstraints =  @UniqueConstraint(name = "encuesta_uk", columnNames = {"eliminado","marca_id"}))
@SQLDelete(sql = "UPDATE encuesta SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
public class Encuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(columnDefinition = "VARCHAR(15) NOT NULL")
    private String numeroDocumento;

    @Column(columnDefinition = "VARCHAR(40) NOT NULL")
    private String email;

    @Column(columnDefinition = "VARCHAR(200) NOT NULL")
    private String comentarios;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "marca_id", columnDefinition = "int4 NOT NULL")
    @OrderBy("nombre")
    private Marca marca;

    /** The eliminado. */
    @Builder.Default
    private Date fechaCreacion;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    public Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");


}
