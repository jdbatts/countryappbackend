package com.globehopper.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.globehopper.models.City;
import com.globehopper.repos.CityRepo;

@RestController
@RequestMapping("/city")
@CrossOrigin("*")
public class CityController {
	
	@Autowired
	CityRepo repo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);
	
	@GetMapping("/readall")
	public Iterable<City> getCities() {
		LOGGER.info("***reading all cities ");
		return repo.findAll();
	}

	@GetMapping("/readone/{id}")
	public City getCityByPathVariable(@PathVariable Integer id) {
		LOGGER.info("***reading one city by path variable " + id);
		return repo.findById(id).get();
	}	
	
	@GetMapping("/readone")
	public City getCityByRequestParameter(@RequestParam Integer id) {
		LOGGER.info("***reading one city by request parameter " + id);
		return repo.findById(id).get();
	}
	
	@PostMapping("/createnew")
	public City postCity(@RequestBody City city) {
		LOGGER.info("***creating a city " + city.getName());
		return repo.save(city);
	}
	
	@PutMapping("/updateexisting")
	public City putCity(@RequestBody City city) {
		LOGGER.info("***updating a city " + city.getName());
		return repo.save(city);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCityByPathVariable(@PathVariable Integer id) {
		LOGGER.info("***deleting one city by path variable " + id);
		repo.deleteById(id);
	}

	@DeleteMapping("/delete")
	public void deleteCityByRequestParameter(@RequestParam Integer id) {
		LOGGER.info("***deleting one city by request parameter " + id);
		repo.deleteById(id);
	}
}
