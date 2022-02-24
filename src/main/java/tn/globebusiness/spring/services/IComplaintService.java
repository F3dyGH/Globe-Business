package tn.globebusiness.spring.services;

import tn.globebusiness.spring.entities.Complaint;

public interface IComplaintService {

	Complaint addComplaint(Complaint c);

	Complaint displayComplaint(String description) throws Exception;

}
