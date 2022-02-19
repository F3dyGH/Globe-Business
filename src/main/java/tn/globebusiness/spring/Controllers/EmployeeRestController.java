package tn.globebusiness.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.globebusiness.spring.Entities.Employee;
import tn.globebusiness.spring.Repositories.EmployeeRepository;
import tn.globebusiness.spring.Services.IEmployeeService;

@RestController
public class EmployeeRestController {
    @Autowired
    IEmployeeService ies;
    @Autowired
    EmployeeRepository er;

    @PutMapping("/{name}/edit")
    public Employee edit(@PathVariable("name") String name,Employee employee,@RequestBody Employee newEmployee){
        return ies.UpdateEmployee(name,employee,newEmployee);////Error changes apply only in the first modification, updating for the second t
    }
    @GetMapping ("/{name}")
    public Employee display(@PathVariable("name") String name){
        return ies.DisplayEmployeeData(name);
    }
    /*@GetMapping ("/{name}")
    public Employee display(@PathVariable("name") String name){
        //Employee emp = er.findByName(name);
        return er.findByName(name);
    }*/
}
