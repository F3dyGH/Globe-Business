package tn.globebusiness.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.globebusiness.spring.entity.Travel;
import tn.globebusiness.spring.repository.TravelRepository;
import tn.globebusiness.spring.service.ITravelService;

@Service
public class TravelService implements ITravelService {
	@Autowired
	TravelRepository travelrep ;

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
	public void UpdateTravel(Travel travel) {
		travelrep.save(travel);
		
	}

}