package tn.globebusiness.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.globebusiness.spring.entities.Complaint;
import tn.globebusiness.spring.services.IComplaintService;

import java.util.List;
import java.util.Optional;

@RestController
public class ComplaintRestController {
    @Autowired
    IComplaintService ics;
    
    @PostMapping("/complaint")
    public Complaint addComplaint(@RequestBody Complaint complaint) throws Exception{
        return ics.addComplaint(complaint);
    }
    
    @DeleteMapping("/delete-complaint/{idc}")
    public void deleteComplaint(@PathVariable ("idc") Long idc){
    	ics.deleteComplaint(idc);
    }
    
    @GetMapping("/my-complaints/{idc}")
    public Optional<Complaint> displayComplaint(@PathVariable("idc") Long idc) throws Exception{
        return ics.displayComplaint(idc);
    }
    
    @GetMapping("/my-complaints")
    public List<Complaint> displayAllUserComplaints(){
        return ics.displayAllUserComplaints();
    }
}
