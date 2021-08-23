package com.rc.logogenial.basicadminservice.utils;

import com.rc.logogenial.basicadminservice.domain.dto.TokenDto;
import com.rc.logogenial.basicadminservice.domain.dto.UsuarioDto;
import com.rc.logogenial.basicadminservice.exception.BadCommunicationException;
import com.rc.logogenial.basicadminservice.exception.ConflictException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClienteRestSrv {

    RestTemplate restTemplate;

    @Autowired
    private Environment env;

    HttpHeaders headers = new HttpHeaders();

    private String informacionServicio;

    public ClienteRestSrv(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public UsuarioDto obtenerUsuario(String token) throws BadCommunicationException, ConflictException {

        String rutaServicio = env.getProperty(ConstantesLogogenia.ServiciosExternos.AUTENTICADOR_RUTA);

        String resultadoConsulta = null;
        try {
            resultadoConsulta = ejecutarServicioObtenerUsuario(rutaServicio, token);
        } catch (BadCommunicationException e) {
            String mensajeEjecucion = String.format(
                    "Error al ejecutar servicio para consultar usuarios. ruta: %s. Parametros: Token: %s. TagRastreo: %s. " +
                            "Error: %s. Causa: %s",  rutaServicio, token, "CRS-OU-703", e.getMessage(), e.getCause());
            throw new BadCommunicationException( mensajeEjecucion );
        }
        UsuarioDto encargosResponse;
        try {
            encargosResponse = (UsuarioDto) ConversorJSON.fromJSON(resultadoConsulta,
                    UsuarioDto.class);
        } catch (Exception ex) {

            String mensajeEstraccionDatos = String.format(
                    "Error al extraer datos que llegaron del servicio de autenticacion. ruta: %s. Parametros: Token: %s. TagRastreo: %s. " +
                            "Error: %s. Causa: %s",  rutaServicio, token, "CRS-OU-062", ex.getMessage(), ex.getCause());
            throw new ConflictException(mensajeEstraccionDatos);
        }
        return encargosResponse;
    }

    private String ejecutarServicioObtenerUsuario(String rutaServicio, String token)
            throws BadCommunicationException {
        ResponseEntity<String> respuestaServicio = null;
        headers = this.getHeaderWithAutorization(token);
//        headers.add("Content-Type", "application/json");
        this.informacionServicio = String.format(" RutaServicio: %s, Metodo:%s, Encabezados: %s,  Json: %s  ",
                rutaServicio, "Get", headers.toString(), token);
        try{
            TokenDto tokenDto = new TokenDto(token);
            HttpEntity<String> entity = new HttpEntity<> ( headers);
            LogsLogogenia.info( " Inicia consumo de servicio: Consulta de encargos."
                    + informacionServicio );
            respuestaServicio =  restTemplate.exchange(rutaServicio, HttpMethod.GET, entity, String.class);
            LogsLogogenia.info( " Finaliza OK de servicio: Consulta de encargos."
                    + informacionServicio );
        }catch (Exception e){
            throw new BadCommunicationException("Error consultando servicio: Consulta de encargos del proyecto.");
        }
        return respuestaServicio.getBody();
    }

    private HttpHeaders getHeaderWithAutorization(String token_){
        String token = "Bearer " + token_;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", token);
        return  headers;
    }

}
