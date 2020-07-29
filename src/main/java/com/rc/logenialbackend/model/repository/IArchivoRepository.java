package com.rc.logenialbackend.model.repository;

import com.rc.logenialbackend.entity.Archivo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface IArchivoRepository extends CrudRepository<Archivo,Integer> {
    Page<Archivo> findAll(Pageable paging);
    Archivo findById(int id);
}
