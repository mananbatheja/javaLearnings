package com.example.EmployeeMultipleTablesCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Address> showAll(){
        return jdbcTemplate.query(
                "SELECT * from employee JOIN address ON employee.id = address.id",
                BeanPropertyRowMapper.newInstance(Address.class));
    }

    //Create
    public int add(Employee employee){
        jdbcTemplate.update(
                "INSERT INTO address VALUES(?,?,?,?)",
                employee.getAddress().getId(),
                employee.getAddress().getAddress(),
                employee.getAddress().getCity(),
                employee.getAddress().getPincode());
        return jdbcTemplate.update(
                "INSERT INTO employee VALUES(?,?,?,?)",
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getAge());
    }

    //Update
    public int update(Employee employee){
        jdbcTemplate.update(
                "UPDATE address SET address=?, city=?, pincode=? WHERE id=?",
                employee.getAddress().getId(),
                employee.getAddress().getAddress(),
                employee.getAddress().getCity(),
                employee.getAddress().getPincode());
        return jdbcTemplate.update(
                "UPDATE employee SET firstName=?, lastName=?, age=? WHERE id=?",
                employee.getFirstName(),
                employee.getLastName(),
                employee.getAge(),
                employee.getId());
    }

    //Delete
    public int deleteById(String id) {
        jdbcTemplate.update(
                "DELETE FROM address WHERE id=?",
                id);
        return jdbcTemplate.update(
                "DELETE FROM employee WHERE id=?",
                id);

    }
}

//    //Search
//    public List<Employee> searchBy(String searchVariable, String searchValue){
//
//        String sqlQuery = "SELECT * FROM employee WHERE " + searchVariable + "=?";
//
//        return jdbcTemplate.query(
//                sqlQuery,
//                BeanPropertyRowMapper.newInstance(Employee.class),
//                searchValue);
//    }