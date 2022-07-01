package com.uabc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uabc.entities.Rental;
import com.uabc.repository.RentalRepository;

@Service
public class RentalService {

	
	@Autowired
	private RentalRepository rentalRepository;
	
	
	public Rental insertRental(Rental rental) 
	{
		return rentalRepository.save(rental);
		
	}
	

	
}
