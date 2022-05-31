package com.example.EmployeeMultipleTablesCRUDJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    //Create
    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        employeeService.save(employee);
    }

    //Read
    @GetMapping("/getAll")
    public void getAll(){
        employeeService.findAll();
    }

    //Update
    @PutMapping("/update/{id}")
    public void update(@PathVariable String id, @RequestBody Employee employee){
        employeeService.update(id, employee);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        employeeService.delete(id);
    }
}
