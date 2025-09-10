package com.fsd.Employee_CRUD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fsd.Employee_CRUD.model.Employee;

@Service
public class EmployeeService {
	private final List<Employee> employees = new ArrayList<>();
	
	public Employee addEmployee(Employee employee) {
		employees.add(employee);
		return employee;
	}
	
	public List<Employee> getAllEmployees() {
		return employees;
	}
	
	public Employee getEmployeeById(String empId) {
		for (Employee employee: employees){
			if ((employee.getEmpId()).equals(empId))
				return employee;
		}
		return null;
	}
	
	public String updateEmployee(String empid, Employee update_employee) {
		for (Employee employee: employees) {
			if ((employee.getEmpId()).equals(empid)) {
				employee.setEmpId(update_employee.getEmpId());
				employee.setName(update_employee.getName());
				return "Employee updated successfully"; 
			}
		}
		return "Employee " + update_employee.getEmpId() + " is not found";
	}
	
	public String deleteEmployee(String empId) {
		for (Employee employee: employees) {
			if ((employee.getEmpId()).equals(empId)) {
				employees.remove(employee);
				return "Employee " + empId + " deleted";
			}
		}
		return "Employee " + empId + " is not found";
	}
}
