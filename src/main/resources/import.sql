INSERT INTO usuario (id,nombre,apellido, email, username, password, estado, intentos_exitosos, intentos_fallidos) VALUES (1,'Nelson', 'Camacho', 'nc@mail.co', 'nelson.camacho',  '$2a$10$5VYzA1qYNJVV7UqB/vOGAOH8fPQeurb.B6or.6iTMLCEdMjRrRb/q',1,0,0);
INSERT INTO usuario (id,nombre,apellido, email, username, password, estado, intentos_exitosos, intentos_fallidos) VALUES (2,'carlos', 'romero', 'cr@mail.co', 'carlos.romero',  '$2a$10$HEBKG0QeXV0u3ftVanWP0.SF/QUs4//C2FAYeAZL0SONM0UEMXw6q',1,0,0);

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

INSERT INTO nivel (id, activo, dificultad, nombre, eliminado) VALUES (1, true, 1, 'INICIAL', to_date('01-01-2020','dd-mm-yyyy'));
INSERT INTO nivel (id, activo, dificultad, nombre, eliminado) VALUES (2, true, 5, 'INTERMEDIO', to_date('01-01-2020','dd-mm-yyyy'));
INSERT INTO nivel (id, activo, dificultad, nombre, eliminado) VALUES (3, true, 8, 'AVANZADO', to_date('01-01-2020','dd-mm-yyyy'));

INSERT INTO grupo (id, activo, anio, nombre, usuario_id, eliminado) VALUES (1, true, 2020, 'INVITADO', 2, to_date('01-01-2020','dd-mm-yyyy'));
INSERT INTO grupo (id, activo, anio, nombre, usuario_id, eliminado) VALUES (2, true, 2020, 'COLEGIO PRINCIPAL - GRUPO 1', 2, to_date('01-01-2020','dd-mm-yyyy'));
INSERT INTO grupo (id, activo, anio, nombre, usuario_id, eliminado) VALUES (3, true, 2020, 'PERSONAL - INTERMEDIOS', 2, to_date('01-01-2020','dd-mm-yyyy'));

INSERT INTO archivo (id, activo, nombre, eliminado) VALUES (1, true, 'archivo2020-09-27T20_03_30_587.jpg', to_date('01-01-2020','dd-mm-yyyy'));
INSERT INTO archivo (id, activo, nombre, eliminado) VALUES (2, true, 'archivo2020-09-27T20_04_00_244.jpg', to_date('01-01-2020','dd-mm-yyyy'));

INSERT INTO datagenia (id, activo, archivo_id, compartido, dificultad, frase, nombre, usuario_creador_id, eliminado) VALUES (1, true, 1, true, 1, 'CASA', 'CASA', 1, to_date('01-01-2020','dd-mm-yyyy'));
INSERT INTO datagenia (id, activo, archivo_id, compartido, dificultad, frase, nombre, usuario_creador_id, eliminado) VALUES (2, true, 2, true, 9, 'CIELO ES AZUL Y NUBES SON BLANCAS', 'EL CIELO ES AZUL Y LAS NUBES SON BLANCAS', 1, to_date('01-01-2020','dd-mm-yyyy'));

SELECT setval('grupo_id_seq', (SELECT MAX(id) FROM grupo)+1);
SELECT setval('datagenia_id_seq', (SELECT MAX(id) FROM datagenia)+1);
SELECT setval('archivo_id_seq', (SELECT MAX(id) FROM archivo)+1);
SELECT setval('nivel_id_seq', (SELECT MAX(id) FROM nivel)+1);