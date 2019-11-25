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
import com.buingocdanh.demo.app.ws.services.UserService;
import com.buingocdanh.demo.app.ws.ui.models.requests.UserRequest;
import com.buingocdanh.demo.app.ws.ui.models.respones.Message;

@RestController
@RequestMapping("/ws")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(path = "/createUser", 
			consumes  = { MediaType.APPLICATION_XML_VALUE,
			              MediaType.APPLICATION_JSON_VALUE }, 
			produces  = { MediaType.APPLICATION_XML_VALUE,
					      MediaType.APPLICATION_JSON_VALUE })
	  public Message createUser(@Valid @RequestBody UserRequest userSignUpRequestModel) {
		                  Message ms = userService.createUser(userSignUpRequestModel);
		  return ms;
	}

}