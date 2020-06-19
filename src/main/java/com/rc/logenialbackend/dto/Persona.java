package com.rc.logenialbackend.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ResultCheckStyle;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "persona", uniqueConstraints = @UniqueConstraint(name = "persona_uk", columnNames = "correo"))
@SQLDelete(sql = "UPDATE persona SET eliminado = current_date WHERE id = ?", check = ResultCheckStyle.COUNT)
@Where(clause = "eliminado is  null")
public class Persona {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    private String nombres;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    private String apellidos;
    @Column(columnDefinition = "VARCHAR(12)")
    private String telefono;
    @Column(columnDefinition = "VARCHAR(50) NOT NULL")
    private String correo;
    @Column(columnDefinition = "VARCHAR(100)")
    private String direccion;

    /** The activo. */
    @Column(name = "activo", columnDefinition = "BOOLEAN NOT NULL DEFAULT TRUE")
    @Builder.Default
    private Boolean activo = true;

    /** The eliminado. */
    @Column(name = "eliminado")
    private Date eliminado;
}
