package com.fsd.Employee_CRUD.model;

public class Employee {
	String empId;
	String name;
	
	public Employee() {}
	
	public Employee(String empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empid) {
		this.empId = empid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
