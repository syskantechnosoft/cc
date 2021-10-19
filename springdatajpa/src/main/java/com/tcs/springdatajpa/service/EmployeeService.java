package com.tcs.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import com.tcs.springdatajpa.model.Employee;

public interface EmployeeService {
	public static final List<Employee> employees = null;
	public List<Employee> findAll();  //method declaration only
	public Optional<Employee> findById(int id);
	public void save(Employee employee);
	public void update(int id, Employee employee);
	public void delete(int id);
}
