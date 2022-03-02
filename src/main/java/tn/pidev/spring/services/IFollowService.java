package tn.pidev.spring.services;

import java.util.List;

import tn.pidev.spring.entities.Employee;
import tn.pidev.spring.entities.Follow;

public interface IFollowService {
	Follow addFollow(Long idEmployee1,Long idEmployee2);
	//Follow deleteFollow(Long idEmployee);
	void acceptFollow(Long idFollow);
	List<Employee> myFrinds(Long idEmployee1,int etat);
	List<Employee> myInvitations(Long idEmployee2, int etat);
}
