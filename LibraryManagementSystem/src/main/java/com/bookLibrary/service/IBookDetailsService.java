package com.bookLibrary.service;

import java.util.List;
import java.util.Optional;


import com.bookLibrary.entity.BookDetails;
import com.bookLibrary.entity.BookDetailsDto;

public interface IBookDetailsService {

	public BookDetails saveBookDetails(BookDetails bookDetails);

	public List<BookDetails> getAllBooks();

	Optional<BookDetails> getBookById(Integer bookId);

	public void deleteBookById(Integer bookId);

	public void updateBookById(BookDetailsDto book);

	public Boolean changeStatus(Integer bookId);
	
	BookDetails changeBorrowedStatus(BookDetailsDto book,Integer bookId);
	
	
}
