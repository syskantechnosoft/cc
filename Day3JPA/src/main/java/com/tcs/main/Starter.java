package com.tcs.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tcs.model.Car;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Day3JPA");

		EntityManager em = emf.createEntityManager();

//		Car car = new Car();
//		car.setId(102);
//		car.setName("Honda Civic");
//		car.setYearOfMfg(2015);
//		em.getTransaction().begin();
//		em.persist(car);
//		System.out.println("1 Record Inserted Successfully!!!");
//		em.getTransaction().commit();

		em.getTransaction().begin();
		List<Car> cars = em.createNamedQuery("Car.findAll").getResultList();
		System.out.println("ID \t Car Name \t Year of Mfg ");
		for (Car c : cars) {
			System.out.println(c.getId() + "\t " + c.getName() + "\t" + c.getYearOfMfg());
		}
		em.getTransaction().commit();
	}

}
