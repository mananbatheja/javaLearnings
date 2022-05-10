package com.example.SpringCRUDList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return empService.getAll();
    }

    @PostMapping("/add")
    public String add(@RequestBody Employee emp){ //RequestBody helps with data input
        return empService.add(emp);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Employee emp){ //RequestBody helps with data input
        return empService.edit(emp);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam int empID){ //RequestBody helps with data input
        return empService.delete(empID);
    }
}
