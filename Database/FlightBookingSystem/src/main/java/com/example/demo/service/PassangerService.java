package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Passanger;

public interface PassangerService {

	Passanger addPassanger(Passanger passanger);
	
	Passanger getPassangerById(int passangerId);
	
	List<Passanger> getAllPassanger(Passanger passanger);
	
	void deletePassangerById(int passangerId);
	
	void deleteAllPassanger(Passanger passanger);
	
	Passanger updatePassanger(Passanger passanger);

	
}
