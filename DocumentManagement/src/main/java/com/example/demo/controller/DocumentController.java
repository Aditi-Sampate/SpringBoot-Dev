package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocumentService;
import com.example.demo.service.PdfDocumentService;
import com.example.demo.service.WordDocumentService;


@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type) 
	{
		
		DocumentService ds = null;
		
		
		
		if(type.equals("pdf"))
		{
			ds = new PdfDocumentService();  //Tightly Coupling 
		}
		if(type.equals("word"))
		{
			ds = new WordDocumentService();
		}
		if(type.equals("excel"))
		{
			ds = new ExcelDocumentService();
		}
		
		
		ds.readData();
		ds.processData();
		return ds.printData();
		
	}

}
