package tn.globebusiness.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	

	@GetMapping("/listtravel")
	@ResponseBody
	public List<Travel> retrieveAllTravel(){		 
		return itravelserv.retrieveAllTravel();
		
	}
	
	@PostMapping("/deletetravel/{id}")
	public void DeleteTravel(@PathVariable Long id){
		itravelserv.DeleteTravel(id);
		
	}
	
	@PostMapping("/updatetravel/{id}") 
	@ResponseBody
	public void UpdateTravel(@RequestBody Travel travel,@PathVariable long id){
		itravelserv.UpdateTravel(travel, id);
	}
	
	@GetMapping("/retrieveby/{id}") 
	@ResponseBody
	public Optional<Travel> retrieveTravelById(@PathVariable long id){
		return itravelserv.retrieveTravelById(id);
		
	}

}