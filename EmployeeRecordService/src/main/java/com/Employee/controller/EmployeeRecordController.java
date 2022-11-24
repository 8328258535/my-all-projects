package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.entity.EmployeementRecord;
import com.Employee.service.IRecordService;

@RestController
public class EmployeeRecordController {
	
	@Autowired
	private IRecordService recordService;
	
	@GetMapping("/emp/{empId}")
	public List<EmployeementRecord> getRecord(@PathVariable Integer empId){
		
		return recordService.getRecordsOfEmployee(empId);
		
		
	}

}
