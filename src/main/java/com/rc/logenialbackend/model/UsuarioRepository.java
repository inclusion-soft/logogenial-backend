package com.rc.logenialbackend.model;

import com.rc.logenialbackend.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    Page<Usuario> findAll(Pageable paging);

    public Usuario findByUsername(String username);

    /*@Query("select u from usuarios u where u.username = ?1")
    public Usuario findByUsernameCustom(String username);*/
}