package com.rc.logogenial.basicadminservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter

@Entity
@Table(name="grupo", uniqueConstraints = @UniqueConstraint(name = "grupo_uk", columnNames = "nombre"))
@SQLDelete(sql = "UPDATE grupo SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('09-09-1999','dd-mm-yyyy')")
@AllArgsConstructor
public class Grupo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String nombre;

    @Column(columnDefinition = "int4 NOT NULL")
    private int anio;

    @NotFound(action= NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({ org.hibernate.annotations.CascadeType.REFRESH })
    @JoinColumn(name = "usuario_id", columnDefinition = "int4 NOT NULL")
    @OrderBy("nombre")
    private Usuario usuario;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    public Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("1999/09/09");


}
