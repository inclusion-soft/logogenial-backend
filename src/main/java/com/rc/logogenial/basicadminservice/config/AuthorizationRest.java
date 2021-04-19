package com.rc.logogenial.basicadminservice.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.rc.logogenial.basicadminservice.config.models.JwtResponse;
import com.rc.logogenial.basicadminservice.config.models.Login;
import com.rc.logogenial.basicadminservice.config.models.UsuarioConstructora;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ErrorPersistException;
import com.rc.logogenial.basicadminservice.exception.MaxTryCountLoginException;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;
import com.rc.logogenial.basicadminservice.exception.UnauthorizedRequestException;
import com.rc.logogenial.basicadminservice.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

// TODO: Auto-generated Javadoc
/**
 * The Class AuthorizationController.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthorizationRest {

    /** The ldap properties. */
//    @Value("${spring.ldap.properties}")
//    private String ldapProperties;

    /** The authentication manager. */
    @Autowired
    AuthenticationManager authenticationManager;

    private AESEncryptionDecryption aesEncryption = new AESEncryptionDecryption();

    /** The user repository. */
    @Autowired
    UsuarioService usuarioService;

    /** The lista item repository. */
//    @Autowired
//    RepositoryListaItem listaItemRepository;

    /** The jwt provider. */
    @Autowired
    JwtProvider jwtProvider;

    /** The ldap authentication manager. */
//    @Autowired
//    UmvLdapAuthenticationProvider ldapAuthenticationManager;


    /**
     * Authenticate.
     *
     * @param loginRequest the login request
     * @return the response entity
     * @throws UnauthorizedRequestException the unauthorized request exception
     */
    @ApiIgnore
    @PostMapping("/login")
    public ResponseEntity<?> authenticate(@Valid @RequestBody Login loginRequest) throws UnauthorizedRequestException {
        Authentication authentication = null;
        Long contador = 0L;
        if (loginRequest.getUsername() != null) {
            String username = aesEncryption.encrypt(loginRequest.getUsername());
            Usuario user = usuarioService.findByUsername(loginRequest.getUsername());
            if(user.getIntentosFallidos()> 2){
                throw new MaxTryCountLoginException("Se ha superado el máximo de inténtos permitidos");
            }
            if (user != null) {
                try {
                    if (user.getEstado()== 1) {
                        authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                                loginRequest.getUsername(), loginRequest.getPassword()));

                        if (authentication.isAuthenticated()) {
                            Long exitososPrevios = user.getIntentosExitosos() != null ? user.getIntentosExitosos()  : 0L;
                            contador = exitososPrevios + 1;
                            user.setIntentosExitosos(contador);
                        } else {
                            Long fallidosPrevios = user.getIntentosFallidos() != null ? user.getIntentosFallidos()  : 0L;
                            contador = fallidosPrevios + 1;
                            user.setIntentosFallidos(contador);
                            throw new UnauthorizedRequestException("Usuario o clave incorrectos.");
                        }
                        usuarioService.update(user);
                    } else {
                        throw new UnauthorizedRequestException("El usuario no esta activo en el sistema.");
                    }
                }
                // Si hubo un error, aumenta el numero de intentos fallidos.
                catch (Exception e) {
                    contador = user.getIntentosFallidos() + 1;
                    user.setIntentosFallidos(contador);
                    try {
                        usuarioService.update(user);
                    } catch ( ResourceNotFoundException resourceNotFoundException) {
                        throw new ErrorPersistException("Error actualizando datos fallidos de usuario");
                    }
                }
            } else {
                throw new UnauthorizedRequestException("Usuario o clave incorrectos.");
            }
        }
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new JwtResponse(jwt));
    }

    @PostMapping("/generarToken")
    public ResponseEntity<?> generarToken(@Valid @RequestBody UsuarioConstructora loginRequest) throws UnauthorizedRequestException {
        Authentication authentication = null;
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new JwtResponse(jwt));
    }

    /**
     * Unauthorized request handler.
     *
     * @param e the e
     * @return the list
     */
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    @ExceptionHandler(UnauthorizedRequestException.class)
//    public List<FieldErrorMessage> unauthorizedRequestHandler(UnauthorizedRequestException e) {
//        FieldErrorMessage error = new FieldErrorMessage();
//        error.setMessage(e.getMessage());
//        List<FieldErrorMessage> fieldErrors = new ArrayList<FieldErrorMessage>();
//        fieldErrors.add(error);
//        return fieldErrors;
//    }

}