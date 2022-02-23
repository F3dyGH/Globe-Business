package tn.globebusiness.spring.service;

import java.util.List;
import java.util.Optional;

import tn.globebusiness.spring.entity.Event;

public interface IEventService {
	
	public Event addEvent(Event event);
	public Event updateEvent(Event event);
	public void deleteEvent(int eventId);
	public Optional<Event> listEvent(int eventId);
	public List<Event> listAllEvents();

}
