package com.example.EmployeeMultipleTablesCRUDJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMultipleTablesCrudJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMultipleTablesCrudJpaApplication.class, args);
	}


	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee defaultEmployee = new Employee("123456", "Default", "Employee", "Local", "0");

		Address defaultAddress = new Address("123456", "A403 SSA", "Blr", "000000");

		employeeRepository.save(defaultEmployee);
		addressRepository.save(defaultAddress);

	}
}
