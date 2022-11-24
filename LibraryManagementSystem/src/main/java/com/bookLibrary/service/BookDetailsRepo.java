package com.bookLibrary.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookLibrary.entity.BookDetails;

@Repository
public interface BookDetailsRepo extends JpaRepository<BookDetails, Integer> {

}
