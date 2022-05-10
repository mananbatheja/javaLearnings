package com.example.SpringGuideRestService;

import org.springframework.data.jpa.repository.JpaRepository;

interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //JPARepository has functions for CRUD
}
