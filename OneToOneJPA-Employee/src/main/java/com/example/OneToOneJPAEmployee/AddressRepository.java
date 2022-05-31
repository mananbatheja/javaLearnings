package com.example.OneToOneJPAEmployee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface AddressRepository extends JpaRepository<Address, String> {
}
