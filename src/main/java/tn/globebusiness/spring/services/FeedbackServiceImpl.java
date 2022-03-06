package tn.globebusiness.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import tn.globebusiness.spring.entities.Feedback;
import tn.globebusiness.spring.repositories.FeedbackRepository;

public class FeedbackServiceImpl implements IFeedbackService {
	@Autowired
	FeedbackRepository fr;
	
	@Override
	public Feedback addFeedback (Feedback f){
		return fr.save(f);
	}
	
	@Override
	public void deleteFeedback (Long idF){
		fr.deleteById(idF);
	}
	
	public Feedback updateFeedback(Feedback f) {
		Feedback feedback = fr.findById(f.getIdF()).orElse(null);
		if(feedback != null)
			fr.save(f);
        return f;
	}
	
	@Override
	public Optional<Feedback> displayFeedback (Long idF) throws Exception {
        if(fr.findById(idF)!=null) {
            return fr.findById(idF);
        }
        else {
            throw new Exception("Feedback not found!");
        }
    }
	@Override
	public List<Feedback> displayAllUserFeedback (){
		return (List<Feedback>) fr.findAll();
	}


}
