package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Flight-31-Jan-26")
public class Flight {

	@Id
	private int flightId;
	private long flightNumber;
	private int airlineId;
	private int sourceAirport;
	private int destinationAirport;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private int aircraftId;
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	
	public int getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(int sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	
	public int getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(int destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}
	
	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public int getAircraftId() {
		return aircraftId;
	}
	public void setAircraftId(int aircraftId) {
		this.aircraftId = aircraftId;
	}

}
