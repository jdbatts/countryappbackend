package com.globehopper.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globehopper.models.Country;

public interface CountryRepo extends JpaRepository<Country, Integer> {

}
