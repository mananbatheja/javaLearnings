package com.example.SpringCRUDList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringCrudListApplication implements CommandLineRunner {

	@Autowired
	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudListApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1, "Tony Stark", "Stark Tower");
		Employee e2 = new Employee(2, "Steve Rogers", "Queens");

		empRepository.employees.addAll(Arrays.asList(e1, e2));
	}
}
