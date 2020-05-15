package com.rc.logenialbackend.dto;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Getter
@Setter
@Table(name = "persona")
public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "VARCHAR(50)")
    private String nombres;
    @Column(columnDefinition = "VARCHAR(50)")
    private String apellidos;
    @Column(columnDefinition = "VARCHAR(11)")
    private String telefono;
    @Column(columnDefinition = "VARCHAR(50)")
    private String correo;
    @Column(columnDefinition = "VARCHAR(60)")
    private String direccion;
}
