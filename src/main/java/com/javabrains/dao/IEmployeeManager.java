package com.javabrains.dao;

import java.util.List;

import com.javabrains.model.Employee;

public interface IEmployeeManager {
	void saveEmployee(Employee employee);
	
	List<Employee> fetchAllEmployees();
}
