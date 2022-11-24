package com.user.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer readerId;
	
	private String readerName;
	
	private String emailAdress;
	
	private String password;
	
	public Reader() {
		
	}

	public Integer getReaderId() {
		return readerId;
	}

	public void setReaderId(Integer readerId) {
		this.readerId = readerId;
	}

	public String getReaderName() {
		return readerName;
	}

	public void setReaderName(String readerName) {
		this.readerName = readerName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Reader(Integer readerId, String readerName, String emailAdress, String password) {
		super();
		this.readerId = readerId;
		this.readerName = readerName;
		this.emailAdress = emailAdress;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", readerName=" + readerName + ", emailAdress=" + emailAdress
				+ ", password=" + password + "]";
	}
	
	

}
