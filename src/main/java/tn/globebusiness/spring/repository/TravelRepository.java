package tn.globebusiness.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entity.Travel;

@Repository
public interface TravelRepository  extends JpaRepository <Travel , Long>{

	List<Travel> findBydestination(String destination);
	List<Travel> findBystate(String state);
	List<Travel> findBycity(String city);
	List<Travel> findBydestinationAndState(String destination,String state);
	List<Travel> findBydestinationAndStateAndCity(String destination,String state,String city);

}
