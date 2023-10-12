package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Repository.EmployeeRepository;
import com.entity.Employee;

@SpringBootApplication
public class ZPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZPracticeApplication.class, args);
	}

}
