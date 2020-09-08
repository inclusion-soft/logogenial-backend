package com.rc.logogenial.basicadminservice.controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.rc.logogenial.basicadminservice.config.JwtTokenUtil;
import com.rc.logogenial.basicadminservice.config.models.JwtRequest;
import com.rc.logogenial.basicadminservice.config.models.JwtResponse;
import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.service.impl.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class JwtAuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService jwtInMemoryUserDetailsService;

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/sigin", method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody Usuario dataUsuario)
            throws Exception {

        Usuario usuario = usuarioService.create(dataUsuario);
        return ResponseEntity.ok(usuario);
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> generateAuthenticationToken(@RequestBody JwtRequest authenticationRequest)
            throws Exception {

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());

        Usuario usuario = usuarioService.findByUsername(authenticationRequest.getUsername());

        if(usuario == null) {
//            logger.error("Error en el login: no existe el usuario '"+username+"' en el sistema!");
//            throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+username+"' en el sistema!");
        }

        List<GrantedAuthority> authorities = usuario.getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getNombre()))
                //.peek(authority -> logger.info("Role: " + authority.getAuthority()))
                .collect(Collectors.toList());


        final UserDetails userDetails = new User(usuario.getUsername(), usuario.getPassword(),  usuario.getActivo() == true ? true: false, true, true, true, authorities);

//        final UserDetails userDetails = jwtInMemoryUserDetailsService
//                .loadUserByUsername(authenticationRequest.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void authenticate(String username, String password) throws Exception {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
