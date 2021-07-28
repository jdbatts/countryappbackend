package com.globehopper.controllers;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

	HelloController hc = new HelloController();
	
	@Test
	void testIndex() {
		hc.index();
	}

}
