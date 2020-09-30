package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Niveles;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.INivelesRepository;
import com.rc.logogenial.basicadminservice.model.shared.PageablePrimitive;
import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.service.INivelesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelesService extends BaseService<Niveles> implements INivelesService {

    @Autowired
    private INivelesRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public Niveles create(Niveles grupo) {
        return repository.save(grupo);
    }

    @Override
    public void delete(Niveles tema) throws ResourceNotFoundException {
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
    public Iterable<Niveles> findAll() {
        return  repository.findAll();
    }

    @Override
    public Niveles findById(int id) throws ResourceNotFoundException {
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
    public Niveles update(Niveles nivel) throws ResourceNotFoundException {
        if (repository.findById(nivel.getId()).isPresent())
        {
            return repository.save(nivel);
        }
        throw new ResourceNotFoundException("Niveles", "id", Integer.toString(nivel.getId()));
    }


    @Override
    public ResultSearchData<Niveles> Search(PageablePrimitive pag, int grupoId) {

        Pageable paging = PageRequest.of(pag.getPage(), pag.getSize(),
                pag.getSortBy().equals("asc") ? Sort.by(pag.getSortOrder()).ascending() : Sort.by(pag.getSortBy()).descending());
        Usuario usuario = usuarioService.getUserLogged();
        Page<Niveles> pagedResult = repository.findAllByGrupo_Id(paging, grupoId);
        return (ResultSearchData<Niveles>) this.getResultSearch(pagedResult);
    }
}
