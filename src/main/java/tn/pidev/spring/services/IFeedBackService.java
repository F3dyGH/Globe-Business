package tn.pidev.spring.services;

import java.util.List;

import tn.pidev.spring.entities.FeedBack;

public interface IFeedBackService {
	FeedBack addFeedback(FeedBack f,Long idEmployee,Long idTravel);

	void deleteFeedback(Long idF);


	FeedBack  updateFeedback(Long idFeedBack, Long idEmployee, FeedBack f);


	FeedBack displayFeedback(Long idF);

	List<FeedBack> displayAllUserFeedBack(Long idUser);
	
	List<FeedBack> displayAllTravelFeedBack(Long idTravel);
	
	
	
}
