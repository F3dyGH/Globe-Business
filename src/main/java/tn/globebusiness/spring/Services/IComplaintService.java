package tn.globebusiness.spring.Services;

import java.util.List;
import java.util.Optional;

import tn.globebusiness.spring.Entities.Complaint;

public interface IComplaintService {
	
     Complaint addComplaint(Complaint c,Long idEmployee,Long idTravel);
	
	void deleteComplaint(Long idC);

	Optional<Complaint> displayComplaint(Long idC);

	List<Complaint> displayAllUserComplaints(Long idEmployee);
	
	List<Complaint> displayAllTravelComplaints(Long idTravel);
	
	public List<Complaint> findByTitle(String Title);
	
}
