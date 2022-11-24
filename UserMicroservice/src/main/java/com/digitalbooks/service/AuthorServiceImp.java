package com.digitalbooks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.entity.Author;

@Service
public class AuthorServiceImp {
	
	@Autowired
	AuthorRepository authorRepository;
	
	public Author saveAuthor(Author author) {
		return authorRepository.save(author);
	}
	
	public Author getAuthorByEmail(String authoremail) {
		return authorRepository.findByAuthoremail(authoremail);
	}

}
