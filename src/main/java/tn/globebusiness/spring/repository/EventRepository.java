package tn.globebusiness.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entity.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {

	//@Query("Select e from event e where e.startDate=:categoryDate")
	public List<Event> findByStartDate(String categoryDate);
	
}
