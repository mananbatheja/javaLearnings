package com.example.EmployeeSingleTableCRUDJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/getAll")
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }


    @PostMapping("/add")
    public int add(@RequestBody Employee newEmployee){
        return employeeRepository.add(newEmployee);
    }

    @PutMapping("/update")
    public int update(@RequestBody Employee newEmployee){
        return employeeRepository.update(newEmployee);
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable String id){
        return employeeRepository.deleteById(id);
    }

    @GetMapping("/search")
    public List<Employee> searchBy(@RequestParam String searchVariable, String searchValue){
        return employeeRepository.searchBy(searchVariable, searchValue);
    }


//    public ResponseEntity<List<Employee>> getAll() {
//            return new ResponseEntity<List<Employee>>
//                    (employeeRepository.getAll(), HttpStatus.OK);
//    }
}
