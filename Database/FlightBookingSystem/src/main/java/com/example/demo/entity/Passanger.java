package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "passanger-30-Jan-26")
public class Passanger {

	@Id
	private int passangerId;
	private String firstName;
	private String lastName;
	private String email;
	private long phone;
	private long passportNo;
	
	public int getPassangerId() {
		return passangerId;
	}
	public void setPassangerId(int passangerId) {
		this.passangerId = passangerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public long getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(long passportNo) {
		this.passportNo = passportNo;
	}
	
}
