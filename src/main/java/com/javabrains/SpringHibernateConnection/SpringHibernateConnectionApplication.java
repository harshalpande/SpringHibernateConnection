package com.javabrains.SpringHibernateConnection;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.javabrains.dao.EmployeeManagerImpl;
import com.javabrains.dao.IEmployeeManager;
import com.javabrains.model.Employee;
import com.javabrains.model.Vehicle;

public class SpringHibernateConnectionApplication {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		IEmployeeManager employeeManager = context.getBean(EmployeeManagerImpl.class);
		
		/*Employee employee = new Employee();
		
		Vehicle vehicle = new Vehicle("MH12-HW-5545", "BIKE", 2, 2, 149, "2012", employee);
		Vehicle vehicle2 = new Vehicle("MH12-QY-0684", "CAR", 4, 4, 999, "2018", employee);
		
		employee.setEmpid("PANDEHAR");
		employee.setAge(31);
		employee.setCity("PUNE");
		employee.setMobileNumber("9096008594");
		employee.setName("Harshal Pande");
		employee.setVehicles(new HashSet<>(Arrays.asList(vehicle, vehicle2)));
		
		employeeManager.saveEmployee(employee);*/
			
		/*HibernateTransactionManager bean = context.getBean(HibernateTransactionManager.class);
		SessionFactory sessionFactory = bean.getSessionFactory();
		
		Session session = sessionFactory.openSession();*/
		
		List<Employee> employeeList = employeeManager.fetchAllEmployees();
		
		employeeList.stream().map(employee -> employee.getVehicles()).collect(Collectors.toSet())
				.forEach(vehicle -> System.out.println(vehicle.toString()));
		
		/*session.close();*/
		
		context.close();
	}

}
