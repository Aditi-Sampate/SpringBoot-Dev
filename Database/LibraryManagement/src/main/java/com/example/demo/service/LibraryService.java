package com.example.demo.service;

import com.example.demo.entity.Library;

public interface LibraryService {
	
	void addBook(Library library);
	
	void deleteBook(int id );
	
	Library getBook(int id);


}