package com.rc.logogenial.basicadminservice.service;

import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

import java.util.List;

public interface IUsuarioService<T> extends IGenericService<T> {
    Usuario findByUsername(String name);
    List<Usuario> findAllStudends ();
    List<Usuario> findAllTeachers ();
}
