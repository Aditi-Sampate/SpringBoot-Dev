package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Factory.Factor;
import com.example.demo.Service.DocumentService;


@RestController
public class DocumentController {

	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		
		DocumentService DS = Factor.CreateObject(type);
		
		DS.readData();
		DS.processData();
		return DS.printData();
		
	}
}
