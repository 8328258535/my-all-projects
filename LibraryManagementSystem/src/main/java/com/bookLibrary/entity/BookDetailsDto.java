package com.bookLibrary.entity;

public class BookDetailsDto {
	
    private Integer bookId;
	
	private String bookName;
	
	private String book_Author;
	
	private Float book_Price;
	
	private String book_Genre;
	
	private Boolean borrowed_status;

	public  Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBook_Author() {
		return book_Author;
	}

	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}

	public Float getBook_Price() {
		return book_Price;
	}

	public void setBook_Price(Float book_Price) {
		this.book_Price = book_Price;
	}

	public String getBook_Genre() {
		return book_Genre;
	}

	public void setBook_Genre(String book_Genre) {
		this.book_Genre = book_Genre;
	}

	public Boolean getBorrowed_status() {
		return borrowed_status;
	}

	public void setBorrowed_status(Boolean borrowed_status) {
		this.borrowed_status = borrowed_status;
	}

	@Override
	public String toString() {
		return "BookDetailsDto [bookId=" + bookId + ", bookName=" + bookName + ", book_Author=" + book_Author
				+ ", book_Price=" + book_Price + ", book_Genre=" + book_Genre + ", borrowed_status=" + borrowed_status
				+ "]";
	}
	
	

}
