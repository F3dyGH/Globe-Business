package tn.globebusiness.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.globebusiness.spring.entity.Rate;
import tn.globebusiness.spring.repository.RateRepository;

public class RateServiceImpl implements IRateService {
	
	@Autowired
	RateRepository rateRepository;

	@Override
	public Rate addRate(Rate rate) {
		List<Rate> listOfRatings = listAllRatings();
		if(!listOfRatings.contains(rate)) return rateRepository.save(rate);
		return null;
	}

	@Override
	public Rate updateRate(Rate rate) {
		return rateRepository.save(rate);
	}

	@Override
	public void deleteRate(int rateId) {
		rateRepository.delete(rateRepository.findById(rateId).get());
	}

	@Override
	public List<Rate> listAllRatings() {
		return (List<Rate>) rateRepository.findAll();
	}

	@Override
	public Rate listRate(int rateId) {
		return rateRepository.findById(rateId).orElse(new Rate());
	}

	/*@Override
	public Event listEventByCategory(String category) {
		Event event = eventRepository.findByCategory(category);
		if(event != null) return event;
		return null;
	}*/

}
