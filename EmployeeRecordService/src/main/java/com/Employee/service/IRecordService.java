package com.Employee.service;

import java.util.List;

import com.Employee.entity.EmployeementRecord;

public interface IRecordService {
	
	public List<EmployeementRecord> getRecordsOfEmployee(Integer empId);

}
