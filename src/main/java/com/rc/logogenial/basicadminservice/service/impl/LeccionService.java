package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Leccion;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.ILeccionRepository;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.ILeccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class LeccionService extends BaseService<Leccion> implements ILeccionService {

    @Autowired
    private ILeccionRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public Leccion create(Leccion Leccion) {
        return repository.save(Leccion);
    }

    @Override
    public void delete(Leccion Leccion) throws ResourceNotFoundException {
        if (repository.findById(Leccion.getId()).isPresent()) {
            repository.delete(Leccion);
        }
        throw new ResourceNotFoundException("nema", "id", Integer.toString(Leccion.getId()));
    }

    @Override
    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            repository.deleteById(id);
        }
        else
        {
            throw new ResourceNotFoundException("Niveles", "id", Integer.toString(id));
        }
    }

    @Override
    public Iterable<Leccion> findAll() {
        return  repository.findAll();
    }

    @Override
    public Leccion findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            return repository.findById(id).get();
        }
        else
        {
            throw new ResourceNotFoundException("Niveles", "id",  Integer.toString(id));
        }
    }

    @Override
    public Leccion update(Leccion Leccion) throws ResourceNotFoundException {
        if (repository.findById(Leccion.getId()).isPresent())
        {
            return repository.save(Leccion);
        }
        throw new ResourceNotFoundException("Niveles", "id", Integer.toString(Leccion.getId()));
    }

    @Override
    public Iterable<Leccion> findAllByGrupoNivelTemaId(int id) {
        return  repository.findAllByGrupoNivelTema_Id(id);
    }

    @Override
    public Iterable<Leccion> findAllByEstudianteId(int id) {
        return  repository.findAllByEstudianteId(id);
    }
}
