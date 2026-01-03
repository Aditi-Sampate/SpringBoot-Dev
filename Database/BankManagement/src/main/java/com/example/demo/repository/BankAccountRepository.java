package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer>{

}
