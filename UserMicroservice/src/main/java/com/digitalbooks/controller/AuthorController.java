package com.digitalbooks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.entity.Author;
import com.digitalbooks.service.AuthorServiceImp;

@RestController
@CrossOrigin(origins = "http://agnular-digitalbooks-delpoy-ahamed.s3-website-us-east-1.amazonaws.com/")
public class AuthorController {

	@Autowired
	AuthorServiceImp authorServiceImp;
	
	@GetMapping("/hello")
	public String hello() {
		return "hi my name is taj";
		
	}

	@PostMapping("/signup")
	public Author registerAuthor(@RequestBody Author author) {
		return authorServiceImp.saveAuthor(author);
	}

	@PostMapping("/signin")
	public Author authorLogin(@RequestBody Author author) {
		Author loginAuthor = authorServiceImp.getAuthorByEmail(author.getAuthoremail());

		if (loginAuthor.getAuthorpassword().equals(author.getAuthorpassword()))

			return loginAuthor;
		return loginAuthor;

	}

}
