package com.example.demo.Controller;
import com.example.demo.Service.PdfDocumentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;

@RestController
@RequestMapping("print")
@Qualifier("ExcelDocumentSeviceImpl")
public class DocumentController {

    private final ExcelDocumentServiceImpl excelDocumentServiceImpl;

    private final PdfDocumentServiceImpl pdfDocumentServiceImpl;

	//Constructor Injection
	//Constructor is special type of method without return type
	//class name and method is exactly same in constructor 
	//use constructor to create the object & to initialize the state variable.
	
	
	//there 3 type default, parameterised,nonargument
	
	
	DocumentController(PdfDocumentServiceImpl PdfDocumentServiceImpl,
			ExcelDocumentServiceImpl ExcelDocumentServiceImpl)
	{
		this.pdfDocumentServiceImpl = PdfDocumentServiceImpl;
		this.excelDocumentServiceImpl = ExcelDocumentServiceImpl;
		
	}
	
	
	//Setter injection -> Application Context
	
	/*
	void setApplicationContext(ApplicationContext applicationContext)
	{
		this.setApplicationContext(applicationContext);
	}
	*/
	@Autowired
	ApplicationContext applicationContext;	//Spring Factory 
	
	@Autowired
	DocumentService documentService;

	
	@GetMapping("/{type}")
	public String printInvoice(@PathVariable String type)
	{
		
		if(type.equals("pdf"))
		{
			documentService = applicationContext.getBean(PdfDocumentServiceImpl.class);
		}
		if(type.equals("excel"))
		{
			documentService = (DocumentService) applicationContext.getBean(ExcelDocumentServiceImpl.class);
		}
		
		return documentService.collectData();
		
	}	
}
