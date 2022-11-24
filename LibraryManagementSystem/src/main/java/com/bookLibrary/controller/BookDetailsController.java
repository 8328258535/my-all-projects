package com.bookLibrary.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.bookLibrary.entity.BookDetails;
import com.bookLibrary.entity.BookDetailsDto;
import com.bookLibrary.service.BookDetailsServiceImp;


@RestController
//@CrossOrigin(origins = "http://localhost:4200/")
public class BookDetailsController {

	
	@Autowired
	private BookDetailsServiceImp bookDetailsServiceImp;

	@PostMapping("/savebook")
	public BookDetails saveBook(@RequestBody BookDetails bookDetails) {
		return bookDetailsServiceImp.saveBookDetails(bookDetails);

	}

	@GetMapping("/getAll")
	public List<BookDetails> getBooks() {
		return bookDetailsServiceImp.getAllBooks();
	}

	@GetMapping("/getBooks")
	Optional<BookDetails> getById(Integer bookId) {
		return bookDetailsServiceImp.getBookById(bookId);
	}

	@DeleteMapping("/deleteBook")
	public ResponseEntity<BookDetails> deleteBookById(Integer bookId) {

		System.out.println(bookId);
		ResponseEntity<BookDetails> responseEntity = new ResponseEntity<>(HttpStatus.OK);

		try {

			bookDetailsServiceImp.deleteBookById(bookId);

		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return responseEntity;
	}

	@PatchMapping("/status")
	public Boolean changeStatus(Integer bookId) {

		return bookDetailsServiceImp.changeStatus(bookId);
	}

	@PutMapping("/updateBookById")
	public BookDetailsDto updateById(@RequestBody BookDetailsDto books) {

		if (books.getBookId() != null) {

			bookDetailsServiceImp.updateBookById(books);

		}

		else {
			System.out.println("invalid user");
		}
		return books;

	}
	
	@PutMapping("/updateBorrowed")
	public BookDetailsDto updateBorrow(BookDetailsDto book,Integer bookId) {
		
		if(book.getBorrowed_status()!=null) {
			bookDetailsServiceImp.changeBorrowedStatus(book, bookId);
		}else {
			System.out.println("invalid status");
		}
		return book;
	}
	
}

	

		
	


