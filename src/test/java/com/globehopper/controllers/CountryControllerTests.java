package com.globehopper.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.globehopper.models.Country;

@SpringBootTest
class CountryControllerTests {

	final int ID = 218;
	
	@Autowired
	CountryController controller;
	
	@Test
	void testGetCountries() {
		assertNotNull(controller.getCountries());
	}

	@Test
	void testGetCountryByPathVariable() {
		assertNotNull(controller.getCountryByPathVariable(ID));
	}

	@Test
	void testGetCountryByRequestParameter() {
		assertNotNull(controller.getCountryByRequestParameter(ID));
	}

	@Test
	void testPostCountry() {
		Country country = new Country();
		country.setId(77777);
		country.setName("POST");
		controller.postCountry(country);	
		assertNotNull(controller.getCountryByRequestParameter(77777));
	}

	@Test
	void testPutCountry() {
		Country country = new Country();
		country.setId(77777);
		country.setName("PUT");
		controller.putCountry(country);	
		assertEquals(controller.getCountryByRequestParameter(77777).getName(), "PUT");
	}

	@Test
	void testDeleteCountryByPathVariable() {
		Country country = new Country();
		country.setId(77777);
		country.setName("POST");
		controller.postCountry(country);	
		controller.deleteCountryByPathVariable(77777);
	}

	@Test
	void testDeleteCountryByRequestParameter() {
		Country country = new Country();
		country.setId(77777);
		country.setName("POST");
		controller.postCountry(country);	
		controller.deleteCountryByRequestParameter(77777);	}

}
