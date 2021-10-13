package com.tcs.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.tcs.entity.Employee;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//
//		SessionFactory factory = meta.getSessionFactoryBuilder().build();
//		Session session = factory.openSession();
		
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("ABC");
		e1.setEmail("abc@gmail.com");

		session.save(e1);
		t.commit();
		System.out.println("successfully saved");
		
		
		t= session.beginTransaction();
		Query query = session.createQuery("from Employee");
		List<Employee> employees = query.getResultList();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		t.commit();
		
		
		sessionFactory.close();
		session.close();
	}

}
