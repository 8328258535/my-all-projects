package com.Employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Employee.entity.Employee;

@Service
public class EmployeeSeviceImp implements IEmployeeSevice {
	
	

	List<Employee> list = List.of(new Employee(1311, "tajdar", "9763429162"),
			new Employee(1311, "ahmed", "874527891"), new Employee(1312, "nishant", "874527891"),
			new Employee(1313, "priya", "874457892"), new Employee(1314, "mohan", "874527891"),
			new Employee(1315, "venky", "874527891"), new Employee(1316, "prakash", "874527891"));

	@Override
	public Employee getEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee->employee.getEmpid().equals(empId)).findAny().orElse(null);
	}

}
