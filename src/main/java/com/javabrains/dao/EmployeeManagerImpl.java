package com.javabrains.dao;

import java.util.List;

import com.javabrains.model.Employee;
import com.javabrains.model.Vehicle;

public class EmployeeManagerImpl implements IEmployeeManager {

	IEmployeeDAO iEmployeeDAO;
	

	@Override
	public void saveEmployee(Employee employee) {
		iEmployeeDAO.saveEmployee(employee);
	}

	@Override
	public List<Vehicle> fetchAllVehiclesOfAllEmployees() {
		return iEmployeeDAO.fetchAllVehiclesOfAllEmployees();
	}

	public IEmployeeDAO getiEmployeeDAO() {
		return iEmployeeDAO;
	}

	public void setiEmployeeDAO(IEmployeeDAO iEmployeeDAO) {
		this.iEmployeeDAO = iEmployeeDAO;
	}
}
