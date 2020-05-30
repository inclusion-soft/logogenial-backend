package com.rc.logenialbackend.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String nombre;

    /*@Builder.Default*/
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="usuarios_roles", joinColumns= @JoinColumn(name="usuario_id", referencedColumnName = "id"),
            inverseJoinColumns=@JoinColumn(name="role_id", referencedColumnName = "id"),
            uniqueConstraints= {@UniqueConstraint(columnNames= {"usuario_id", "role_id"})})
    /*private  List<Role> roles;*/
    private Set<Role> roles;
    /*private Set<Role> roles = new HashSet<>();*/

    /*@OneToMany(mappedBy = "usuarios")
    private  List<Role> roles;*/


    /*private static  final long serialVersionUID = 1L;*/

    public Usuario() {
    }
}
