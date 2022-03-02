package tn.globebusiness.spring.service;

import java.util.List;

import tn.globebusiness.spring.entity.EventInvitation;

public interface IEventInvitationService {
	
	public EventInvitation addInvitation(EventInvitation invitation);
	public EventInvitation updateInvitation(EventInvitation invitation);
	public void deleteInvitation(int invitationId);
	public EventInvitation listInvitationByState(String state);
	
	public List<EventInvitation> listAllInvitations();

}
