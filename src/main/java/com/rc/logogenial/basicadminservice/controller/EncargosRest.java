package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.model.dto.EncargosDto;
import org.hibernate.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/v1/iec-ofv/encargos")
@CrossOrigin(origins= {"*"})
public class EncargosRest {

    @GetMapping("/consultar")
    public ResponseEntity<List<EncargosDto>> consultar(
            @RequestHeader(value="token", defaultValue = "aqui-token-obtenido-en-servicio-authorization-rest:/api/auth/generarToken") String token,
            @RequestHeader(value="ip", defaultValue = "Este-campo-es-detectado-al-pasar-por-nuestro-Gateway", required = false) String ip,
            @RequestParam Long idProyecto
            ) {
        List<EncargosDto> datos = null;
        return new ResponseEntity<List<EncargosDto>>(datos, HttpStatus.OK);
    }
}
