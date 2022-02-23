package tn.globebusiness.spring.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("ListEvent/{enentId}")
	public Optional<Event> ListEvent(@PathVariable("eventId") Integer eventId) {
		return eventService.listEvent(eventId);
	}

	@PutMapping("updateEvent")
	public Event updateEvent(@RequestBody Event event) {
		return eventService.updateEvent(event);
	}
	
	@DeleteMapping("deleteEvent/{eventId}")
	public boolean deleteEvent(@PathVariable Integer eventId) {
		eventService.deleteEvent(eventId);
		
		return true;
	}
	
	@GetMapping("ListAllEvents")
	public List<Event> ListAllEvents(){
		return eventService.listAllEvents();
	}
}
