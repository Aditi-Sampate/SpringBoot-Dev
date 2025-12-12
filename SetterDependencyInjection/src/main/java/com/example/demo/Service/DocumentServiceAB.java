package com.example.demo.Service;

public abstract class DocumentServiceAB implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("reading data from database");
	}

	@Override
	public String collectData() {
		// TODO Auto-generated method stub
		readData();
		processData();
		return printData();
	}

}
