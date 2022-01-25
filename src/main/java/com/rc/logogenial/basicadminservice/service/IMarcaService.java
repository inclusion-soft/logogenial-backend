package com.rc.logogenial.basicadminservice.service;

import com.rc.logogenial.basicadminservice.entity.Marca;

public interface IMarcaService {
    Iterable<Marca> findAll();
}
