package com.example.SpringCRUDList;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpRepo {
    public List<Employee> employees = new ArrayList<>(); // public because need to initiate from commandLineRunner

    public List<Employee> getAll() {
        return employees;
    }

    public String add(Employee emp) {
        employees.add(emp);
        return "Successfully added!";
    }

    public String edit(Employee emp) {
        employees.stream().filter(e -> e.getEmployeeID() == emp.getEmployeeID()).forEach(e -> {
            e.setAddress (emp.getAddress());
            e.setFullName(emp.getFullName());
        });

        return "Successfully Updated!";
    }


    public String delete(int empNo) {
        employees.remove(empNo-1);
        return "Deleted Successfully!";
    }
}
