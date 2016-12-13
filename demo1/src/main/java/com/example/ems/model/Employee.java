package com.example.ems.model;

public class Employee {

	private int id;
	private String name;
	private int salary;
	private String empStatus;

	public Employee() {
	}

	public Employee(int id, String name, int salary, String empStatus) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.empStatus = empStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", empStatus=" + empStatus + "]";
	}

}
