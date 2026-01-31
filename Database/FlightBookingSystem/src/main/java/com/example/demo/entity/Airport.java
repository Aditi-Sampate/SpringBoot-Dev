package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Airport-30-Jan-26")
public class Airport {

	@Id
	private int airportID;
	private String airportName;
	private String city;
	private String country;
	private long airportCode;
	
	public int getAirportID() {
		return airportID;
	}
	public void setAirportID(int airportID) {
		this.airportID = airportID;
	}
	
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public long getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(long airportCode) {
		this.airportCode = airportCode;
	}
	
}
