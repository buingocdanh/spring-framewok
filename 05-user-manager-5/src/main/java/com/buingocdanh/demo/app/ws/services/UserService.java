package com.buingocdanh.demo.app.ws.services;



import com.buingocdanh.demo.app.ws.ui.models.requests.UserRequest;
import com.buingocdanh.demo.app.ws.ui.models.respones.Message;

public interface UserService {
	  
	  public Message createUser(UserRequest userRequest);
	  
	/*
	 * public @ResponseBody Iterable<UserEntity> getAllUsers();
	 * 
	 * public String findByUserID(Integer id);
	 * 
	 * public Boolean updateUser(Integer userID,String newName);
	 * 
	 * public Message deleteUser(Integer id);
	 */
}
