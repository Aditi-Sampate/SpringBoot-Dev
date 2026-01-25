package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Event;
import com.example.demo.repository.EventRepository;
import com.example.demo.service.EventService;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public Event createEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.save(event);
	}

	@Override
	public Event updateEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.save(event);
	}

	@Override
	public List<Event> getAllEvent(Event event) {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public Event getEvent(long eventId) {
		// TODO Auto-generated method stub
		return eventRepository.findById(eventId).get();
	}

	@Override
	public void deleteEvent(long eventId) {
		// TODO Auto-generated method stub
		eventRepository.deleteById(eventId);
	}

	@Override
	public void deleteAll(Event event) {
		// TODO Auto-generated method stub
		eventRepository.deleteAll();
	}

}
