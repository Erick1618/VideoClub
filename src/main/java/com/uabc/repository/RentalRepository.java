package com.uabc.repository;

import java.util.Optional;

import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.uabc.entities.Rental;


public interface RentalRepository extends JpaRepository<Rental, Integer> {

	
	
}
