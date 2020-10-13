package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.OpcionRespuesta;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.model.repository.IOpcionRespuestaRepository;
import com.rc.logogenial.basicadminservice.service.IOpcionRespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OpcionRespuestaService extends BaseService<OpcionRespuesta> implements IOpcionRespuestaService {

    @Autowired
    private IOpcionRespuestaRepository repository;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public OpcionRespuesta create(OpcionRespuesta pregunta) {
        return repository.save(pregunta);
    }

    @Override
    public void delete(OpcionRespuesta OpcionRespuesta) throws ResourceNotFoundException {
        if (repository.findById(OpcionRespuesta.getId()).isPresent()) {
            repository.delete(OpcionRespuesta);
        }
        throw new ResourceNotFoundException("nema", "id", Integer.toString(OpcionRespuesta.getId()));
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
    public Iterable<OpcionRespuesta> findAll() {
        return  repository.findAll();
    }

    @Override
    public OpcionRespuesta findById(int id) throws ResourceNotFoundException {
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
    public OpcionRespuesta update(OpcionRespuesta pregunta) throws ResourceNotFoundException {
        Optional<OpcionRespuesta> preguntaExistente = repository.findById(pregunta.getId());
        if (preguntaExistente.isPresent())
        {
            return repository.save(pregunta);
        }
        throw new ResourceNotFoundException("Niveles", "id", Integer.toString(pregunta.getId()));
    }

    @Override
    public Iterable<OpcionRespuesta> findAllByPregunta_Id(int id) {
        return  repository.findAllByPregunta_Id(id);
    }



//    @Override
//    public ResultSearchData<OpcionRespuesta> Search(PageablePrimitive pag, int grupoNivelId) {
//
//        Pageable paging = PageRequest.of(pag.getPage(), pag.getSize(),
//                pag.getSortBy().equals("asc") ? Sort.by(pag.getSortOrder()).ascending() : Sort.by(pag.getSortBy()).descending());
//        Usuario usuario = usuarioService.getUserLogged();
//        Page<OpcionRespuesta> pagedResult = repository.findAllByGrupoNivel_Id(paging, grupoNivelId);
//        return (ResultSearchData<OpcionRespuesta>) this.getResultSearch(pagedResult);
//    }
}
