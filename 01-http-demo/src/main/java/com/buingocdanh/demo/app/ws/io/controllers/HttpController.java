package com.buingocdanh.demo.app.ws.io.controllers;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test: localhost:8080/01-spring-boot-ws-crud-method-simple/ws
 * HTTPController Demo Controller
 * @author richard
 *
 */
@RestController
@RequestMapping("/ws")
public class HttpController {

	/**
	 * Method: Get
	 */
	@GetMapping
	public String getHTTPMethod() {
		return "GET Method was called! / Get";
	}
	
	/**
	 * Method: Post
	 */
	@PostMapping
	public String postHTTPMethod() {
		return "POST Method was called! / Create";
	}
	
	/**
	 * Method: Put
	 */
	@PutMapping
	public String putHTTPMethod() {
		return "PUT Method was called! / Update";
	}
	
	@DeleteMapping
	public String deleteHTTPMethod() {
		return "DELETE Method was called! / DELETE";
	}
}

