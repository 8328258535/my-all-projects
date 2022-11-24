package com.bookLibrary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.bookLibrary.entity.BookDetails;
import com.bookLibrary.entity.BookDetailsDto;

@Service
public class BookDetailsServiceImp implements IBookDetailsService {

	@Autowired
	private BookDetailsRepo bookRepo;

	@Override
	public BookDetails saveBookDetails(BookDetails bookDetails) {

		return bookRepo.save(bookDetails);

	}

	@Override
	public List<BookDetails> getAllBooks() {

		return bookRepo.findAll();
	}

	@Override
	public Optional<BookDetails> getBookById(Integer bookId) {

		return bookRepo.findById(bookId);
	}

	@Override
	public void deleteBookById(Integer bookId) {
		bookRepo.deleteById(bookId);

	}

	@Override
	public Boolean changeStatus(Integer bookId) {

		return bookRepo.existsById(bookId);
	}

	@Override
	public void updateBookById(BookDetailsDto book) {
		Optional<BookDetails> bookById = getBookById(book.getBookId());

		BookDetails bookDetails = bookById.get();

		bookDetails.setBookName(book.getBookName());

		bookDetails.setBook_Author(book.getBook_Author());

		bookDetails.setBook_Genre(book.getBook_Genre());

		bookDetails.setBook_Price(book.getBook_Price());

		bookDetails.setBorrowed_status(book.getBorrowed_status());

		bookRepo.save(bookDetails);

	}

	@Override
	public BookDetails changeBorrowedStatus(BookDetailsDto book, Integer bookId) {
		
		Optional<BookDetails> existBook = getBookById(book.getBookId());
		
		BookDetails books = existBook.get();
		books.setBorrowed_status(book.getBorrowed_status());
		
		return bookRepo.save(books);
		
		
	}

	
	
	

}
