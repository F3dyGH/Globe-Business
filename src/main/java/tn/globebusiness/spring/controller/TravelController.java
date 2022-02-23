package tn.globebusiness.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.globebusiness.spring.entity.Travel;
import tn.globebusiness.spring.service.ITravelService;

@RestController
@RequestMapping("/travelcontrol")
public class TravelController {
	@Autowired
	ITravelService itravelserv ;
	
	@PostMapping("/addtravel")
	@ResponseBody
	public void addTravel(@RequestBody Travel travel){
		itravelserv.addTravel(travel);
		
	}
	

	@PostMapping("/listtravel")
	@ResponseBody
	public List<Travel> retrieveAllTravel(){
		List<Travel> listtravel = itravelserv.retrieveAllTravel();
		return listtravel;
		
	}

}
