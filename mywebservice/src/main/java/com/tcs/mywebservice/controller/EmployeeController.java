package com.tcs.mywebservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.mywebservice.model.Employee;
import com.tcs.mywebservice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployee(){
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return employeeService.findById(id).get();
	}
	@PostMapping("/employees")
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
	}
	@PutMapping("/employees/{id}")
	public void editEmployee(@PathVariable int id,@RequestBody Employee employee) {
		employeeService.update(id, employee);
	}
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id) {
		employeeService.delete(id);
	}

}
