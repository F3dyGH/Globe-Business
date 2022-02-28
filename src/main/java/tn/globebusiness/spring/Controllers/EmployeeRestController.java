package tn.globebusiness.spring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.globebusiness.spring.Entities.Employee;
import tn.globebusiness.spring.Entities.Post;
import tn.globebusiness.spring.Repositories.EmployeeRepository;
import tn.globebusiness.spring.Services.IEmployeeService;

import java.util.List;


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
    @GetMapping("/{name}/posts")
    public List<Post> DisplayPosts(@PathVariable("name")  String name,Long employeeId) throws Exception {
       /* if (er.findByName(name).getId() == id) {*/
            return ies.DisplayPostHistory(name,employeeId);
        /*}
        else {
            return  null;
        }*/
   }
}
