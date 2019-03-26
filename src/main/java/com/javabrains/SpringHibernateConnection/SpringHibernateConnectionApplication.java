package com.javabrains.SpringHibernateConnection;

import java.util.stream.Collectors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.javabrains.dao.EmployeeManagerImpl;
import com.javabrains.dao.IEmployeeManager;

public class SpringHibernateConnectionApplication {
	
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
		
		employeeManager.fetchAllEmployees().parallelStream().map(employee -> employee.getVehicles())
				.collect(Collectors.toSet()).forEach(vehicle -> System.out.println(vehicle.toString()));
		
		
		context.close();
	}

}
