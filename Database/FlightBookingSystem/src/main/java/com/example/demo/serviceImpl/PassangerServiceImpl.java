package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Passanger;
import com.example.demo.repository.PassangerRepository;
import com.example.demo.service.PassangerService;

@Service
public class PassangerServiceImpl implements PassangerService{

	@Autowired
	PassangerRepository passangerRepository;
	
	@Override
	public Passanger addPassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		return passangerRepository.save(passanger);
	}

	@Override
	public Passanger getPassangerById(int passangerId) {
		// TODO Auto-generated method stub
		return passangerRepository.findById(passangerId).get();
	}

	@Override
	public List<Passanger> getAllPassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		return passangerRepository.findAll();
	}

	@Override
	public void deletePassangerById(int passangerId) {
		// TODO Auto-generated method stub
		passangerRepository.deleteById(passangerId);
	}

	@Override
	public void deleteAllPassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		 passangerRepository.deleteAll();
	}

	@Override
	public Passanger updatePassanger(Passanger passanger) {
		// TODO Auto-generated method stub
		return passangerRepository.save(passanger);
	}
	
}
