/* GP1292 inicio - jortiz.ext - 22012019 - Nuevo archivo */
package com.rc.logogenial.basicadminservice.controller;

import java.io.IOException;

import com.rc.logogenial.basicadminservice.exception.CustomApplicationException;
import com.rc.logogenial.basicadminservice.model.dto.RegistroTercero.CreacionTerceroDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.DatosVinculacionDto;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rc.logogenial.basicadminservice.model.dto.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController("RegistroRest")
@RequestMapping("/v1/iec-ofv/registro")
@ComponentScan
public class RegistroRest {

	@ApiIgnore
	@PostMapping("/crearTerceroRobot/{idTareaReintento}/{usuarioModificacion}")
	public ResponseEntity<?> crearTerceroR(@PathVariable("idTareaReintento") long idTareaReintento,
										   @PathVariable("usuarioModificacion") String usuarioModificacion,
										   @RequestBody PrevinculacionTerceroDto previnculacionTerceroDto) {
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@CrossOrigin
	@PostMapping("/crearTercero")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Suceess|OK", response = CreacionTerceroDto.class),
			@ApiResponse(code = 500, message = "Error interno en el servicio", response = ErrorRequestCustom.class),
			@ApiResponse(code = 401, message = "Falló la autenticación del usuario"),
			@ApiResponse(code = 403, message = "El usuario no tiene permisos sobre el proyecto informado"),
			@ApiResponse(code = 404, message = "El proyecto no existe") })
	public ResponseEntity<CreacionTerceroDto> crearTercero(
			@RequestHeader(value="token", defaultValue = "aqui-token-obtenido-en-servicio-authorization-rest:/api/auth/generarToken") String token,
			@RequestHeader(value="ip", defaultValue = "Este-campo-es-detectado-al-pasar-por-nuestro-Gateway", required = false) String ip,
			@RequestBody CreacionTerceroDto terceroDto)
			throws CustomApplicationException {
		return new ResponseEntity<CreacionTerceroDto>(HttpStatus.OK);
	}

	
	/**
	 * Método que elimina lógicamente un usuario
	 *
	 * @return
	 * @throws CustomApplicationException
	 * @throws IOException
	 */
	@ApiIgnore
	@CrossOrigin
	@PostMapping("/eliminarTercero")

	public ResponseEntity<?> eliminarTercero(@RequestBody ConsultaUsuariosEncargoDto usuarioEliminar,
			@RequestHeader(value = "token") String token) throws IOException, CustomApplicationException {
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	/**
	 * Método que inactiva una tarjeta y no la deja disponible para continuar con el
	 * proceso, puede inactivarse por procesado físico o no disponible para
	 * continuar
	 *
	 * @param numeroEncargo
	 * @param motivoInactivacion
	 * @param observacion
	 * @param token
	 * @return
	 */
	@ApiIgnore
	@CrossOrigin
	@PostMapping("/inactivarTarjeta/{numeroEncargo}/{motivoInactivacion}")
	public ResponseEntity<?> inactivarTarjeta(@PathVariable("numeroEncargo") String numeroEncargo,
			@PathVariable("motivoInactivacion") Long motivoInactivacion, @RequestBody String observacion,
			@RequestHeader(value = "token") String token) {
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	/**
	 * @param usuarioEliminar
	 * @param token
	 * @return
	 * @throws IOException
	 * @throws CustomApplicationException
	 */
	@ApiIgnore
	@CrossOrigin
	@PostMapping("/activar-tercero-encargo")
	public ResponseEntity<?> activarTerceroEncargo(@RequestBody ConsultaUsuariosEncargoDto usuarioEliminar,
			@RequestHeader(value = "token") String token) throws IOException, CustomApplicationException {
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
