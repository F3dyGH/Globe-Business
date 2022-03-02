package tn.globebusiness.spring.service;

import java.util.List;

import tn.globebusiness.spring.entity.Rate;

public interface IRateService {
	
	public Rate addRate(Rate rate);
	public void deleteRate(int rateId);
	public List<Rate> listAllRatings();
	public Rate updateRate(Rate rate);
	public Rate listRate(int RateId);

}
