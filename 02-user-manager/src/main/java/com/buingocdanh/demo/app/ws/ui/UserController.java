package com.buingocdanh.demo.app.ws.ui;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.buingocdanh.demo.app.ws.io.entities.UserEntity;
import com.buingocdanh.demo.app.ws.io.repository.UserRepository;


@RestController
@RequestMapping("/ws")
public class UserController {

	@Autowired
	UserRepository userRepository;
	@PostMapping(path = "/createUser")
	public @ResponseBody String createUser(@RequestParam String name, @RequestParam String email) {
		UserEntity userEntity = new UserEntity();
		userEntity.setName(name);
		userEntity.setEmail(email);
		userRepository.save(userEntity);
		return "User was created!";
	}

	/**
	 * Get function
	 * 
	 * @return
	 */
	@GetMapping(value = "/getAllUser")
	@ResponseBody
	public List<UserEntity> getAllUser() {
		return userRepository.findAll();
	}
	
	/**
	 * get user by id*/
	
	@GetMapping(value="/getUserByID/{userId}")
	@ResponseBody
	public Optional<UserEntity> getUserByID(@PathVariable("userId") int userId) {
		//return userRepository.getOne(userId);: LOI O ham getOne()
		Optional<UserEntity> user=userRepository.findById(userId);
		if(user==null) {
			return null;
		}else {
			return user;
		}
	}
	
	/**
	 * update user
	 * @RequestBody: dung cho truyen du lieu nag JSON
	 * */
	
	@PutMapping(path="/updateUser",
			produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE,org.springframework.http.MediaType.APPLICATION_ATOM_XML_VALUE,},
	        consumes = {org.springframework.http.MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    @ResponseBody
    public boolean updateUser(@Valid UserEntity user ) {
		UserEntity u=userRepository.getOne(user.getId());
		if(u!=null) {
			u.setName(user.getName());
			u.setEmail(user.getEmail());
			userRepository.save(u);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 
	 * delete user*/
	@DeleteMapping(path="/deleteUser/{userID}")
	@ResponseBody
	public boolean deleteUser(@Valid @PathVariable("userID") int userID ) {
		if(userRepository.getOne(userID)!=null) {
			userRepository.deleteById(userID);
			return true;
		}else {
			return false;
		}
	  
	}
}
