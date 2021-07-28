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

import com.globehopper.models.Capital;
import com.globehopper.repos.CapitalRepo;

@RestController
@RequestMapping("/capital")
@CrossOrigin("*")
public class CapitalController {
	
	@Autowired
	CapitalRepo repo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);
	
	@GetMapping("/readall")
	public Iterable<Capital> getCapitals() {
		LOGGER.info("***Test 1 reading all capitals ");
		return repo.findAll();
	}
	
	@GetMapping("/readone/{id}")
	public Capital getCapitalByPathVariable(@PathVariable Integer id) {
		LOGGER.info("***Test 2 reading one capital by path variable " + id);
		return repo.findById(id).get();
	}	
	
	@GetMapping("/readone")
	public Capital getCapitalByRequestParameter(@RequestParam Integer id) {
		LOGGER.info("***Test 3 reading one capital by request parameter " + id);
		return repo.findById(id).get();
	}
	
	@PostMapping("/createnew")
	public Capital postCapital(@RequestBody Capital capital) {
		LOGGER.info("***Test 4 creating a capital " + capital.getName());
		return repo.save(capital);
	}
	
	@PutMapping("/updateexisting")
	public Capital putCapital(@RequestBody Capital capital) {
		LOGGER.info("***Test 5 updating a capital " + capital.getName());
		return repo.save(capital);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteCapitalByPathVariable(@PathVariable Integer id) {
		LOGGER.info("***Test 6 deleting one capital by path variable " + id);
		repo.deleteById(id);
	}

	@DeleteMapping("/delete")
	public void deleteCapitalByRequestParameter(@RequestParam Integer id) {
		LOGGER.info("***test 7 deleting one capital by request parameter " + id);
		repo.deleteById(id);
	}

}