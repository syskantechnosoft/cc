package com.tcs.hibernate.main;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.tcs.hibernate.dao.StudentDAO;
import com.tcs.hibernate.entity.Student;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO studentDAO = new StudentDAO();
		List<Student> students = new ArrayList<Student>();

		// Saving a student Record
		Student stu1 = new Student(100, "test", new Date(System.currentTimeMillis()), "test@gmail.com");

		studentDAO.insert(stu1);

		// Read All content from the Table
		students = studentDAO.findAll();

		for (Student student : students) {
			System.out.println(student);
		}

		// Get a Single Student
		Student stu = studentDAO.findById(100);
		System.out.println(stu);

	}

}
