package com.javabrains.dao;

import java.util.List;

import com.javabrains.model.Employee;

public class EmployeeManagerImpl implements IEmployeeManager {

	IEmployeeDAO iEmployeeDAO;
	

	@Override
	public void saveEmployee(Employee employee) {
		iEmployeeDAO.saveEmployee(employee);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return iEmployeeDAO.fetchAllEmployees();
	}

	public IEmployeeDAO getiEmployeeDAO() {
		return iEmployeeDAO;
	}

	public void setiEmployeeDAO(IEmployeeDAO iEmployeeDAO) {
		this.iEmployeeDAO = iEmployeeDAO;
	}
}
