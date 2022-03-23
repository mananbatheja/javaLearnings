package com.firstAPI.EMS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class Employees {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //Create table
    public void CreateTable (){
        var query = "CREATE TABLE employees(employeeID SERIAL PRIMARY KEY, name varchar(255))";
        int update = this.jdbcTemplate.update(query);
        System.out.println(update);
    }

}
