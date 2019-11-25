package com.buingocdanh.demo.app.ws.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;
import com.buingocdanh.demo.app.ws.io.repository.UserRepository;
import com.buingocdanh.demo.app.ws.services.UserService;

/***
 * LOi:
 * Consider defining a bean of type 'com.buingocdanh.demo.app.ws.services.UserService' in your configuration.
 * */
@Service
public class UserImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	@Override
	public String createUser(String name, String email, String password) {
		// TODO Auto-generated method stub
		UserEntity userEntity = new UserEntity();
		userEntity.setName(name);
		userEntity.setEmail(email);
		userEntity.setPassword(password);
		userEntity.setStatus(0);
		userRepository.save(userEntity);
		return "User was created!";
		
	}

	@Override
	public Iterable<UserEntity> getAllUsers() {
		// TODO Auto-generated method stub
		return (Iterable<UserEntity>) userRepository.getAllUser();
	}

	@Override
	public String findByUserID(Integer userId) {
		// TODO Auto-generated method stub
		if (userRepository.findById(userId).isPresent()) {
			return "User is: " + userRepository.findById(userId);
		} else {
			return "Use does not exist";
		}
	}

	@Override
	public Boolean updateUser(Integer userId, String newName) {
		// TODO Auto-generated method stub
		if (userRepository.findById(userId).isPresent()) {
			Optional<UserEntity> userEntity = userRepository.findById(userId);
			UserEntity entity = userEntity.get();

			entity.setName(newName);
			
			userRepository.save(entity);

			return true;
		} else {
			return false;
		}
	}

	@Override
	public String deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		if (userRepository.findById(userId).isPresent()) {
			userRepository.deleteById(userId);
			return "User was delete with id: " +userId;
		} else {
			return "Use does not exist";
		}
	}

}
