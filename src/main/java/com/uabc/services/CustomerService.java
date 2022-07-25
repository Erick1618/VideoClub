package com.uabc.services;

import java.util.Optional;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uabc.entities.Customer;
import com.uabc.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public Optional<Customer> findCustomerById(Integer id) {
		return customerRepository.findById(id);
	}
	
	public Customer InsertCustomer(Customer customer) 
	{
		return customerRepository.save(customer);
	}
	
	
}
