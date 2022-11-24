//package com.user.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.user.model.Reader;
//import com.user.service.ReaderServiceImp;
//
//import io.swagger.v3.oas.annotations.parameters.RequestBody;
//
//@Controller
//public class ReaderController {
//	
//	@Autowired
//	private ReaderServiceImp readerService;
//	
//	@PostMapping("/readerRegister")
//	public Reader saveReader(@RequestBody Reader reader) {
//		
//		return readerService.saveReader(reader);
//		
//	}
//
//}
