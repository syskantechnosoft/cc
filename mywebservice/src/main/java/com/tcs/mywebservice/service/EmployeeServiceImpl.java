package com.tcs.mywebservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tcs.mywebservice.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employee> employees;

	public EmployeeServiceImpl() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(100, "sundar", "sundar.pitchai@google.com"));
		employees.add(new Employee(101, "satya", "satya.nadella@microsoft.com"));
		employees.add(new Employee(102, "mark", "mark@facebook.com"));
		employees.add(new Employee(103, "james", "james@java.com"));
		employees.add(new Employee(104, "jhon", "jhon@spring.com"));
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employees;
	}

	@Override
	public Optional<Employee> findById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> employee = null;
//		Employee employee = null;
		for (Employee emp : employees) {
			if (emp.getId() == id)
				employee = Optional.of(emp);
		}
		return employee;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		employees.add(employee);
	}

	@Override
	public void update(int id, Employee employee) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				employees.remove(i);
			}
		}
		employees.add(employee);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= employees.size(); i++) {
			if (employees.get(i).getId() == id) {
				employees.remove(i);
			}
		}
	}

}
