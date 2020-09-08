package com.rc.logogenial.basicadminservice.service.impl;

import com.rc.logogenial.basicadminservice.entity.Usuario;
import com.rc.logogenial.basicadminservice.exception.ResourceNotFoundException;

import com.rc.logogenial.basicadminservice.model.shared.ResultSearchData;
import com.rc.logogenial.basicadminservice.model.repository.UsuarioRepository;
import com.rc.logogenial.basicadminservice.service.IGenericService;
import com.rc.logogenial.basicadminservice.service.IUsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService extends  BaseService<Usuario> implements IGenericService<Usuario>,  UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    private Logger logger = LoggerFactory.getLogger(UsuarioService.class);


    @Override
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByUsername(username);

        if(usuario == null) {
            logger.error("Error en el login: no existe el usuario '"+username+"' en el sistema!");
            throw new UsernameNotFoundException("Error en el login: no existe el usuario '"+username+"' en el sistema!");
        }

        List<GrantedAuthority> authorities = usuario.getRoles()
                .stream()
                .map(role -> new SimpleGrantedAuthority(role.getNombre()))
                .peek(authority -> logger.info("Role: " + authority.getAuthority()))
                .collect(Collectors.toList());

        return new User(usuario.getUsername(), usuario.getPassword(),  usuario.getActivo() == true ? true: false, true, true, true, authorities);
    }

    @Transactional(readOnly=true)
    public Usuario findByUsername(String username) {
        return repository.findByUsername(username);
    }

    public Usuario create(Usuario Usuario) {
        return repository.save(Usuario);
    }

    public void delete(Usuario Usuario) throws ResourceNotFoundException {
        if (repository.findById(Usuario.getId()).isPresent())
        {
            repository.delete(Usuario);
        }
        throw new ResourceNotFoundException("User", "id",  Integer.toString(Usuario.getId()));
    }

    public void deleteById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            repository.deleteById(id);
        }
        else
        {
            throw new ResourceNotFoundException("User", "id", Integer.toString(id));
        }
    }

    public Iterable<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(int id) throws ResourceNotFoundException {
        if (repository.findById(id).isPresent())
        {
            return repository.findById(id).get();
        }
        else
        {
            throw new ResourceNotFoundException("User", "id",  Integer.toString(id));
        }
    }

    public Usuario update(Usuario Usuario) throws ResourceNotFoundException {
        if (repository.findById(Usuario.getId()).isPresent())
        {
            return repository.save(Usuario);
        }
        throw new ResourceNotFoundException("User", "id", Integer.toString(Usuario.getId()));
    }

    @Override
    public ResultSearchData<Usuario> findAllSearch(int page, int size, String sortBy, String sortOrder) {
        Pageable paging = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Usuario> pagedResult = repository.findAll(paging);
        return (ResultSearchData<Usuario>) this.getResultSearch(pagedResult);
    }

}
