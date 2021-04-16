package com.rc.logogenial.basicadminservice.controller;

import com.rc.logogenial.basicadminservice.exception.CustomApplicationException;
import com.rc.logogenial.basicadminservice.model.dto.*;
import com.rc.logogenial.basicadminservice.model.dto.fuv.*;
import com.rc.logogenial.basicadminservice.model.dto.RegistroTercero.CreacionTerceroDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.DatosGeneralesDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.EntrevistaDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.IdentificacionBienDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.InformacionFinancieraDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.OperacionInternacionalDto;
import com.rc.logogenial.basicadminservice.model.dto.fuv.OrigenFondoDto;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

@Controller
@RequestMapping("/v1/iec-ofv/fuv")
@CrossOrigin(origins= {"*"})
public class FormularioUnicoVinculacionRest {

//	private UsuarioSrv usuarioSrv;
//
//	private GestionarSifiDao gestionarSifi;
//
//	private FormularioVinculacionSrv formularioVincularionSrv;



//	@Autowired
//	public FormularioVinculacionRest(UsuarioSrv usuarioSrv, GestionarSifiDao gestionarSifi,
//			FormularioVinculacionSrv formularioVincularionSrv, CatalogoErroresSrvImpl erroresSrv,
//			UsuariosEncargoRepo usuarioEncargoDao) {
//
//	}

    // SERVICIO FORMULARIO DE VINCULACION

