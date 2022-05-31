package com.example.EmployeeMultipleTablesCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class EmployeeMultipleTablesCrudApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMultipleTablesCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		jdbcTemplate.execute("DROP TABLE IF EXISTS address");

		jdbcTemplate.execute("DROP TABLE IF EXISTS employee");

		jdbcTemplate.execute("CREATE TABLE employee(" +
				"id VARCHAR(255)," +
				" firstName VARCHAR(255)," +
				" lastName VARCHAR(255)," +
				" age VARCHAR(255)," +
				" PRIMARY KEY (id))"
		);

		jdbcTemplate.execute("CREATE TABLE address(" +
				"id VARCHAR(255)," +
				" address VARCHAR(255)," +
				" city VARCHAR(255)," +
				" pincode VARCHAR(255)," +
				" PRIMARY KEY (id)," +
				" FOREIGN KEY (id) REFERENCES employee(id))" //Employee<-> address TODO
		);

		Address defaultAddress = new Address("123456", "A403 SSA", "Blr", "000000");
		Employee defaultEmployee = new Employee("123456", "Default", "Employee", "0", defaultAddress);

		jdbcTemplate.update("INSERT INTO employee(id, firstName, lastName, age) VALUES (?,?,?,?)",
				defaultEmployee.getId(),
				defaultEmployee.getFirstName(),
				defaultEmployee.getLastName(),
				defaultEmployee.getAge());

		jdbcTemplate.update("INSERT INTO address(id, address, city, pincode) VALUES (?,?,?,?)",//specify id as pk TODO
				defaultAddress.getId(),
				defaultAddress.getAddress(),
				defaultAddress.getCity(),
				defaultAddress.getPincode());
	}
}
