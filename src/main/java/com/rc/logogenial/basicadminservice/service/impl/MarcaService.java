package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Marca;
import com.rc.logogenial.basicadminservice.model.repository.IMarcaRepository;
import com.rc.logogenial.basicadminservice.service.IMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService extends BaseService<Marca> implements IMarcaService {

    @Autowired
    private IMarcaRepository repository;

    @Override
    public Iterable<Marca> findAll() {
        List<Marca> lista = (List<Marca>) repository.findAll();
        return lista;
    }

}
