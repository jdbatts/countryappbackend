package com.globehopper.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {

	@Id
	private Integer Id;
	private String Name;
	private String CountryCode;
	private String District;
	private Integer Population;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getCode() {
		return CountryCode;
	}
	public void setCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String District) {
		this.District = District;
	}
	public Integer getPopulation() {
		return Population;
	}
	public void setPopulation(Integer Population) {
		this.Population = Population;
	}
	
}
