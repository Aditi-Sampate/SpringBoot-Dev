package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

@Service
public class MCQExamServiceImpl extends ExamServiceAB{

	@Override
	public String evaulateAnswers() {
		// TODO Auto-generated method stub
		return "Evaulated The Answers of MCQ Exam";
	}

	@Override
	public String calculateResult() {
		// TODO Auto-generated method stub
		return "Result Calculated of MCQ Exam";
	}

	@Override
	public String publishResult() {
		// TODO Auto-generated method stub
		return "Result are published of MCQ Exam";
	}
	
}
