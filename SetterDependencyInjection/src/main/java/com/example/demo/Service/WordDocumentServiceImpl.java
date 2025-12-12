package com.example.demo.Service;

import org.springframework.stereotype.Service;

@Service
public class WordDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("processing data for word");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("printing data for word");
		return "word";
	}
	
}
