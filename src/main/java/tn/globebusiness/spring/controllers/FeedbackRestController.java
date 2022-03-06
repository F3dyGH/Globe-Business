package tn.globebusiness.spring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.globebusiness.spring.entities.Feedback;
import tn.globebusiness.spring.services.IFeedbackService;

public class FeedbackRestController {
	@Autowired
	IFeedbackService ifs;
	
	@PostMapping("/feedback")
    public Feedback addFeedback (@RequestBody Feedback feedback) throws Exception{
        return ifs.addFeedback (feedback);
	}
	
	@DeleteMapping("/delete-feedback/{idf}")
    public void deleteFeedback(@PathVariable ("idf") Long idf){
    	ifs.deleteFeedback(idf);
    }
	
	@PutMapping("/edit-feedback/{idF}")
	public Feedback updateFeedback(@RequestBody Feedback feedbacks) {
	return IFeedbackService.updateFeedback(feedbacks);
	}

	
	@GetMapping("/the_feedback/{idf}")
    public Optional<Feedback> displayFeedback (@PathVariable("idf") Long idF) throws Exception{
        return ifs.displayFeedback(idF);
    }
	
	 @GetMapping("/all-feedback")
	    public List<Feedback> displayAllUserFeedback(){
	        return ifs.displayAllUserFeedback();
	    }

}
