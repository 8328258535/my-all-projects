package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.Reader;

@Service
public class ReaderServiceImp implements IreaderService {
	
	@Autowired
	IreaderRepo readerRepo;
	

	@Override
	public Reader saveReader(Reader reader) {
		
		return readerRepo.save(reader);
	}
	
	
	
	

}
