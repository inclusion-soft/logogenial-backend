package com.rc.logogenial.basicadminservice.entity;

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
@Table(name="nivel", uniqueConstraints = @UniqueConstraint(name = "nivel_uk", columnNames = "nombre"))
@SQLDelete(sql = "UPDATE nivel SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado = to_date('01-01-2020','dd-mm-yyyy')")
public class Nivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(columnDefinition = "VARCHAR(30) NOT NULL")
    private String nombre;

    @Column(columnDefinition = "INT NOT NULL")
    private int dificultad;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    public Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    @Builder.Default
    private Date eliminado = new Date("2020/01/01");


}
