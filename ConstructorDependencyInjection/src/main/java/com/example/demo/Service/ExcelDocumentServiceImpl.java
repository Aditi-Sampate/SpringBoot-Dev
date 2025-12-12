package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class ExcelDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("processing data from database");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("printing data for excel");
		return "excel";
	}

}
