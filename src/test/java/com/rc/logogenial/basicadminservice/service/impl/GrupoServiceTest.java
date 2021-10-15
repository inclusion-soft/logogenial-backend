package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.service.IGrupoService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GrupoServiceTest {
    @Mock
    private IGrupoService iGrupoService;

    @InjectMocks
    GrupoService grupoService;
    private Grupo grupo;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        grupo = new Grupo(1, "", 0, null, true, new Date("1999/09/09"));
        when(iGrupoService.findByNombre("mi-grupo")).thenReturn(grupo);

    }

    @Test
    public void findById() {
        assertEquals(grupo, iGrupoService.findByNombre("mi-grupo"));
    }

}