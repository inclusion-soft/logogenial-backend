package com.rc.logenialbackend.model;

import com.rc.logenialbackend.dto.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona,Integer>{
}
