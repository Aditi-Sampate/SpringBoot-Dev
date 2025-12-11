package com.example.demo.Service;

public class PdfDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data for pdf");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Printing Data");
		return "pdf";
	}

}
