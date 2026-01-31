package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Integer>{
	

}
