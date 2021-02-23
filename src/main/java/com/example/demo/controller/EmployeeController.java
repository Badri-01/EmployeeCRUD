package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RequestMapping("/api/v1/person/")
@RestController
public class EmployeeController {
	
	private final EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		System.out.println("Hey i got an Employee Service object");
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public String createEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(path = "{id}")
	public Employee getEmployee(@PathVariable("id") int id){
		return employeeService.getEmployee(id);
	}
	
	@PutMapping
	public String updateEmployee(@RequestBody Employee employee){
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping(path = "{id}")
	public String deleteEmployee(@PathVariable("id") int id){
		return employeeService.deleteEmployee(id);
	}
	
}
