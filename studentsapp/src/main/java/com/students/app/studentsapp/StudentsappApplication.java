package com.students.app.studentsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StudentsappApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsappApplication.class, args);
	}

}
