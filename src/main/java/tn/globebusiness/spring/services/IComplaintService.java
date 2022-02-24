package tn.globebusiness.spring.services;

import tn.globebusiness.spring.entities.Complaint;

import java.util.List;
import java.util.Optional;

public interface IComplaintService {

	Complaint addComplaint(Complaint c);

	Optional<Complaint> displayComplaint(Long id) throws Exception;

	List<Complaint> displayAllUserComplaints();
}
