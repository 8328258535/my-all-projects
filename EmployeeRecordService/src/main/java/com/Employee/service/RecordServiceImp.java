package com.Employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.Employee.entity.EmployeementRecord;



@Service
public class RecordServiceImp implements IRecordService {
	
	
	List<EmployeementRecord> list = List.of(
			new EmployeementRecord(101, "wipro", "wipro@gmail.com", 5, 1311),
			new EmployeementRecord(102, "Tcs", "Tcs@gmail.com", 4, 1312),
			new EmployeementRecord(103, "Infosys", "info@gmail.com", 6, 1313),
			new EmployeementRecord(104, "accenture", "acc@gmail.com", 7, 1314),
			new EmployeementRecord(105, "cognizant", "cogni@gmail.com", 6, 1315),
			new EmployeementRecord(106, "birla", "birla@gmail.com", 3, 1316)
			);

	@Override
	public List<EmployeementRecord> getRecordsOfEmployee(Integer empId) {
		
		return list.stream().filter(employementRecord -> employementRecord.getEmpId().equals(empId)).collect(Collectors.toList());
	}
	
	

}
