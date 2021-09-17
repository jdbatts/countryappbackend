package com.globehopper.controllers; 

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.globehopper.models.Capital;

@SpringBootTest
class CapitalControllerTests {

	final int ID=218;

	@Autowired
	CapitalController controller;

	@Test
	void testGetCapitals() {
		assertNotNull(controller.getCapitals());
	}
	
	@Test
	void testGetCapitalByPathVariable() {
		assertNotNull(controller.getCapitalByPathVariable(ID));
	}

	@Test
	void testGetCapitalByRequestParameter() {
		assertNotNull(controller.getCapitalByRequestParameter(ID));
	}

	@Test
	void testPostCapital() {
		Capital capital = new Capital();
		capital.setId(77777);
		capital.setName("POST");
		controller.postCapital(capital);	
		assertNotNull(controller.getCapitalByRequestParameter(77777));	}

	@Test
	void testPutCapital() {
		Capital capital = new Capital();
		capital.setId(77777);
		capital.setName("PUT");
		controller.putCapital(capital);	
		assertEquals(controller.getCapitalByRequestParameter(77777).getName(), "PUT");
	}

	@Test
	void testDeleteCapitalByPathVariable() {
		Capital capital = new Capital();
		capital.setId(77777);
		capital.setName("POST");
		controller.postCapital(capital);	
		controller.deleteCapitalByPathVariable(77777);
	}

	@Test
	void testDeleteCapitalByRequestParameter() {
		Capital capital = new Capital();
		capital.setId(77777);
		capital.setName("POST");
		controller.postCapital(capital);	
		controller.deleteCapitalByRequestParameter(77777);
		
	}


	
	
	
	
	
	
	
	
	
	
}
