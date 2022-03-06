package tn.globebusiness.spring.services;

import java.util.List;
import java.util.Optional;

import tn.globebusiness.spring.entities.Feedback;

public interface IFeedbackService {

	Feedback addFeedback(Feedback f);

	void deleteFeedback(Long idF);



	static Feedback updateFeedback(Feedback f) {
		// TODO Auto-generated method stub
		return null;
	}


	Optional<Feedback> displayFeedback(Long idF) throws Exception;

	List<Feedback> displayAllUserFeedback();




}
