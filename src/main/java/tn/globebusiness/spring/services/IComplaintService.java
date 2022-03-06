package tn.globebusiness.spring.services;

import tn.globebusiness.spring.entities.Complaint;

import java.util.List;
import java.util.Optional;

public interface IComplaintService {

	Complaint addComplaint(Complaint c);
	
	void deleteComplaint(Long idC);

	Optional<Complaint> displayComplaint(Long idC) throws Exception;

	List<Complaint> displayAllUserComplaints();
	
	public List<Complaint> findByTitle(String Title);

	
}
