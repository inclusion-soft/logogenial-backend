package com.rc.logogenial.basicadminservice.model.pagination;


import com.rc.logogenial.basicadminservice.entity.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonaPagination extends PagingAndSortingRepository<Usuario,Integer> {
}
