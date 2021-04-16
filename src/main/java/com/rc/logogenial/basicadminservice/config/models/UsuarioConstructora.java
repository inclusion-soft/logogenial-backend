package com.rc.logogenial.basicadminservice.config.models;

import lombok.Data;

@Data
public class UsuarioConstructora {
    int tipoIdentificacion;
    String password;
    String nit;
    boolean esClienteEmpresarial;
    String usuario;
}
