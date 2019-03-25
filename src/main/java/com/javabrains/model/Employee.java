package com.javabrains.model;

import java.util.List;

public class Employee {
	
	private String empid;
	private String name;
	private Integer age;
	private String city;
	private String mobileNumber;
	private List<Vehicle> listOfVehicles;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", city=" + city + ", mobileNumber="
				+ mobileNumber + ", listOfVehicles=" + listOfVehicles + "]";
	}

	public Employee(String empid, String name, Integer age, String city, String mobileNumber,
			List<Vehicle> listOfVehicles) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.city = city;
		this.mobileNumber = mobileNumber;
		this.listOfVehicles = listOfVehicles;
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

	public List<Vehicle> getListOfVehicles() {
		return listOfVehicles;
	}

	public void setListOfVehicles(List<Vehicle> listOfVehicles) {
		this.listOfVehicles = listOfVehicles;
	}
}
