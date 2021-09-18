package com.globehopper.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	private Integer Id;
	private String CountryCode;
	private String Name;
	private Integer Population;
	private String Continent;
	private String Region;
	private Integer SurfaceArea;
	private String GovernmentForm;
	
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Integer getPopulation() {
		return Population;
	}
	public void setPopulation(Integer Population) {
		this.Population = Population;
	}
	public String getContinent() {
		return Continent;
	}
	public void setContinent(String Continent) {
		this.Continent = Continent;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String Region) {
		this.Region = Region;
	}
	public Integer getSurfaceArea() {
		return SurfaceArea;
	}
	public void setSurfaceArea(Integer SurfaceArea) {
		this.SurfaceArea = SurfaceArea;
	}
	public String getGovernmentForm() {
		return GovernmentForm;
	}
	public void setGovernmentForm(String GovernmentForm) {
		this.GovernmentForm = GovernmentForm;
	}

}
