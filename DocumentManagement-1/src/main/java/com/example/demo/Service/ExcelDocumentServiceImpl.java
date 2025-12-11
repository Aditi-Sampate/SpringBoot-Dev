package com.example.demo.Service;

public class ExcelDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing Data for excel");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing Data");
		return "excel";
	}

}
