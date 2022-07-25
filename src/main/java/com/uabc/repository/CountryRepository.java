package com.uabc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uabc.entities.CatalogoIndex;
import com.uabc.entities.Country;
import com.uabc.entities.Payment;

public interface CountryRepository extends JpaRepository<Country, Integer> {
	

}
