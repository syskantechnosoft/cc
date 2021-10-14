package com.tcs.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	// This Method Is Used To Create The Hibernate's SessionFactory Object
	public static Session buildSession() {
		try {
			// Creating Configuration Instance & Passing Hibernate Configuration File
			Configuration configObj = new Configuration();
			configObj.configure("hibernate.cfg.xml");

			// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
			ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
					.applySettings(configObj.getProperties()).build();

			// Creating Hibernate SessionFactory Instance
			sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
			sessionObj = sessionFactoryObj.getCurrentSession();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return sessionObj;
	}

}
