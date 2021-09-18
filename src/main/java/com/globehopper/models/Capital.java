package com.globehopper.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Capital {

	@Id
	private Integer Id;
	private String Name;
	private String Country;

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

	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}
}