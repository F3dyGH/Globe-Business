package tn.globebusiness.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.globebusiness.spring.entity.Event;
import tn.globebusiness.spring.repository.EventRepository;

@Service
public class EventServiceImpl implements IEventService {
	
	@Autowired
	EventRepository eventRepository;

	@Override
	public Event addEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public Event updateEvent(Event event) {
		return eventRepository.save(event);
	}

	@Override
	public void deleteEvent(int eventId) {
		eventRepository.deleteById(eventId);
	}

	@Override
	public List<Event> listAllEvents() {
		return (List<Event>) eventRepository.findAll();
	}

	@Override
	public Optional<Event> listEvent(int eventId) {
		return eventRepository.findById(eventId);
	}

}
