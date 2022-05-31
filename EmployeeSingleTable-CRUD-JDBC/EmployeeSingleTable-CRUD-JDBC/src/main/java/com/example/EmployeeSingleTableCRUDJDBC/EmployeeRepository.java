package com.example.EmployeeSingleTableCRUDJDBC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //Create
    public int add(Employee employee){
        return jdbcTemplate.update(
                "INSERT INTO employee VALUES(?,?,?,?,?)",
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getCity(),
                employee.getAge());
    }

    //Read
    public List<Employee> getAll() {
        return jdbcTemplate.query(
                "SELECT * from employee;",
                BeanPropertyRowMapper.newInstance(Employee.class));

    }

    //Update
    public int update(Employee employee){
        return jdbcTemplate.update(
                "UPDATE employee SET firstName=?, lastName=?, city=?, age=? WHERE id=?",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getCity(),
                employee.getAge(),
                employee.getId());
    }

    //Delete
    public int deleteById(String id) {
        return jdbcTemplate.update(
                "DELETE FROM employee WHERE id=?",
                id);

    }

    //Search
    public List<Employee> searchBy(String searchVariable, String searchValue){

        String sqlQuery = "SELECT * FROM employee WHERE " + searchVariable + "=?";

        return jdbcTemplate.query(
                sqlQuery,
                BeanPropertyRowMapper.newInstance(Employee.class),
                searchValue);
    }




}