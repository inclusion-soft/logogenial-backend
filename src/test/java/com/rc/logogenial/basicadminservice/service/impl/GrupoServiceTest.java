package com.rc.logogenial.basicadminservice.service.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.model.repository.IGrupoRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;
import java.util.Optional;

public class GrupoServiceTest {
    @Mock
    private IGrupoRepository grupoRepository;

    @InjectMocks
    GrupoService grupoService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        Optional<Grupo>  grupo = Optional.of(new Grupo(1,"",0,null,true, new Date("1999/09/09")));
        when(grupoRepository.findById(1)).thenReturn(grupo);
    }

    @Test
    public void findById() {
        assertEquals(1, grupoRepository.findById(1).get().getId());
    }

}