    @CrossOrigin
    @PostMapping("/editarFuv")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Suceess|OK"),
            @ApiResponse(code = 400, message = "idProyecto incorrecto"),
            @ApiResponse(code = 401, message = "Falló la autenticación del usuario"),
            @ApiResponse(code = 403, message = "El usuario no tiene permisos sobre el proyecto informado"),
            @ApiResponse(code = 404, message = "El proyecto no existe") })
    public ResponseEntity<com.rc.logogenial.basicadminservice.model.dto.fuv.DatosGeneralesDto> editarFuv(@RequestParam String idProyecto, @RequestBody DatosGeneralesDto creacionTerceroDto)
            throws CustomApplicationException {
        return new ResponseEntity<com.rc.logogenial.basicadminservice.model.dto.fuv.DatosGeneralesDto>(HttpStatus.OK);
    }

    /**
     * Método encargado de realizar la consulta del idFormulario a partir del
     * identificador del usuario y del encargo fiduciario.
     *
     * @param idUsuario Identificador único del usuario.
     * @param idEncargo Identificador único del encargo fiduaciario.
     * @return Long Identificador único del formulario de vinculación.
     */
    @CrossOrigin
    @GetMapping("/consultarIdFormulario/{idUsuario}/{idEncargo}")
    @ApiIgnore
    public ResponseEntity<?> consultarIdFormulario(@PathVariable("idUsuario") Long idUsuario,
                                                   @PathVariable("idEncargo") Long idEncargo) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de realizar la consulta de cada una de las secciones del
     * formulario de vinculación para una persona natural.
     *
     * @param idFormulario Identificador único del formulario de vinculación.
     * @return FormularioVinculacionPNDto
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarFormularioPersonaNatural/{idFormulario}")
    public ResponseEntity<?> consultarFormularioPN(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de almacenar la información de la seccion Datos Generales.
     *
     * @param datosGenerales Objeto que representa los campos de la sección.
     * @param idUsuario      Identificador único del Ususario.
     * @param idEncargo      Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionDatosGenerales/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarDatosGenerales(@PathVariable("idUsuario") long idUsuario,
                                                   @PathVariable("idEncargo") long idEncargo, @RequestBody DatosGeneralesDto datosGenerales) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    @ApiIgnore
    private String validarDatosGenerales(DatosGeneralesDto datosGenerales, long idUsuario, long idEncargo) {
        return new String();
    }

    /**
     * Método encargado de consultar un registro en la entidad DatosGeneralesEnti a
     * partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionDatosGenerales/{idFormulario}")
    public ResponseEntity<?> consultarDatosGenerales(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS SECCION PERSONA PUBLICAMENTE EXPUESTA

    /**
     * Método encargado de almacenar la información de la seccion Persona
     * Públicamente Expuesta.
     *
     * @param personaPe Objeto que representa los campos de la sección.
     * @param idUsuario Identificador único del Ususario.
     * @param idEncargo Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionPersonaPe/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarPersonaPe(@PathVariable("idUsuario") long idUsuario,
                                              @PathVariable("idEncargo") long idEncargo, @RequestBody PersonaPeDto personaPe) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad PersonaPeEnti a
     * partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionPersonaPe/{idFormulario}")
    public ResponseEntity<?> consultarPersonaPe(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS INFORMACION_FINANCIERA

    /**
     * Método encargado de almacenar la información de la seccion Informacion
     * Financiera.
     *
     * @param informacionFinanciera Objeto que representa los campos de la sección.
     * @param idUsuario             Identificador único del Ususario.
     * @param idEncargo             Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionInformacionFinanaciera/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarInformacionFinanciera(@PathVariable("idUsuario") long idUsuario,
                                                          @PathVariable("idEncargo") long idEncargo, @RequestBody InformacionFinancieraDto informacionFinanciera) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad
     * InformacionFinancieraEnti a partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionInformacionFinanciera/{idFormulario}")
    public ResponseEntity<?> consultarInformacionFinanciera(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS ORIGEN_FONDOS

    /**
     * Método encargado de almacenar la información de la seccion Origen Fondos.
     *
     * @param origenesFondosData Objeto que representa los campos de la sección.
     * @param idUsuario          Identificador único del Ususario.
     * @param idEncargo          Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionOrigenFondos/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarOrigenesFondos(@PathVariable("idUsuario") long idUsuario,
                                                   @PathVariable("idEncargo") long idEncargo, @RequestBody List<OrigenFondoDto> origenesFondosData) {

        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad OrigenFondoEnti a
     * partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionOrigenFondos/{idFormulario}")
    public ResponseEntity<?> consultarOrigenFondo(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS AUTORIZACIONES

    /**
     * Método encargado de almacenar la información de la seccion Autorizaciones.
     *
     * @param autorizaciones Objeto que representa los campos de la sección.
     * @param idUsuario      Identificador único del Ususario.
     * @param idEncargo      Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionAutorizaciones/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarAutorizaciones(@PathVariable("idUsuario") long idUsuario,
                                                   @PathVariable("idEncargo") long idEncargo, @RequestBody AutorizacionesDto autorizaciones) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad AutorizacionesEnti a
     * partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionAutorizaciones/{idFormulario}")
    public ResponseEntity<?> consultarAutorizaciones(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS AUTOCERTIFICACIONES

    /**
     * Método encargado de almacenar la información de la seccion Autocertificación.
     *
     * @param autocertificaciones Objeto que representa los campos de la sección.
     * @param idUsuario           Identificador único del Ususario.
     * @param idEncargo           Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionAutocertificacion/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarAutocertificacion(@PathVariable("idUsuario") long idUsuario,
                                                      @PathVariable("idEncargo") long idEncargo, @RequestBody List<FatcaCrsDto> autocertificaciones) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad
     * AutocertificacionsEnti a partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionAutocertificacion/{idFormulario}")
    public ResponseEntity<?> consultarAutocertificacion(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS OPERACIONES_INTERNACIONALES

    /**
     * Método encargado de almacenar la información de la seccion Operaciones
     * Internacionales.
     *
     * @param operacionesInternacionales Objeto que representa los campos de la
     *                                   sección.
     * @param idUsuario                  Identificador único del Ususario.
     * @param idEncargo                  Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionOperacionesInternacionales/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarOperacionesInternacionales(@PathVariable("idUsuario") long idUsuario,
                                                               @PathVariable("idEncargo") long idEncargo,
                                                               @RequestBody List<OperacionInternacionalDto> operacionesInternacionales) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Limpia todo el listado de operaciones internacionales.
     *
     * @param idUsuario
     * @param idEncargo
     * @param idFormulario
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @DeleteMapping("/eliminarOperacionesInternacionales/{idUsuario}/{idEncargo}/{idFormulario}")
    public ResponseEntity<?> eliminarOperacionInternacional(@PathVariable Long idUsuario, @PathVariable Long idEncargo,
                                                            @PathVariable Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Chequea el estado de si tiene o no operaciones internacionales
     *
     * @param idFormulario
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarEstadoOperacionesInternacionales/{idFormulario}")
    public ResponseEntity<?> consultarEstadoOracionesInterancionales(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad
     * OperacionesInternacionalesEnti a partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionOperacionesInternacionales/{idFormulario}")
    public ResponseEntity<?> consultarOracionesInterancionales(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS SECCION PERFIL DE RIESGO

    /**
     * Método encargado de almacenar la información de la seccion Perfil de Riesgo.
     *
     * @param perfilRiesgo Objeto que representa los campos de la sección.
     * @param idUsuario    Identificador único del Ususario.
     * @param idEncargo    Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionPerfilRiesgo/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarPerfilRiesgo(@PathVariable("idUsuario") long idUsuario,
                                                 @PathVariable("idEncargo") long idEncargo, @RequestBody PerfilRiesgoDto perfilRiesgo) {
        //FormularioVinculacionEnti formulario = new FormularioVinculacionEnti();
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad PerfilRiesgoEnti a
     * partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionPerfilRiesgo/{idFormulario}")
    public ResponseEntity<?> consultarPerfilRiesgo(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS SECCION IDENTIFICACION BIEN

    /**
     * Método encargado de almacenar la información de la seccion Identificación
     * Bien.
     *
     * @param identificacionBien Objeto que representa los campos de la sección.
     * @param idUsuario          Identificador único del Ususario.
     * @param idEncargo          Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionIdentificacionBien/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarIdentificacionBien(@PathVariable("idUsuario") long idUsuario,
                                                       @PathVariable("idEncargo") long idEncargo, @RequestBody IdentificacionBienDto identificacionBien) {
        //FormularioVinculacionEnti formulario = new FormularioVinculacionEnti();
        // Verificamos si ya existe el formulario de vinculación.
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad
     * IdentificacionBienEnti a partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionIdentificacionBien/{idFormulario}")
    public ResponseEntity<?> consultarIdentificacionBien(@PathVariable("idFormulario") long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS SECCION DEPENDENCIA DE UN TERCERO

    /**
     * Método encargado de almacenar la información de la seccion Dependencia
     * Tercero.
     *
     * @param dependenciaTercero Objeto que representa los campos de la sección.
     * @param idUsuario          Identificador único del Ususario.
     * @param idEncargo          Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarSeccionDependenciaTercero/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarDependenciaTercero(@PathVariable("idUsuario") long idUsuario,
                                                       @PathVariable("idEncargo") long idEncargo, @RequestBody DependenciaTerceroDto dependenciaTercero) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Verifica si tiene o no dependencia con tercero.
     *
     * @param idFormulario
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarEstadoDependenciaTercero/{idFormulario}")
    public ResponseEntity<?> consultarEstadoDependenciaTercero(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad
     * DependenciaTerceroEnti a partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarSeccionDependenciaTercero/{idFormulario}")
    public ResponseEntity<?> consultarDependenciaTercero(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    // SERVICIOS SECCION ENTREVISTA

    /**
     * Método encargado de almacenar la información de la seccion Dependencia
     * Tercero.
     *
     * @param entrevista Objeto que representa los campos de la sección.
     * @param idUsuario  Identificador único del Ususario.
     * @param idEncargo  Identificador único del encargo.
     * @return Instancia del objeto creado en la base de datos.
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/guardarEntrevista/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> guardarEntrevista(@PathVariable("idUsuario") long idUsuario,
                                               @PathVariable("idEncargo") long idEncargo, @RequestBody EntrevistaDto entrevista) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método encargado de consultar un registro en la entidad
     * DependenciaTerceroEnti a partir del Id del formulario de vinculación.
     *
     * @param idFormulario id Identificador único del formulario de vinculación.
     * @return Instancia del objeto almacenado.
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarEntrevista/{idFormulario}")
    public ResponseEntity<?> consultarEntrevista(@PathVariable("idFormulario") Long idFormulario) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Expone la consulta de los origenes de fondos de todos los terceros de un
     * encargo.
     *
     * @param idEncargo Identificador del encargo en el cual el usuario esta
     *                  llenando el formulario
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    @GetMapping("/consultarOrigenFodosEncargo/{idEncargo}")
    public ResponseEntity<?> consultarOrigenFodosEncargo(@PathVariable("idEncargo") Long idEncargo) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método para enviar el formulario de vinculación dando por terminado el
     * proceso de dilingenciamiento del formulario.
     *
     * @param idUsuario Identificador de usuario que llena el formulario
     * @param idEncargo Identificador del encargo en el cual el usuario esta
     *                  llenando el formulario
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/enviarFormulario/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> enviarFormulario(@PathVariable("idUsuario") long idUsuario,
                                              @PathVariable("idEncargo") long idEncargo, @RequestBody EncabezadoFormularioDto encabezado) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Método que actualiza el estado del formulario a NO enviado para que el
     * cliente o la Sala de Ventas pueda editar la información
     *
     * @param idUsuario
     * @param idEncargo
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @PostMapping("/regresarFormulario/{idUsuario}/{idEncargo}")
    public ResponseEntity<?> regresarFormulario(@PathVariable("idUsuario") long idUsuario,
                                                @PathVariable("idEncargo") long idEncargo) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }

    /**
     * Servicio que consulta los diferentes formularios de vinculacion en tramites
     * cerrados de un proyecto seleccionado
     *
     *                  llenando el formulario
     * @return
     */
    @ApiIgnore
    @CrossOrigin
    //@KafkaLogExecution
    @GetMapping("/consultar-formularios-finalizados-proyecto/{idProyecto}")
    public ResponseEntity<?> consultarFormulariosFinalizadosProyecto(@PathVariable("idProyecto") Long idProyecto) {
        return new ResponseEntity<Object>(HttpStatus.OK);
    }
}