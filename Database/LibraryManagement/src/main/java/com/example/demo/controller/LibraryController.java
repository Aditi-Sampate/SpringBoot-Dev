package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Library;
import com.example.demo.service.LibraryService;

@RestController
@RequestMapping("library")
public class LibraryController {

	@Autowired
	LibraryService libraryService;
	
	@PostMapping("/add")
	public String addBook(@RequestBody Library library)
	{
		
		libraryService.addBook(library);
		return "Book is added in database";
		
	}
	
	@DeleteMapping("{id}")
	public String deleteBook(@PathVariable int id)
	{
		libraryService.deleteBook(id);
		return "Book is delete from database";
		
	}
	
	@GetMapping("{id}")
	Library getBook(@PathVariable int id)
	{
		return libraryService.getBook(id);
		
	}
}