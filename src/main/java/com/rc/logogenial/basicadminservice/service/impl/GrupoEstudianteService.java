package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.GrupoEstudiante;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.IGrupoEstudianteRepository;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGrupoEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoEstudianteService extends BaseService<GrupoEstudiante> implements IGrupoEstudianteService {

    @Autowired
    private IGrupoEstudianteRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public GrupoEstudiante create(GrupoEstudiante grupo) {
        return repository.save(grupo);
    }


    public void delete(GrupoEstudiante tema) throws ResourceNotFoundException {
        if (repository.findById(tema.getId()).isPresent()) {
            repository.delete(tema);
        }
        throw new ResourceNotFoundException("nema", "id", Integer.toString(tema.getId()));
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
    public Iterable<GrupoEstudiante> findAll() {
        return  repository.findAll();
    }

    @Override
    public GrupoEstudiante findById(int id) throws ResourceNotFoundException {
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
    public GrupoEstudiante update(GrupoEstudiante nivel) throws ResourceNotFoundException {
        if (repository.findById(nivel.getId()).isPresent())
        {
            return repository.save(nivel);
        }
        throw new ResourceNotFoundException("Niveles", "id", Integer.toString(nivel.getId()));
    }


    @Override
    public List<GrupoEstudiante> findAllByEstudianteId(int estudianteId) {
        return repository.findAllByEstudianteId(estudianteId);
    }
}
