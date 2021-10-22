package com.tcs.loginservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringstandaloneApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringstandaloneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hi All!!!. This is Spring Stand Alone ");
	}

}
