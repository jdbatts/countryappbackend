package com.globehopper.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globehopper.models.City;

public interface CityRepo extends JpaRepository<City, Integer> {

}
