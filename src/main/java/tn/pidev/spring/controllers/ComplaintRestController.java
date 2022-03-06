package tn.pidev.spring.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tn.pidev.spring.entities.Complaint;
import tn.pidev.spring.services.IComplaintService;

@RestController
public class ComplaintRestController {
	@Autowired
    IComplaintService ics;
    
    @PostMapping("/complaint")
    public Complaint addComplaint(@RequestBody Complaint complaint,@RequestParam("idEmployee") Long idEmployee,@RequestParam("idTravel") Long idTravel){
        return ics.addComplaint(complaint,idEmployee,idTravel);
    }
    
    @DeleteMapping("/delete-complaint/{idc}")
    public void deleteComplaint(@PathVariable ("idc") Long idc){
    	ics.deleteComplaint(idc);
    }
    
    @GetMapping("/my-complaints/{idc}")
    public Optional<Complaint> displayComplaint(@PathVariable("idc") Long idc){
        return ics.displayComplaint(idc);
    }
    
    @GetMapping("/my-complaints")
    public List<Complaint> displayAllUserComplaints(@RequestParam("idEmployee") Long idEmployee){
        return ics.displayAllUserComplaints(idEmployee);
    }
    @GetMapping("findByTitle")
    public List<Complaint> findByTitle(@RequestParam("title") String title){
    	return ics.findByTitle(title);
    }
    
    @GetMapping("/Travelcomplaints")
    public List<Complaint> displayAllTravelComplaints(@RequestParam("idTravel") Long idTravel){
        return ics.displayAllTravelComplaints(idTravel);
    }
}

