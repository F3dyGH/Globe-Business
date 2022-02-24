package tn.globebusiness.spring.services;

import org.springframework.beans.factory.annotation.Autowired;

import tn.globebusiness.spring.entities.Complaint;
import tn.globebusiness.spring.repositories.ComplaintRepository;

public class ComplaintServiceImpl implements IComplaintService {
	@Autowired
	ComplaintRepository cr;

	@Override
	public Complaint addComplaint (Complaint c){
		return cr.save(c);
	}
	
	@Override
	public Complaint displayComplaint (String description) throws Exception {
        if(cr.findByDescription(description)!=null) {
            return cr.findByDescription(description);
        }
        else {
            throw new Exception("Complaint can not be found !");
        }
    }

}

