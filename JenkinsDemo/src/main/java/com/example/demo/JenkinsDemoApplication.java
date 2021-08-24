package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello Jenkins !!");
		SpringApplication.run(JenkinsDemoApplication.class, args);
	}

}
