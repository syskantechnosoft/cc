package com.tcs.hibernate.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.tcs.hibernate.entity.Student;
import com.tcs.hibernate.util.HibernateUtil;

public class StudentDAO {

	private Session session = null;

	public List<Student> findAll() {
		List<Student> studentsList = new ArrayList<Student>();
		session = HibernateUtil.createSession();
		Transaction transaction = session.beginTransaction();
//		transaction.begin();
		Query query = session.createQuery("from Student");
		studentsList = query.getResultList();
		transaction.commit();
		return studentsList;
	}

	public Student findById(int id) {
		Student student = null;
		session = HibernateUtil.createSession();
		Transaction transaction = session.beginTransaction();
		student = session.get(Student.class, id);
		transaction.commit();
		return student;
	}

	public int insert(Student student) {
		int status = 0;
		session = HibernateUtil.createSession();
		Transaction transaction = session.beginTransaction();
		status = (int) session.save(student);
		transaction.commit();
		return status;
	}

	public void update(int id, Student student) {
		int status = 0;
		session = HibernateUtil.createSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(student);
		transaction.commit();
//		return status;
	}

	public void delete(int id) {
		int status = 0;
		session = HibernateUtil.createSession();
		Transaction transaction = session.beginTransaction();
		Student stu = this.findById(id);
		session.remove(stu);
		transaction.commit();
		// return status;
	}
}
