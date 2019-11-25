package com.buingocdanh.demo.app.ws.ui.controllers;

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
import com.buingocdanh.demo.app.ws.services.UserService;

@RestController
@RequestMapping("/ws")
public class UserController {

	@Autowired
	private UserService userService;

	/**
	 * Test: localhost:8080/user-managers/users/createUser Create a new user
	 * PostMapping(path="/add") // Map ONLY POST Requests ResponseBody means the
	 * returned String is the response, not a view name RequestParam means it is a
	 * parameter from the GET or POST request
	 * 
	 * @param name
	 * @param email
	 * @return
	 */
	@PostMapping(path = "/createUser")
	public @ResponseBody String createUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("password") String password) {
		userService.createUser(name, email, password);
		return "User was created!";
	}

	/**
	 * Test: localhost:8080/user-managers/users/getAllUsers Return all user This
	 * 
	 * @ResponseBody returns a JSON or XML with the users
	 * 
	 * @return
	 */
	@GetMapping(path = "/getAllUsers")
	public @ResponseBody Iterable<UserEntity> getAllUsers() {
		return userService.getAllUsers();
	}

	/**
	 * Test: localhost:8080/user-managers/users/getUserById/{userId} Get user by
	 * userId
	 * 
	 * @param userId
	 * @return
	 */
	@GetMapping(path = "/getUserById/{userId}")
	public @ResponseBody String getUserById(@PathVariable int userId) {
		return userService.findByUserID(userId);
	}

	/**
	 * Test: localhost:8080/user-managers/users/updateUserById/{userId}/{name}/{email}
	 * 
	 * @param userId
	 * @param name
	 * @param email
	 * @return string
	 */
	@PutMapping(path = "/updateUserById/{userId}&{name}")
	public @ResponseBody Boolean updateUserById(@PathVariable int userId, @PathVariable String name
			) {
		return userService.updateUser(userId, name);
	}

	/**
	 * Test: localhost:8080/user-managers/users/updateUserById/{userId}
	 * 
	 * @param userId
	 * @return
	 */
	@DeleteMapping(path = "/deleteUserById/{userId}")
	public @ResponseBody String deleteUserById(@PathVariable int userId) {
		return userService.deleteUser(userId);
	}
}