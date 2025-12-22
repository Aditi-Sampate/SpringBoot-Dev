package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExamService;
import com.example.demo.serviceImpl.CodingExamServiceImpl;
import com.example.demo.serviceImpl.MCQExamServiceImpl;

@RestController
@RequestMapping("exam")
public class ExamController {

	@Autowired
	ExamService examService = null;
	
	@GetMapping("/{type}")
	public String printMCQResult(@PathVariable String type)
	{
		if(type.equals("mcq"))
		{
			examService = new MCQExamServiceImpl();
		}
		
		if(type.equals("coding"))
		{
			examService = new CodingExamServiceImpl();
		}
		
		examService.verifyStudent();
		examService.evaulateAnswers();
		examService.calculateResult();
		
		return examService.publishResult();
		
	}

}
