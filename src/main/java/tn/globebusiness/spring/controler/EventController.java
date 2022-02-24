package tn.globebusiness.spring.controler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.globebusiness.spring.entity.Event;
import tn.globebusiness.spring.service.IEventService;

@RestController
public class EventController {
	
	@Autowired
	IEventService eventService;
	
	@PostMapping("AddEvent")
	public void addEvent(@RequestBody Event event){
		eventService.addEvent(event);
	}
	
	@GetMapping("ListEvent/{eventId}")
	public Event ListEvent(@PathVariable("eventId") Integer eventId) {
		return eventService.listEvent(eventId);
	}
	
	@GetMapping("ListEventByDate/{eventDate}")
	public Event ListEventByDate(@PathVariable("eventDate") String eventDate) {
		return eventService.listEvent(eventDate);
	}

	@PutMapping("updateEvent")
	public Event updateEvent(@RequestBody Event event) {
		return eventService.updateEvent(event);
	}
	
	@DeleteMapping("deleteEvent/{eventId}")
	public boolean deleteEvent(@PathVariable("eventId") Integer eventId) {
		eventService.deleteEvent(eventId);
		
		return true;
	}
	
	@GetMapping("ListAllEvents")
	public List<Event> ListAllEvents(){
		return eventService.listAllEvents();
	}
}
