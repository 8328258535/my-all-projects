package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.model.AuthorDto;
import com.user.model.AuthorEntity;
import com.user.model.AuthorLogin;

import com.user.service.IuserServiceImp;

import antlr.collections.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class UserController {

	@Autowired
	private IuserServiceImp iuserServiceImp;

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping("/registerUser")
	public AuthorEntity registerUser(@RequestBody AuthorEntity author) {
		return iuserServiceImp.saveAuthor(author);
	}

	@PostMapping("/signin")
	public String signin(AuthorLogin login) {
		String message = iuserServiceImp.authorLogin(login);
		return message;
	}

	@PostMapping("/addBook")
	public AuthorEntity addBook(@RequestBody AuthorDto dto) {
		AuthorEntity author1 = this.iuserServiceImp.saveBooks(dto);

		List books = this.restTemplate.getForObject("http://localhost:8084/addBook" + dto, List.class);

		return author1;

	}

}
