package com.example.SpringCRUDList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return empRepository.getAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Employee emp){ //RequestBody helps with data input
        return empRepository.add(emp);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Employee emp){ //RequestBody helps with data input
        return empRepository.edit(emp);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int empID){ //RequestBody helps with data input
        return empRepository.delete(empID);
    }
}
