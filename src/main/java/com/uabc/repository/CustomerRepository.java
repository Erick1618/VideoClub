package com.uabc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uabc.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	

}
