package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.DocumentService;
import com.example.demo.Service.ExcelDocumentServiceImpl;
import com.example.demo.Service.PdfDocumentServiceImpl;
import com.example.demo.Service.WordDocumentServiceImpl;


@RestController
@RequestMapping("print")
@Qualifier("ExcelDocumentServiceImpl")
public class DocumentController {

    private WordDocumentServiceImpl wordDocumentServiceImpl;

    private ExcelDocumentServiceImpl excelDocumentServiceImpl;

    private PdfDocumentServiceImpl pdfDocumentServiceImpl;

	private DocumentService documentService;

	private ApplicationContext applicationContext;


    DocumentController(PdfDocumentServiceImpl pdfDocumentServiceImpl, ExcelDocumentServiceImpl excelDocumentServiceImpl,  WordDocumentServiceImpl wordDocumentServiceImpl) {
        this.pdfDocumentServiceImpl = pdfDocumentServiceImpl;
        this.excelDocumentServiceImpl = excelDocumentServiceImpl;
        this.wordDocumentServiceImpl = wordDocumentServiceImpl;
    }
	
	
	//Setter Injection
    @Autowired
	public void setpdfDocumentService(PdfDocumentServiceImpl pdfDocumentServiceImpl)
	{
		this.pdfDocumentServiceImpl = pdfDocumentServiceImpl;
	}
	@Autowired
	public void setexcelDocumentService(ExcelDocumentServiceImpl excelDocumentServiceImpl)
	{ 
		this.excelDocumentServiceImpl = excelDocumentServiceImpl;	
	}
	@Autowired
	public void setDocumentService(DocumentService documentService)
	{
		this.documentService = documentService;
	}
	@Autowired
	public void setWordDocumentService(WordDocumentServiceImpl wordDocumentServiceImpl)
	{
		this.wordDocumentServiceImpl = wordDocumentServiceImpl;
	}
	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext)
	{
		this.applicationContext = applicationContext;
	}
	
	
	@GetMapping("/{type}")
	public String printInvoice(@PathVariable String type) 
	{

		if(type.equals("pdf"))
		{
			documentService = applicationContext.getBean(PdfDocumentServiceImpl.class);
			
		}
		if(type.equals("excel"))
		{
			documentService= applicationContext.getBean(ExcelDocumentServiceImpl.class);
		}
		
		if(type.equals("word"))
		{
			documentService= applicationContext.getBean(WordDocumentServiceImpl.class);
		}
		return documentService.collectData();
	}
}
