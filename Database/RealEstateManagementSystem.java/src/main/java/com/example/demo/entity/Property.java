package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "property_28_Jan")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int propertyId;
	
	private String title;
	private String propertyType;
	
	private double areaSqFt;
	private double price;
	
	private String location;
	private String status;
	private LocalDate createdData;
	
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	
	public double getAreaSqFt() {
		return areaSqFt;
	}
	public void setAreaSqFt(double areaSqFt) {
		this.areaSqFt = areaSqFt;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public LocalDate getCreatedData() {
		return createdData;
	}
	public void setCreatedData(LocalDate createdData) {
		this.createdData = createdData;
	}
	
}
