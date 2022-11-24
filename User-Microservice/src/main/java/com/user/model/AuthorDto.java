package com.user.model;

import java.util.List;

public class AuthorDto {
	
	public List<BookEntity> books;
	
	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}
	
	public List<BookEntity> getBooks(){
		return books;
	}

}
