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

INSERT INTO nivel (id, activo, dificultad, eliminado, nombre) VALUES (1, true, 1, null, 'INICIAL');
INSERT INTO nivel (id, activo, dificultad, eliminado, nombre) VALUES (2, true, 5, null, 'INTERMEDIO');
INSERT INTO nivel (id, activo, dificultad, eliminado, nombre) VALUES (3, true, 8, null, 'AVANZADO');

INSERT INTO grupo (id, activo, anio, eliminado, nombre, usuario_id) VALUES (1, true, 2020, null, 'INVITADO', 2);
INSERT INTO grupo (id, activo, anio, eliminado, nombre, usuario_id) VALUES (2, true, 2020, null, 'COLEGIO PRINCIPAL - GRUPO 1', 2);
INSERT INTO grupo (id, activo, anio, eliminado, nombre, usuario_id) VALUES (3, true, 2020, null, 'PERSONAL - INTERMEDIOS', 2);

INSERT INTO archivo (id, activo, eliminado, nombre) VALUES (1, true, null, 'archivo2020-09-27T20_03_30_587.jpg');
INSERT INTO archivo (id, activo, eliminado, nombre) VALUES (2, true, null, 'archivo2020-09-27T20_04_00_244.jpg');

INSERT INTO datagenia (id, activo, archivo_id, compartido, dificultad, eliminado, frase, nombre, usuario_creador_id) VALUES (1, true, 1, true, 1, null, 'CASA', 'CASA', 1);
INSERT INTO datagenia (id, activo, archivo_id, compartido, dificultad, eliminado, frase, nombre, usuario_creador_id) VALUES (2, true, 2, true, 9, null, 'CIELO ES AZUL Y NUBES SON BLANCAS', 'EL CIELO ES AZUL Y LAS NUBES SON BLANCAS', 1);