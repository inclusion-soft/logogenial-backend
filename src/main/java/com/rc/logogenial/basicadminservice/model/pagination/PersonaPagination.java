package com.rc.logogenial.basicadminservice.model.pagination;

import com.rc.logogenial.basicadminservice.dto.Persona;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonaPagination extends PagingAndSortingRepository<Persona,Integer> {
}
