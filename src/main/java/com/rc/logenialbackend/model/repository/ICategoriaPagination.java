package com.rc.logenialbackend.model.repository;

import com.rc.logenialbackend.entity.Categoria;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICategoriaPagination extends PagingAndSortingRepository<Categoria,Integer> {
}
