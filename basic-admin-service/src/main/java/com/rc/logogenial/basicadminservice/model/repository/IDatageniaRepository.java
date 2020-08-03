package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Datagenia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface IDatageniaRepository extends CrudRepository<Datagenia,Integer> {
    Page<Datagenia> findAll(Pageable paging);
    Datagenia findByNombre(String nombre);
}