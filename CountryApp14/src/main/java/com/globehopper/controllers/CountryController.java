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

import com.globehopper.models.Country;
import com.globehopper.repos.CountryRepo;

@RestController
@RequestMapping("/country")
@CrossOrigin("*")
public class CountryController {

	@Autowired
	CountryRepo repo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
	
	@GetMapping("/readall")
	public Iterable<Country> getCountries() {
		LOGGER.info("***reading all countries ");
			return repo.findAll();
	}
	
	@GetMapping("/readone/{id}")
	public Country getCountryByPathVariable(@PathVariable Integer id) {
		LOGGER.info("***reading one country by path variable " + id);
		return repo.findById(id).get();
	}	
	
	@GetMapping("/readone")
	public Country getCountryByRequestParameter(@RequestParam Integer id) {
		LOGGER.info("***reading one country by request parameter " + id);
		return repo.findById(id).get();
	}
	
	@PostMapping("/createnew")
	public Country postCountry(@RequestBody Country country) {
		LOGGER.info("***creating a country " + country.getName());
		return repo.save(country);
	}
	
	@PutMapping("/updateexisting")
	public Country putCountry(@RequestBody Country country) {
		LOGGER.info("***updating a country " + country.getName());
		return repo.save(country);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCountryByPathVariable(@PathVariable Integer id) {
		LOGGER.info("***deleting one country by path variable " + id);
		repo.deleteById(id);
	}

	@DeleteMapping("/delete")
	public void deleteCountryByRequestParameter(@RequestParam Integer id) {
		LOGGER.info("***deleting one country by request parameter " + id);
		repo.deleteById(id);
	}



}

