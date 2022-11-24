package com.user.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.model.Reader;

@Repository
public interface IreaderRepo extends JpaRepository<Reader, Integer> {

}
