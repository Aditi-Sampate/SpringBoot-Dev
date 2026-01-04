package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "addmission")
public class CollegeAddmission {

	@Id
	private int id;
	
	private String studentName;
	
	private String course;
	
	private String addmissionDate;
	
	private long mobile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddmissionDate() {
		return addmissionDate;
	}

	public void setAddmissionDate(String addmissionDate) {
		this.addmissionDate = addmissionDate;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
