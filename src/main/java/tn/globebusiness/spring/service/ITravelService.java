package tn.globebusiness.spring.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import tn.globebusiness.spring.entity.Employee;
import tn.globebusiness.spring.entity.Travel;

public interface ITravelService {
	public void addTravel(Travel travel);
	List<Travel> retrieveAllTravel();
	void DeleteTravel(long id);
	void UpdateTravel (Travel travel,long id);
	Optional<Travel> retrieveTravelById(long id);
	void Autodeletetravel (long id);
	List<Travel> findBydestination(String destination);
	//List<Travel> findAllTravelbydate(Date date_begin);
	List<Travel> findBystate(String state);
	List<Travel> findBycity(String city);
	List<Travel> findBydestinationAndState(String destination,String state);
	List<Travel> findBydestinationAndStateAndCity(String destination,String state,String city);
	void affecttraveler(long id,long id2);
	void AddandAffectTravel(Travel travel,long id);
	

}
