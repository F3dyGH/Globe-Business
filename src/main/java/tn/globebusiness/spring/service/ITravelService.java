package tn.globebusiness.spring.service;

import java.util.List;
import java.util.Optional;

import tn.globebusiness.spring.entity.Travel;

public interface ITravelService {
	public void addTravel(Travel travel);
	List<Travel> retrieveAllTravel();
	void DeleteTravel(long id);
	void UpdateTravel (Travel travel,long id);
	Optional<Travel> retrieveTravelById(long id);

}
