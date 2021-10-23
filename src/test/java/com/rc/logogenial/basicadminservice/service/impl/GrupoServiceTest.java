package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Grupo;
import com.rc.logogenial.basicadminservice.service.IGrupoService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Date;

import static org.mockito.MockitoAnnotations.initMocks;

@TestInstance(Lifecycle.PER_CLASS)
class GrupoServiceTest {
    @Mock
    private IGrupoService iGrupoService;

    @InjectMocks
    GrupoService grupoService;
    private Grupo grupo;

    @BeforeAll
    public void init(){
        initMocks(this);
        grupo = new Grupo(1, "", 0, null, true, new Date("1999/09/09"));
        Mockito.when(iGrupoService.findByNombre("mi-grupo")).thenReturn(grupo);

    }

    @Test
    void findById() {
        Assertions.assertThat(grupo).isEqualTo(iGrupoService.findByNombre("mi-grupo"));
    }

}