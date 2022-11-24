package com.Employee.entity;

import java.util.List;

public class Employee {
	
	private Integer empid;
	
	private String name;
	
	private String phone;
	
	private List<EmployeementRecord> employeementRecords;

	public Employee() {
		
	}

	public Employee(Integer empid, String name, String phone, List<EmployeementRecord> employeementRecords) {
		super();
		this.empid = empid;
		this.name = name;
		this.phone = phone;
		this.employeementRecords = employeementRecords;
	}

	public Employee(Integer empid, String name, String phone) {
		super();
		this.empid = empid;
		this.name = name;
		this.phone = phone;
	}

	public Integer getEmpid() {
		return empid;
	}

	public void setEmpid(Integer empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<EmployeementRecord> getEmployeementRecords() {
		return employeementRecords;
	}

	public void setEmployeementRecords(List<EmployeementRecord> employeementRecords) {
		this.employeementRecords = employeementRecords;
	}
	
	

		
	

}
