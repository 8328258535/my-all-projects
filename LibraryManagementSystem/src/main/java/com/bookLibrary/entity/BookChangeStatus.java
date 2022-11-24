package com.bookLibrary.entity;

public class BookChangeStatus {

	private String isBookBorrowed;

	public BookChangeStatus() {

	}

	public BookChangeStatus(String isBookBorrowed) {

		this.isBookBorrowed = isBookBorrowed;
	}

	public String getIsBookBorrowed() {
		return isBookBorrowed;
	}

}
