package com.uabc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uabc.entities.Category;
import com.uabc.entities.City;
import com.uabc.repository.CityRepository;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	
	public List<City> findCityById(Integer id){
	
		List<City> cities = new ArrayList<City>();
		List<City> city = new ArrayList<City>();
		
		City city2 = new City();
		
		cities = cityRepository.findAll();
		
		for(int i=0; i< cities.size(); i++) 
		{
			city2 = cities.get(i);
			if(city2.getCountryId()== id) 
			{
				city.add(city2);
			}
		}
		
		
		return cities;
		
		
	}

}
