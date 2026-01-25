package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Event;

public interface EventService {

	Event  createEvent(Event event);
	
	Event updateEvent(Event event);
	
	List<Event> getAllEvent(Event event);
	
	Event getEvent(long eventId);
	
	void deleteEvent(long eventId);
	
	void deleteAll(Event event);

}
