package com.javabrains.model;

/**
 * @author pandehar
 *
 */
public class Vehicle {
	
	private String registrationNumber;
	private String type;
	private int numberOfWheels;
	private int seatingCapacity;
	private int engineCC;
	private String modelYear;
	private Employee employee;
	
	/**
	 * Constructor with All Fields
	 * 
	 * @param registrationNumber
	 * @param type
	 * @param numberOfWheels
	 * @param seatingCapacity
	 * @param engineCC
	 * @param modelYear
	 * @param employee
	 */
	public Vehicle(String registrationNumber, String type, int numberOfWheels, int seatingCapacity, int engineCC,
			String modelYear, Employee employee) {
		super();
		this.registrationNumber = registrationNumber;
		this.type = type;
		this.numberOfWheels = numberOfWheels;
		this.seatingCapacity = seatingCapacity;
		this.engineCC = engineCC;
		this.modelYear = modelYear;
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", type=" + type + ", numberOfWheels="
				+ numberOfWheels + ", seatingCapacity=" + seatingCapacity + ", engineCC=" + engineCC + ", modelYear="
				+ modelYear + ", employee=" + employee + "]";
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
}
