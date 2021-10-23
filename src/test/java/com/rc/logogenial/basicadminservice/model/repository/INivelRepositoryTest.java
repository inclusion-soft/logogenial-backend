package com.rc.logogenial.basicadminservice.model.repository;

import com.rc.logogenial.basicadminservice.entity.Nivel;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Transactional(propagation = Propagation.NOT_SUPPORTED)
@EnableTransactionManagement
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class INivelRepositoryTest {

    @Autowired
    private INivelRepository repository;

    private Nivel nivelPrueba;

    @BeforeAll
    public void init(){

        String randomString = String.format("junit-test-%s", UUID.randomUUID().toString().substring(0, 15));
        nivelPrueba = new Nivel(0, randomString, 10, true, new Date("1999/09/09"));
    }

    @Test
    @Order(1)
    void guardar(){
        nivelPrueba  = repository.save(nivelPrueba);
        Assertions.assertThat(nivelPrueba.getId()).isGreaterThan(0);
    }

    @Test
    @Order(2)
    void buscarPorNombre(){
        Nivel nivelBuscado = repository.findByNombre(nivelPrueba.getNombre());
        Assertions.assertThat(nivelBuscado).isNotNull();
    }

    @Test
    @Order(3)
    void eliminarPorNombre(){
        Nivel nivelBuscado = repository.findByNombre(nivelPrueba.getNombre());
        repository.delete(nivelBuscado);
        Nivel nivelEliminado = repository.findByNombre(nivelPrueba.getNombre());
        Assertions.assertThat(nivelEliminado).isNull();
    }

}