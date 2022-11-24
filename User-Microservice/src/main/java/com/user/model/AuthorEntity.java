package com.user.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AuthorEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;

	private String fullName;

	private String emailAdress;

	private String passWord;

	private String createdDate;
	
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id")
	private List<BookEntity> books;

	public AuthorEntity() {

	}

	public AuthorEntity(Integer userId, String fullName, String emailAdress, String passWord, String createdDate,
			List<BookEntity> books) {
		super();
		this.userId = userId;
		this.fullName = fullName;
		this.emailAdress = emailAdress;
		this.passWord = passWord;
		this.createdDate = createdDate;
		this.books = books;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public List<BookEntity> getBooks() {
		return books;
	}

	public void setBooks(List<BookEntity> books) {
		this.books = books;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return fullName;
	}

	public void setName(String name) {
		this.fullName = name;
	}

	public String getEmail() {
		return emailAdress;
	}

	public void setEmail(String email) {
		this.emailAdress = email;
	}

	public String getPassword() {
		return passWord;
	}

	public void setPassword(String password) {
		this.passWord = password;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "AuthorEntity [userId=" + userId + ", fullName=" + fullName + ", emailAdress=" + emailAdress
				+ ", passWord=" + passWord + ", createdDate=" + createdDate + ", books=" + books + "]";
	}

	
}
