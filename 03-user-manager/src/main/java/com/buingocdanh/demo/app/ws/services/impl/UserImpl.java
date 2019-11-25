package com.buingocdanh.demo.app.ws.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;
import com.buingocdanh.demo.app.ws.io.repository.UserRepository;

@Service
public class UserImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserEntity createUser(String name, String email) {
		// TODO Auto-generated method stub
		UserEntity userEntity = new UserEntity();
		userEntity.setEmail(email);
		userEntity.setName(name);

		UserEntity res = userRepository.save(userEntity);
		if (res != null) {
			//when save data success , res will have id
			return res;
		} else {
			return null;
		}

	}

	@Override
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<UserEntity> findByUserID(Integer id) {
		// TODO Auto-generated method stub
		Optional<UserEntity> res = userRepository.findById(id);
		return res;
	}

	@Override
	public Boolean updateUser(UserEntity user) {
		// TODO Auto-generated method stub
		UserEntity res = userRepository.getOne(user.getId());

		if (res != null) {
			res.setName(user.getName());
			res.setEmail(user.getEmail());
			userRepository.save(res);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public Boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		UserEntity res = userRepository.getOne(id);
		if (res != null) {
			userRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}

}
