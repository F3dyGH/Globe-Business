package tn.globebusiness.spring.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.globebusiness.spring.entity.EventInvitation;
import tn.globebusiness.spring.service.IEventInvitationService;

public class EventInvitationController {
	
	@Autowired
	IEventInvitationService eventInvitationService;
	
	@PostMapping("AddEventInvitation")
	public void addEvent(@RequestBody EventInvitation invitation){
		eventInvitationService.addInvitation(invitation);
	}
	
	/*@GetMapping("ListEventInvitation/{eventId}")
	public Event listEvent(@PathVariable("eventId") Integer eventId) {
		return eventInvitationService.listEvent(eventId);
	}*/

	@PutMapping("updateEventInvitation")
	public EventInvitation updateEventInvitation(@RequestBody EventInvitation invitation) {
		return eventInvitationService.updateInvitation(invitation);
	}
	
	@DeleteMapping("deleteEventInvitation/{invitationId}")
	public boolean deleteEventInvitation(@PathVariable("invitationId") Integer invitationId) {
		eventInvitationService.deleteInvitation(invitationId);
		return true;
	}
	
	@GetMapping("ListAllEventInvitatios")
	public List<EventInvitation> listAllInvitatios(){
		return eventInvitationService.listAllInvitations();
	}

}
