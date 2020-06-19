INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'PEREZ', 'corre@mail.co', 'dir222', 'PEDRO', '322222');
INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'MESA', 'florinda@televisa.com.mx', 'LA VECINDAD APTO 88', 'FLORINDA', '333');
INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'DEL 71', 'bruja71@televisa.com.mx', 'LA VECINDAD APTO 71', 'LA BRUJA', '4444444');
INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'ÑOÑO', 'nono@televisa.com.mx', 'OTRA VECINDAD', 'EL', '3144444');
INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'POPIS', 'popis@televisa.com.mx', 'OTRA VECINDAD CENTRO', 'LA', '3155555');
INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'BONITA', 'vecinabonita@televisa.com.mx', 'VECINDAD APTO 34', 'LA VECINA', '316666');
INSERT INTO persona (apellidos, correo, direccion, nombres, telefono)VALUES ( 'CAMACHO', 'nelsoncamacho@televisa.com.mx', 'VECINDAD APTO 77', 'NELSON', '317777777');

/* Creamos algunos usuarios con sus roles */
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (1, 'andres','$2a$10$is3S5DlVYaTjrer8KYt9l.ofUmOJpL19abFLpTuCvjlV47oWh2U46',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');
INSERT INTO usuarios (id, username, password, enabled, nombre, apellido, email) VALUES (2, 'admin','$2a$10$iwxqrA5fUUG5gYTxrgcCt.ttmkPpSRoC3fEgEuEzlqd0A2Hx/ssYK',1, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
