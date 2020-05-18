package com.rc.logenialbackend.model;

import com.rc.logenialbackend.dto.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonaPagination extends PagingAndSortingRepository<Persona,Integer> {
}
