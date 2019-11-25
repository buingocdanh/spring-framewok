package com.buingocdanh.demo.app.ws.services.impl;

import java.util.Optional;

import org.springframework.web.bind.annotation.ResponseBody;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;

public interface UserService {
	
  public UserEntity createUser(String name,String email);
  
  public @ResponseBody Iterable<UserEntity> getAllUsers();
  
  public Optional<UserEntity> findByUserID(Integer id);
  
  public Boolean updateUser(UserEntity user);
  
  public Boolean deleteUser(Integer id);
  
}
