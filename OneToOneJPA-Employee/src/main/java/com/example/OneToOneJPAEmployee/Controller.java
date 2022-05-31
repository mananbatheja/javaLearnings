package com.example.OneToOneJPAEmployee;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class Controller {

    Service service = new Service();

    //Create
    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        service.save(employee);
    }

    //Read
    @GetMapping("/getAll")
    public void getAll(){
        service.findAll();
    }

    //Update
    @PutMapping("/update/{id}")
    public void update(@PathVariable String id, @RequestBody Employee employee){
        service.update(id, employee);
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }
}
