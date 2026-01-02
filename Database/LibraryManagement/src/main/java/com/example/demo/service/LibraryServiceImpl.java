package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Library;
import com.example.demo.repository.LibraryRepository;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	@Autowired
	LibraryRepository libraryRepository;

	@Override
	public void addBook( Library library) {
		// TODO Auto-generated method stub
		libraryRepository.save(library);
		
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		libraryRepository.deleteById(id);
		
	}

	@Override
	public Library getBook(int id) {
		// TODO Auto-generated method stub
		return libraryRepository.findById(id).get();
		

	}

}
