INSERT INTO usuario (id,nombre,apellido, email, username, password, estado, intentos_exitosos, intentos_fallidos) VALUES (1,'Nelson', 'Camacho', 'nc@mail.co', 'nelson.camacho',  '$2a$10$5VYzA1qYNJVV7UqB/vOGAOH8fPQeurb.B6or.6iTMLCEdMjRrRb/q',1,0,0);
INSERT INTO usuario (id,nombre,apellido, email, username, password, estado, intentos_exitosos, intentos_fallidos) VALUES (2,'carlos', 'romero', 'cr@mail.co', 'carlos.romero',  '$2a$10$HEBKG0QeXV0u3ftVanWP0.SF/QUs4//C2FAYeAZL0SONM0UEMXw6q',1,0,0);
INSERT INTO usuario (id, activo, apellido, eliminado, email, estado, intentos_exitosos, intentos_fallidos, nombre, password, username) VALUES (4, true, 'admin', null, 'admin@mail.co', 0, 2, 0, 'admin', '$2a$10$pP9MI7Kg4FBGprc3BnuHFuKu6uUCY45ovz.TFgyhRp2CMsJEXV9xi', 'admin');

insert into roles (id, nombre) values (1, 'ADMINISTRADOR');
insert into roles (id, nombre) values (2, 'TUTOR');
insert into roles (id, nombre) values (3, 'ESTUDIANTE');
insert into roles (id, nombre) values (4, 'INVITADO');

insert into usuario_rol (usuario_id, role_id)  values (1,1);
insert into usuario_rol (usuario_id, role_id)  values (1,2);
insert into usuario_rol (usuario_id, role_id)  values (1,3);
insert into usuario_rol (usuario_id, role_id)  values (2,1);
insert into usuario_rol (usuario_id, role_id)  values (2,2);
insert into usuario_rol (usuario_id, role_id)  values (2,3);
insert into usuario_rol (usuario_id, role_id)  values (4,1);
insert into usuario_rol (usuario_id, role_id)  values (4,2);
insert into usuario_rol (usuario_id, role_id)  values (4,3);

INSERT INTO nivel (id, activo, dificultad, nombre, eliminado) VALUES (1, true, 1, 'INICIAL', to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO nivel (id, activo, dificultad, nombre, eliminado) VALUES (2, true, 5, 'INTERMEDIO', to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO nivel (id, activo, dificultad, nombre, eliminado) VALUES (3, true, 8, 'AVANZADO', to_date('09-09-1999','dd-mm-yyyy'));

INSERT INTO tema (id, activo, eliminado, nombre) VALUES (3, true, to_date('09-09-1999','dd-mm-yyyy'), 'Partes del cuerpo');
INSERT INTO tema (id, activo, eliminado, nombre) VALUES (1, true, to_date('09-09-1999','dd-mm-yyyy'), 'Familia');
INSERT INTO tema (id, activo, eliminado, nombre) VALUES (2, true, to_date('09-09-1999','dd-mm-yyyy'), 'Colores');

INSERT INTO grupo (id, activo, anio, nombre, usuario_id, eliminado) VALUES (1, true, 2020, 'INVITADO', 2, to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO grupo (id, activo, anio, nombre, usuario_id, eliminado) VALUES (2, true, 2020, 'COLEGIO PRINCIPAL - GRUPO 1', 2, to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO grupo (id, activo, anio, nombre, usuario_id, eliminado) VALUES (3, true, 2020, 'PERSONAL - INTERMEDIOS', 2, to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO grupo (id, activo, anio, eliminado, nombre, usuario_id) VALUES (5, true, 2020, to_date('09-09-1999','dd-mm-yyyy'), 'Invitado', 4);

INSERT INTO archivo (id, activo, nombre, eliminado) VALUES (1, true, 'archivo2020-09-27T20_03_30_587.jpg', to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO archivo (id, activo, nombre, eliminado) VALUES (2, true, 'archivo2020-09-27T20_04_00_244.jpg', to_date('09-09-1999','dd-mm-yyyy'));

INSERT INTO datagenia (id, activo, archivo_id, compartido, dificultad, frase, nombre, usuario_creador_id, eliminado) VALUES (1, true, 1, true, 1, 'CASA', 'CASA', 1, to_date('09-09-1999','dd-mm-yyyy'));
INSERT INTO datagenia (id, activo, archivo_id, compartido, dificultad, frase, nombre, usuario_creador_id, eliminado) VALUES (2, true, 2, true, 9, 'CIELO ES AZUL Y NUBES SON BLANCAS', 'EL CIELO ES AZUL Y LAS NUBES SON BLANCAS', 1, to_date('09-09-1999','dd-mm-yyyy'));

INSERT INTO grupo_nivel (id, activo, eliminado, grupo_id, nivel_id) VALUES (1, true, to_date('09-09-1999','dd-mm-yyyy'), 2, 1);
INSERT INTO grupo_nivel (id, activo, eliminado, grupo_id, nivel_id) VALUES (2, true, to_date('09-09-1999','dd-mm-yyyy'), 2, 2);
INSERT INTO grupo_nivel (id, activo, eliminado, grupo_id, nivel_id) VALUES (4, true, to_date('09-09-1999','dd-mm-yyyy'), 5, 1);
INSERT INTO grupo_nivel (id, activo, eliminado, grupo_id, nivel_id) VALUES (5, true, to_date('09-09-1999','dd-mm-yyyy'), 5, 2);

INSERT INTO grupo_nivel_tema (id, activo, eliminado, grupo_nivel_id, tema_id) VALUES (1, true, to_date('09-09-1999','dd-mm-yyyy'), 4, 2);
INSERT INTO grupo_nivel_tema (id, activo, eliminado, grupo_nivel_id, tema_id) VALUES (2, true, to_date('09-09-1999','dd-mm-yyyy'), 5, 1);
INSERT INTO grupo_nivel_tema (id, activo, eliminado, grupo_nivel_id, tema_id) VALUES (3, true, to_date('09-09-1999','dd-mm-yyyy'), 5, 3);

SELECT setval('usuario_id_seq', (SELECT MAX(id) FROM usuario)+1);
SELECT setval('grupo_id_seq', (SELECT MAX(id) FROM grupo)+1);
SELECT setval('datagenia_id_seq', (SELECT MAX(id) FROM datagenia)+1);
SELECT setval('archivo_id_seq', (SELECT MAX(id) FROM archivo)+1);
SELECT setval('nivel_id_seq', (SELECT MAX(id) FROM nivel)+1);
SELECT setval('tema_id_seq', (SELECT MAX(id) FROM tema)+1);
SELECT setval('grupo_nivel_id_seq', (SELECT MAX(id) FROM GRUPO_NIVEL)+1);