package com.example.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PdfDocumentService implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading  Data from Database");
		
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Processing data for PDF");
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return "pdf";
	}

	
	
}
