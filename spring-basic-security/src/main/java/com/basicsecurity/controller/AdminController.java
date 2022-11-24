package com.basicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
	
	@GetMapping("/signin")
	public String login() {
		return "Tajdar Ahamed";
	}

}
