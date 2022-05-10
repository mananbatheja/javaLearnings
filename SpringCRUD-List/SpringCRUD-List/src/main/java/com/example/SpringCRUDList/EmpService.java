package com.example.SpringCRUDList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpService {

    @Autowired
    EmpRepo empRepo;

    public List<Employee> getAll() {
        return empRepo.getAll();
    }

    public String add(Employee emp) {
        return empRepo.add(emp);
    }

    public String edit(Employee emp) {
        return empRepo.edit(emp);
    }

    public String delete(int empNo) {
        return empRepo.delete(empNo);
    }
}
