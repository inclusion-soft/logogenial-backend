package com.rc.logogenial.archivosservice.repository;

import com.rc.logogenial.archivosservice.entity.Archivo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface IArchivoRepository extends CrudRepository<Archivo,Integer> {
    Page<Archivo> findAll(Pageable paging);
    Archivo findById(int id);
}
