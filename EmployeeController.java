package com.fsd.Employee_CRUD.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.fsd.Employee_CRUD.model.Employee;
import com.fsd.Employee_CRUD.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	private final EmployeeService service;
	
	public EmployeeController(EmployeeService service) {
		this.service = service;
	}
	
	@PostMapping("/new")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable String empId) {
		return service.getEmployeeById(empId);
	}
	
	@PutMapping("/{empId}")
	public String updateEmployee(@PathVariable String empId, @RequestBody Employee employee) {
		return service.updateEmployee(empId, employee);
	}
	
	@DeleteMapping("/{empId}")
	public String deleteEmployee(@PathVariable String empId) {
		return service.deleteEmployee(empId);
	}
}
