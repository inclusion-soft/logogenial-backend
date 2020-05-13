package com.rc.logenialbackend.service.impl;

import com.rc.logenialbackend.dto.User;
import com.rc.logenialbackend.exception.ResourceNotFoundException;
import com.rc.logenialbackend.model.UserRepository;
import com.rc.logenialbackend.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

	@Override
	public void delete(User user) throws ResourceNotFoundException {
		if (repository.findById(user.getId()).isPresent())
		{
			repository.delete(user);
		}
		throw new ResourceNotFoundException("User", "id",  Integer.toString(user.getId()));
	}

	@Override
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

	@Override
	public Iterable<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(int id) throws ResourceNotFoundException {
		if (repository.findById(id).isPresent())
		{
			return repository.findById(id).get();
		}
		else
		{
			throw new ResourceNotFoundException("User", "id",  Integer.toString(id));
		}
	}

	@Override
	public User update(User user) throws ResourceNotFoundException {
		if (repository.findById(user.getId()).isPresent())
		{
			return repository.save(user);
		}
		throw new ResourceNotFoundException("User", "id", Integer.toString(user.getId()));
	}

}
