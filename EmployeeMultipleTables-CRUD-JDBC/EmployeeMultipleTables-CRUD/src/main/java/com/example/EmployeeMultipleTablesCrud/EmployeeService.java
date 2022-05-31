package com.example.EmployeeMultipleTablesCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Address> showAll() {
        return employeeRepository.showAll();
    }

    public int add(Employee newEmployee) {
        return employeeRepository.add(newEmployee);
    }

    public int update(Employee newEmployee) {
        return employeeRepository.update(newEmployee);
    }

    public int deleteById(String id) {
        return employeeRepository.deleteById(id);
    }
}
