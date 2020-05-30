package com.rc.logenialbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Getter
@Setter

@Entity
@Table(name="roles")
public class Role
        //implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 20)
    private String username;

    @Column(length = 60)
    private String password;

    private Boolean enabled;

    @ManyToMany(mappedBy = "roles")
    /*private List<Role> roles;*/
    private Set<Usuario> usuarios;

    /*private static  final long serialVersionUID = 1L;*/
}
