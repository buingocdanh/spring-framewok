package com.buingocdanh.demo.app.ws.ui.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.buingocdanh.demo.app.ws.io.entities.UserEntity;
import com.buingocdanh.demo.app.ws.services.impl.UserService;

@RestController
@RequestMapping("/ws")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping(path = "/getAllUsers", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}

	
	@GetMapping(path="/getUserByID/{userId}",
			produces = {MediaType.APPLICATION_JSON_VALUE}
	      )
	@ResponseBody
	public Object getUserByID(@Valid @PathVariable("userId") Integer id) {
		return userService.findByUserID(id); 
	}
	/**
	 * produces= {
	 * MediaType.APPLICATION_ATOM_XML_VALUE,MediaType.APPLICATION_JSON_VALUE} THONG
	 * BAO LOI "timestamp": "2019-11-21T15:18:51.576+0000", s"status": 406, "error":
	 * "Not Acceptable", "message": "Could not find acceptable representation",
	 * "path": "/ws/createUser"
	 */
	
	@PostMapping(path = "/createUser", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_FORM_URLENCODED_VALUE })
	@ResponseBody
	public UserEntity createUser(@RequestParam("name") String name, @RequestParam("email") String email) {
		return userService.createUser(name, email);
	}

	/**
	 * update user
	 */
	@SuppressWarnings("deprecation")
	@PutMapping(path = "/updateUser", produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
			MediaType.APPLICATION_JSON_UTF8_VALUE })
	@ResponseBody
	public Object updateUser(@RequestBody UserEntity u) {
		return userService.updateUser(u);
	}

	/**
	 * khong khai bao consumes va produces thi mac dinh ho tro tat ca dinh dang du
	 * lieu gui len va tra ve delete user
	 * 
	 * @DeleteMapping ( path="/deleteUser", produces =
	 *                {MediaType.APPLICATION_JSON_VALUE} )
	 */

	@DeleteMapping(
			        path = "/deleteUser", 
			    produces = { MediaType.APPLICATION_JSON_VALUE },
			    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE }
			)

	@ResponseBody
	public Boolean deleteUser(@Valid @RequestParam(value = "userId") Integer id) {
		return userService.deleteUser(id);
	}

}
