package com.example.EmployeeSingleTableCRUDJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class EmployeeSingleTableCrudJdbcApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSingleTableCrudJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		jdbcTemplate.execute("DROP TABLE employee");

		jdbcTemplate.execute("CREATE TABLE employee(" +
				"id VARCHAR(255)," +
				" firstName VARCHAR(255)," +
				" lastName VARCHAR(255)," +
				" city VARCHAR(255)," +
				" age VARCHAR(255))"
		);
//		jdbcTemplate.execute("SELECT * FROM employee");

		Employee defaultEmployee = new Employee("123456", "Default", "Employee", "Local", "0");

		jdbcTemplate.update("INSERT INTO employee(id, firstName, lastName, city, age) VALUES (?,?,?,?,?)",
								defaultEmployee.getId(),
								defaultEmployee.getFirstName(),
								defaultEmployee.getLastName(),
								defaultEmployee.getCity(),
								defaultEmployee.getAge());
//
//		jdbcTemplate.update("INSERT INTO employee VALUES (" +
//						defaultEmployee.getId() + "," +
//						defaultEmployee.getFirstName() + "," +
//						defaultEmployee.getLastName() + "," +
//						defaultEmployee.getCity() + "," +
//						defaultEmployee.getAge() +
//						")"
//
//				);

	}
}
