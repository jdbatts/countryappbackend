package com.globehopper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.globehopper.CountryApp14Application;

@SpringBootApplication
public class CountryApp14Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(CountryApp14Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CountryApp14Application.class, args);
		LOGGER.info("***Kya chal raha hai? ***");
	}

}
