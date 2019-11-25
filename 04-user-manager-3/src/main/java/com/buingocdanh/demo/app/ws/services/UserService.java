package com.buingocdanh.demo.app.ws.services;



import org.springframework.web.bind.annotation.ResponseBody;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;

public interface UserService {

	  public String createUser(String name,String email,String password);
	  
	  public @ResponseBody Iterable<UserEntity> getAllUsers();
	  
	  public String findByUserID(Integer id);
	  
	  public Boolean updateUser(Integer userID,String newName);
	  
	  public String deleteUser(Integer id);
}
