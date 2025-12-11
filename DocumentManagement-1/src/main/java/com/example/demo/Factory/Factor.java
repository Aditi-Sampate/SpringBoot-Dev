package com.example.demo.Factory;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.PdfDocumentServiceImpl;
import com.example.demo.Service.WordDocumentServiceImpl;

public class Factor {

	
	public static DocumentService CreateObject(String type)
	{
		if(type.equals("pdf"))
		{
			return new PdfDocumentServiceImpl();
		}
		
		if(type.equals("word"))
		{
			return new WordDocumentServiceImpl();
		}
		
		if(type.equals("excel"))
		{
			return new ExcelDocumentServiceImpl();
		}
		
		return null;
	}
}
