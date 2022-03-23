package com.firstAPI;

import com.firstAPI.EMS.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWithPostgreSqlApplication implements CommandLineRunner {
	@Autowired
	private Employees employees;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithPostgreSqlApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		this.employees.CreateTable();
	}
}
