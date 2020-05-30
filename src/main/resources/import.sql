INSERT INTO persona VALUES (1, 'PEREZ', 'corre@mail.co', 'dir222', 'PEDRO', '322222');
INSERT INTO persona VALUES (2, 'MESA', 'florinda@televisa.com.mx', 'LA VECINDAD APTO 88', 'FLORINDA', '333');
INSERT INTO persona VALUES (3, 'DEL 71', 'bruja71@televisa.com.mx', 'LA VECINDAD APTO 71', 'LA BRUJA', '4444444');
INSERT INTO persona VALUES (4, 'ÑOÑO', 'nono@televisa.com.mx', 'OTRA VECINDAD', 'EL', '3144444');
INSERT INTO persona VALUES (5, 'POPIS', 'popis@televisa.com.mx', 'OTRA VECINDAD CENTRO', 'LA', '3155555');
INSERT INTO persona VALUES (6, 'BONITA', 'vecinabonita@televisa.com.mx', 'VECINDAD APTO 34', 'LA VECINA', '316666');
INSERT INTO persona VALUES (7, 'CAMACHO', 'nelsoncamacho@televisa.com.mx', 'VECINDAD APTO 77', 'NELSON', '317777777');

/* Creamos algunos usuarios con sus roles */
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$is3S5DlVYaTjrer8KYt9l.ofUmOJpL19abFLpTuCvjlV47oWh2U46',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$iwxqrA5fUUG5gYTxrgcCt.ttmkPpSRoC3fEgEuEzlqd0A2Hx/ssYK',1, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
