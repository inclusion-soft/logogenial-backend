package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.LeccionConsulta;
import com.rc.logogenial.basicadminservice.model.repository.ILeccionConsultaRepository;
import com.rc.logogenial.basicadminservice.service.ILeccionConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeccionConsultaService  implements ILeccionConsultaService {
    @Autowired
    private ILeccionConsultaRepository repository;

    @Override
    public Iterable<LeccionConsulta> findAllByGrupoNivelTemaId(int id) {
        return  repository.findAllByGrupoNivelTemaId(id);
    }
}
