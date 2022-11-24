package com.swagger.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swagger.entity.User;

@RestController
@RequestMapping("/user/api")
public class UserController {
	
	@GetMapping("/list")
	public List<User> getUsers(){
		
		return Arrays.asList(new User("nishant", 20000L),
				new User("taj",10000L));
		
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable final String username) {
		return new User(username,10000L);
	}
	
	

}
