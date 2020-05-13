package com.rc.logenialbackend.model;

import org.springframework.data.repository.CrudRepository;

import com.rc.logenialbackend.dto.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
