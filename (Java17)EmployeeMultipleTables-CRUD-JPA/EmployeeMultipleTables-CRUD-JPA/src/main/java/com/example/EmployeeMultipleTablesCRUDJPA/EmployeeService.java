package com.example.EmployeeMultipleTablesCRUDJPA;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;


    public void findAll() {
        employeeRepository.findAll();
    }

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }


    public void update(String id, Employee newEmployee) {
        Employee finalNewEmployee = newEmployee;
        employeeRepository.findById(id)
                .map(employee -> {
                    employee.setFirstName(finalNewEmployee.getFirstName());
                    employee.setLastName(finalNewEmployee.getLastName());
                    return employeeRepository.save(employee);
                });
    }

    public void delete(String id) {
        employeeRepository.deleteById(id);
    }
}
