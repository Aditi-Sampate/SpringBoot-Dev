package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class WordDocumentService implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading Data from the DataBase");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing Data for Word");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return "Word";
	}
	
	

}
