package tn.globebusiness.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.globebusiness.spring.entity.EventInvitation;

public interface EventInvitationRepository extends CrudRepository<EventInvitation, Integer> {

	//@Query("SELECT i FROM event_invitation i WHERE i.state= :state")
	EventInvitation findByState(@Param("state")String state);

}
