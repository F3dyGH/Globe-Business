package tn.globebusiness.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.stereotype.Service;
import tn.globebusiness.spring.entities.Complaint;
import tn.globebusiness.spring.repositories.ComplaintRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintServiceImpl implements IComplaintService {
	@Autowired
	ComplaintRepository cr;

	@Override
	public Complaint addComplaint (Complaint c){
		return cr.save(c);
	}
	
	@Override
	public void deleteComplaint(Long idC){
		cr.deleteById(idC);
	}
	
	@Override
	public Optional<Complaint> displayComplaint(Long idC) throws Exception {
        if(cr.findById(idC)!=null) {
            return cr.findById(idC);
        }
        else {
            throw new Exception("Complaint can not be found !");
        }
    }
	@Override
	public List<Complaint> displayAllUserComplaints(){
		return (List<Complaint>) cr.findAll();
	}

	public List<Complaint> findByTitle (String Title){
		return (List<Complaint>) cr.findByTitle(Title);
		
	
		
	}
}

