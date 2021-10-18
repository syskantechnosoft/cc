package com.tcs.mywebservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String welcome() {
		return "Welcome to Spring Based Web Service";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!!Welcome to Spring Boot!!!";
	}
}
