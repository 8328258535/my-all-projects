package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Employee.entity.Employee;
import com.Employee.service.EmployeeSeviceImp;

@RestController
@RequestMapping("/employee")
public class EmployeeCotroller {
	
	@Autowired
	private EmployeeSeviceImp employeeSeviceImp;
	
	@Autowired
	private RestTemplate retRestTemplate;
	
	@GetMapping("/{empId}")
	public Employee getEmployee(@PathVariable Integer empId) {
		
		Employee employee = this.employeeSeviceImp.getEmployee(empId);
		
		List employementRecord = this.retRestTemplate.getForObject("http://localhost:9090/record/emp/"+empId, List.class);
		
		employee.setEmployeementRecords(employementRecord);
		
		return employee;
		
		
		
		
		
	
		
		
	
		
		
		
		
	}

}
