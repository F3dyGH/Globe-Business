package tn.globebusiness.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.globebusiness.spring.entity.EventInvitation;
import tn.globebusiness.spring.repository.EventInvitationRepository;

public class EventInvitationServiceImpl implements IEventInvitationService {

	@Autowired
	EventInvitationRepository invitationRepository;

	@Override
	public EventInvitation addInvitation(EventInvitation invitation) {
		List<EventInvitation> listOfInvitations = listAllInvitations();
		if (!listOfInvitations.contains(invitation))
			return invitationRepository.save(invitation);
		return null;
	}

	@Override
	public EventInvitation updateInvitation(EventInvitation invitation) {
		return invitationRepository.save(invitation);
	}

	@Override
	public void deleteInvitation(int invitationId) {
		invitationRepository.delete(invitationRepository.findById(invitationId).get());
		
		
	}

	@Override
	public EventInvitation listInvitationByState(String state) {
		EventInvitation invitation = invitationRepository.findByState(state);
		if (invitation != null)
			return invitation;
		return null;
	}

	@Override
	public List<EventInvitation> listAllInvitations() {
		return (List<EventInvitation>) invitationRepository.findAll();
	}	

}
