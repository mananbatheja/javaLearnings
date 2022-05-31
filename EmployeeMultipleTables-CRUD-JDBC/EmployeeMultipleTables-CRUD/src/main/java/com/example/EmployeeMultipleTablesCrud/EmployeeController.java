package com.example.EmployeeMultipleTablesCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/showAll")
    public List<Address> showAll(){
        return employeeService.showAll();
    }

    @PostMapping("/add")
    public int add(@RequestBody Employee newEmployee){
        return employeeService.add(newEmployee);
    }

    @PutMapping("/update")
    public int update(@RequestBody Employee newEmployee){
        return employeeService.update(newEmployee);
    }

    @DeleteMapping("/delete/{id}")
    public int delete(@PathVariable String id){
        return employeeService.deleteById(id);
    }
}


//    @GetMapping("/search")
//    public List<Employee> searchBy(@RequestParam String searchVariable, String searchValue){
//        return employeeRepository.searchBy(searchVariable, searchValue);
//    }

//    public ResponseEntity<List<Employee>> getAll() {
//            return new ResponseEntity<List<Employee>>
//                    (employeeRepository.getAll(), HttpStatus.OK);
//    }

