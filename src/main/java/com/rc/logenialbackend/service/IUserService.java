package com.rc.logenialbackend.service;


import com.rc.logenialbackend.dto.User;
import com.rc.logenialbackend.exception.ResourceNotFoundException;

public interface IUserService {

    User create(User user);

    void delete(User user) throws ResourceNotFoundException;
    
    void deleteById(int id) throws ResourceNotFoundException;

    Iterable<User> findAll();

    User findById(int id) throws ResourceNotFoundException;
    
    User update(User user) throws ResourceNotFoundException;
    
}
