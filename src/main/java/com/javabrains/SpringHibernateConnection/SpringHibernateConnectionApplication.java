package com.javabrains.SpringHibernateConnection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javabrains.dao.EmployeeDao;
import com.javabrains.model.Employee;

public class SpringHibernateConnectionApplication {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee = context.getBean(Employee.class);
		
		System.out.println(employee.toString());
		
		//employee.setListOfVehicles(null);
		
		new EmployeeDao().saveToDataBase(employee);
		
		context.close();
	}

}
