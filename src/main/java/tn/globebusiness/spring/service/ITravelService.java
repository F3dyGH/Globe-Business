package tn.globebusiness.spring.service;

import java.util.List;

import tn.globebusiness.spring.entity.Travel;

public interface ITravelService {
	public void addTravel(Travel travel);
	List<Travel> retrieveAllTravel();
	void DeleteTravel(long id);
	void UpdateTravel (Travel travel);

}
