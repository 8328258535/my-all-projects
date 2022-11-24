package com.digitalbooks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer authorid;
	
	private String authorName;
	
	@Column(unique = true)
	private String authoremail;
	
	private String authorpassword;
	
	public Author() {
		super();
	}

	public Author(Integer authorid, String authorName, String authoremail, String authorpassword) {
		super();
		this.authorid = authorid;
		this.authorName = authorName;
		this.authoremail = authoremail;
		this.authorpassword = authorpassword;
	}
	
  
	public Author(String authorName, String authoremail, String authorpassword) {
		super();
		this.authorName = authorName;
		this.authoremail = authoremail;
		this.authorpassword = authorpassword;
	}

	public Author(String authoremail, String authorpassword) {
		super();
		this.authoremail = authoremail;
		this.authorpassword = authorpassword;
	}

	public Integer getAuthorid() {
		return authorid;
	}

	public void setAuthorid(Integer authorid) {
		this.authorid = authorid;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthoremail() {
		return authoremail;
	}

	public void setAuthoremail(String authoremail) {
		this.authoremail = authoremail;
	}

	public String getAuthorpassword() {
		return authorpassword;
	}

	public void setAuthorpassword(String authorpassword) {
		this.authorpassword = authorpassword;
	}

}
