package com.rc.logogenial.basicadminservice.domain.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RoleDto {
    String nombre;
    public RoleDto(String nombre) {
        this.setNombre(nombre);
    }
}
