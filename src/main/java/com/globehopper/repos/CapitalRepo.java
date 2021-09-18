package com.globehopper.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globehopper.models.Capital;

public interface CapitalRepo extends JpaRepository<Capital, Integer> {

}
