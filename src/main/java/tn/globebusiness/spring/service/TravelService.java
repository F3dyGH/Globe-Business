package tn.globebusiness.spring.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.globebusiness.spring.entity.Employee;
import tn.globebusiness.spring.entity.Travel;
import tn.globebusiness.spring.repository.EmployeeRepository;
import tn.globebusiness.spring.repository.TravelRepository;
import tn.globebusiness.spring.service.ITravelService;

@Service
public class TravelService implements ITravelService {
	@Autowired
	TravelRepository travelrep ;
	@Autowired
	EmployeeRepository emprep ;

	@Override
	public void addTravel(Travel travel) {
		travelrep.save(travel);
		
	}

	@Override
	public List<Travel> retrieveAllTravel() {
		return (List<Travel>) travelrep.findAll();
	}

	@Override
	public void DeleteTravel(long id) {
		travelrep.deleteById(id);
		
	}

	@Override
	public void UpdateTravel(Travel travel,long id) {
		Travel t = travelrep.getById(id);
		t.setDate_begin(travel.getDate_begin());
		t.setDestination(travel.getDestination());
		t.setDate_end(travel.getDate_end());
		t.setObjective(travel.getObjective());
		t.setState(travel.getState());
		t.setCity(travel.getCity());
		travelrep.save(t);
		
	}

	@Override
	public Optional<Travel> retrieveTravelById(long id) {
		return travelrep.findById(id);
	}

	// This function triggers when today's date surpasses tarvel's last day 
	@Override
	public void Autodeletetravel(long id) {
		Travel t = travelrep.getById(id);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDate date = LocalDate.parse((CharSequence) t.getDate_end(), formatter);
		LocalDate today = LocalDate.now();
		if(today.isAfter(date)){
			travelrep.deleteById(id);
			
		}
		
	}

	@Override
	public List<Travel> findBydestination(String destination) {
		return (List<Travel>) travelrep.findBydestination(destination);
	}

	@Override
	public List<Travel> findBystate(String state) {
		return (List<Travel>) travelrep.findBystate(state);
	}

	@Override
	public List<Travel> findBycity(String city) {
		return (List<Travel>) travelrep.findBycity(city);
	}

	@Override
	public List<Travel> findBydestinationAndState(String destination, String state) {
		return (List<Travel>) travelrep.findBydestinationAndState(destination, state);
	}

	@Override
	public List<Travel> findBydestinationAndStateAndCity(String destination, String state, String city) {
		return (List<Travel>) travelrep.findBydestinationAndStateAndCity(destination, state, city);
	}

	@Override
	public void affecttraveler(long id ,long id2) {
		Travel t = travelrep.getById(id);
		Employee e = emprep.getById(id2);
		t.setEmployee(e);
		travelrep.save(t);
		
		
	}

	@Override
	public void AddandAffectTravel(Travel travel, long id) {
		Travel t = new Travel();
		t.setDate_begin(travel.getDate_begin());
		t.setDestination(travel.getDestination());
		t.setDate_end(travel.getDate_end());
		t.setState(travel.getState());
		t.setCity(travel.getCity());
		t.setObjective(travel.getObjective());
		Employee e = emprep.getById(id);
		t.setEmployee(e);
		travelrep.save(t);
	}

	/*@Override
	public List<Travel> findAllTravelbydate(Date date_begin) {
		return travelrep.fi;
	}*/

}
