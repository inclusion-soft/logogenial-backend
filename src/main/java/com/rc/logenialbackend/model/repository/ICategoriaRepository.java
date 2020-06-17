package com.rc.logenialbackend.model.repository;

import com.rc.logenialbackend.entity.Categoria;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface ICategoriaRepository extends CrudRepository<Categoria,Integer> {
    Page<Categoria> findAll(Pageable paging);
    Categoria findByNombre(String nombre);
}