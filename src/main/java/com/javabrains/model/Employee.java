package com.javabrains.model;

import java.util.Set;

public class Employee {
	
	private String empid;
	private String name;
	private Integer age;
	private String city;
	private String mobileNumber;
	private Set<Vehicle> vehicles;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", city=" + city + ", mobileNumber="
				+ mobileNumber + ", vehicles=" + vehicles + "]";
	}

	public Employee(String empid, String name, Integer age, String city, String mobileNumber, Set<Vehicle> vehicles) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.vehicles = vehicles;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public Set<Vehicle> getVehicles() {
		return vehicles;
	}


	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
