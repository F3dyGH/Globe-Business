package tn.globebusiness.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entity.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
	
	@Query("select e from Event e where e.eventId=?1")
	Event ListEvent (Integer eventId);

}
