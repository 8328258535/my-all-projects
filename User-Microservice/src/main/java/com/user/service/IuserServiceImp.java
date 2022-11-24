package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.AuthorDto;
import com.user.model.AuthorEntity;
import com.user.model.AuthorLogin;
import com.user.model.BookEntity;

@Service
public class IuserServiceImp implements IuserService {

	@Autowired
	private IuserRepo userRepo;

	@Override
	public AuthorEntity saveAuthor(AuthorEntity author) {

		return userRepo.save(author);
	}

	@Override
	public AuthorEntity saveBooks(AuthorDto dto) {

		List<BookEntity> bookList = dto.getBooks();

		AuthorEntity author = new AuthorEntity();

		author.setBooks(bookList);

		return userRepo.save(author);

	}

	@Override
	public String authorLogin(AuthorLogin login) {

		AuthorEntity author = userRepo.getByEmail(login.getEmailAdress());

		String message = null;
		if (author.getEmailAdress() != null && author.getPassWord() != null) {
			if (login.getEmailAdress().equals(author.getEmailAdress())
					&& (login.getPassWord().equals(author.getPassWord()))) {
				message = "login successfull";
				return message;

			} else {
				message = "login failed";
				return message;

			}
		}
		return message;

	}

}
