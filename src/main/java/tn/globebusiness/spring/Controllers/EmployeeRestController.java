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
    public Employee edit(@PathVariable("name") String name,@RequestBody Employee newEmployee) throws Exception {
        return ies.UpdateEmployee(name,newEmployee);
    }
    @GetMapping ("/{name}")
    public Employee display(@PathVariable("name") String name) throws Exception {
        return ies.DisplayEmployeeData(name);
    }
}
