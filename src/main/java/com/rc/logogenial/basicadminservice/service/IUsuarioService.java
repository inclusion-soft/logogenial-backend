package com.rc.logogenial.basicadminservice.service;

import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;


public interface IUsuarioService<T> extends IGenericSimpleService<T> {
    Usuario findByUsername(String name);
}
