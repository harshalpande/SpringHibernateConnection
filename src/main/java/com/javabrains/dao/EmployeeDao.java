package com.javabrains.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.javabrains.model.Employee;

public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveToDataBase(Employee employee) {
		String sql = "INSERT INTO EMPLOYEE (empid, name, age, city, mobileNumber) values ('pandehar', 'Harshal Pande', 31, 'Pune', '9096008594')";
		jdbcTemplate.update(sql);
	}

}
