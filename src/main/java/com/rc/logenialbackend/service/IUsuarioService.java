package com.rc.logenialbackend.service;

import com.rc.logenialbackend.entity.Usuario;
import com.rc.logenialbackend.exception.ResourceNotFoundException;


public interface IUsuarioService<T> extends IGenericSimpleService<T> {
    Usuario findByUsername(String name);
}
