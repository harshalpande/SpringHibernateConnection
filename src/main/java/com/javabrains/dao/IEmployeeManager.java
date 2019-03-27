package com.javabrains.dao;

import java.util.List;

import com.javabrains.model.Employee;
import com.javabrains.model.Vehicle;

public interface IEmployeeManager {
	void saveEmployee(Employee employee);
	
	List<Vehicle> fetchAllVehiclesOfAllEmployees();
}
