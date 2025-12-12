package com.example.demo.Service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PdfDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("processing data from database");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("printing data for pdf");
		return "pdf";
	}

}
