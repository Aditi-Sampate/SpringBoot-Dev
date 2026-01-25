package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.MessageConstant;
import com.example.demo.entity.Event;
import com.example.demo.service.EventService;

@RestController
@RequestMapping("event")
public class EventController {

	
	@Autowired
	EventService eventService;

	@PostMapping("/create")
	public String createEvent(@RequestBody Event event)
	{
		eventService.createEvent(event);
		return MessageConstant.EVENT_Created;
	}

	@GetMapping("/getAll")
	public List<Event> getAllEvent()
	{
		return eventService.getAllEvent(null);
	}
	
	@GetMapping("/{id}")
	public Event getEventById(@PathVariable long id)
	{
		return eventService.getEvent(id);
	}
	
	@PutMapping("/update")
	public Event updateEvent(@RequestBody Event event)
	{
		return eventService.updateEvent(event);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEvent(@PathVariable long id)
	{
		eventService.deleteEvent(id);
		return MessageConstant.EVENT_DELETED;
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllEvents()
	{
		eventService.deleteAll(null);
		return MessageConstant.EVENT_ALLDELETED;
		
	}
}
