package com.pizzaplace2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pizzapalace2.service.UserService;

@RestController
public class UserController {
	
	private UserService uCommand;
	
	@Autowired
	public UserController(UserService uCommand) {
		super();
		this.uCommand = uCommand;
	}


}
