package com.user.service;

import java.awt.print.Book;
import java.util.List;

import com.user.model.AuthorDto;
import com.user.model.AuthorEntity;
import com.user.model.AuthorLogin;
import com.user.model.BookEntity;


public interface IuserService {
	
	public AuthorEntity saveAuthor(AuthorEntity author);
	
	public AuthorEntity saveBooks(AuthorDto dto); 
	
	public String authorLogin(AuthorLogin login);
		
	}
	
	
	//public AuthorEntity saveAuthor(AuthorEntity author);
	
//	public AuthorEntity procrssLogin(AuthorLoginDto loginDto);


