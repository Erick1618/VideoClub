package com.uabc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uabc.entities.Category;
import com.uabc.entities.City;

public interface CityRepository extends JpaRepository<City, Integer>{
	
	

}
