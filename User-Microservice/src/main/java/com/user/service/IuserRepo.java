package com.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.model.AuthorEntity;


@Repository
public interface IuserRepo extends JpaRepository<AuthorEntity, Integer> {
	
	@Query("from AuthorEntity where emailAdress=:emailAdress")
	public AuthorEntity getByEmail(@RequestParam String emailAdress);
	
	
	
	
	

}
