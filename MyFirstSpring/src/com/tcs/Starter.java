package com.tcs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Usual way of creating object
		Account account = new Account();

		System.out.println("Account object = " + account);

		System.out.println("account hashcode :" + account.hashCode());

		// Spring way of creating object
		Account account1;

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		account1 = (Account) factory.getBean("acc");

		System.out.println("account1 created by spring :" + account1);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Account account2 = (Account) context.getBean("acc1");
		
		System.out.println("account2 created by spring :" + account2);
	}

}
