package com.tcs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	int id;
	String name;
	Address homeAddress;

	public Employee() {
		super();
	}

	// fully parameterised constructor
	public Employee(int id, String name, Address homeAddress) {
		super();
		this.id = id;
		this.name = name;
		this.homeAddress = homeAddress;
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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", homeAddress=" + homeAddress + "]";
	}

	public static void main(String[] args) {
		Employee emp = new Employee(100, "test", new Address());

		System.out.println("emp =" + emp);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employee = (Employee) context.getBean("emp1");

		System.out.println("employee created by spring :" + employee);
	}
}
