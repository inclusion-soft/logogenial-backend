package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    Page<Usuario> findAll(Pageable paging);

    public Usuario findByUsername(String username);

    Optional<Usuario> findByUsernameOrEmail(String username, String email);

    /*@Query("select u from usuarios u where u.username = ?1")
    public Usuario findByUsernameCustom(String username);*/
}