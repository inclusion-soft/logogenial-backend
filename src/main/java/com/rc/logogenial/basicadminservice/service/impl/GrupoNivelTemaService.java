package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.GrupoNivelTema;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.IGrupoNivelRepository;
import com.rc.logogenial.basicadminservice.model.repository.IGrupoNivelTemaRepository;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.IGrupoNivelTemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class GrupoNivelTemaService extends BaseService<GrupoNivelTema> implements IGrupoNivelTemaService {

    @Autowired
    private IGrupoNivelTemaRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public GrupoNivelTema create(GrupoNivelTema grupo) {
        return repository.save(grupo);
    }

    @Override
    public void delete(GrupoNivelTema tema) throws ResourceNotFoundException {
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
    public Iterable<GrupoNivelTema> findAll() {
        return  repository.findAll();
    }

    @Override
    public GrupoNivelTema findById(int id) throws ResourceNotFoundException {
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
    public GrupoNivelTema update(GrupoNivelTema nivel) throws ResourceNotFoundException {
        if (repository.findById(nivel.getId()).isPresent())
        {
            return repository.save(nivel);
        }
        throw new ResourceNotFoundException("Niveles", "id", Integer.toString(nivel.getId()));
    }


    @Override
    public ResultSearchData<GrupoNivelTema> Search(PageablePrimitive pag, int nivelId) {

        Pageable paging = PageRequest.of(pag.getPage(), pag.getSize(),
                pag.getSortBy().equals("asc") ? Sort.by(pag.getSortOrder()).ascending() : Sort.by(pag.getSortBy()).descending());
        Usuario usuario = usuarioService.getUserLogged();
        Page<GrupoNivelTema> pagedResult = repository.findAllByGrupoNivel_Id(paging, nivelId);
        return (ResultSearchData<GrupoNivelTema>) this.getResultSearch(pagedResult);
    }
}
