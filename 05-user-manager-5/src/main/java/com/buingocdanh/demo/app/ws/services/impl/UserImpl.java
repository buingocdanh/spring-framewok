package com.buingocdanh.demo.app.ws.services.impl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.buingocdanh.demo.app.ws.io.entities.UserEntity;
import com.buingocdanh.demo.app.ws.io.repository.UserRepository;
import com.buingocdanh.demo.app.ws.services.UserService;
import com.buingocdanh.demo.app.ws.ui.models.requests.UserRequest;
import com.buingocdanh.demo.app.ws.ui.models.respones.Message;

/***
 * LOi:
 * Consider defining a bean of type 'com.buingocdanh.demo.app.ws.services.UserService' in your configuration.
 * */

@Service
public class UserImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Message createUser(UserRequest userSignUpRequestModel) {
		Message ms = new Message();

		if (userRepository.findByEmail(userSignUpRequestModel.getEmail()) != null) {
			throw new RuntimeException("Account already exists!");
		}

		ModelMapper modelMapper = new ModelMapper();
		UserEntity userEntity = modelMapper.map(userSignUpRequestModel, UserEntity.class);

		userEntity.setStatus(true);
		
		userRepository.save(userEntity);

		ms.setTime(new Date());
		ms.setMessage("Account was created!");

		return ms;
	}

}
