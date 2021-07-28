package com.globehopper.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.globehopper.models.City;

@SpringBootTest
class CityControllerTests {

	final int ID = 218;
	
	@Autowired
	CityController controller;

	@Test
	void testGetCities() {
		
		assertNotNull(controller.getCities());
	}

	@Test
	void testGetCityByPathVariable() {		
		assertNotNull(controller.getCityByPathVariable(ID));
	}

	@Test
	void testGetCityByRequestParameter() {		
		assertNotNull(controller.getCityByRequestParameter(ID));
	}

	@Test
	void testPostCity() {
		City city = new City();
		city.setId(77777);
		city.setName("POST");
		controller.postCity(city);
		assertNotNull(controller.getCityByRequestParameter(77777));
	}

	@Test
	void testPutCity() {
		City city = new City();
		city.setId(77777);
		city.setName("PUT");
		controller.putCity(city);
		assertEquals(controller.getCityByRequestParameter(77777).getName(), "PUT");
	}

	@Test
	void testDeleteCityByPathVariable() {
		City city = new City();
		city.setId(77777);
		city.setName("POST");
		controller.postCity(city);
		controller.deleteCityByPathVariable(77777);
	}

	@Test
	void testDeleteCityByRequestParameter() {
		City city = new City();
		city.setId(77777);
		city.setName("POST");
		controller.postCity(city);
		controller.deleteCityByRequestParameter(77777);
		}

}
