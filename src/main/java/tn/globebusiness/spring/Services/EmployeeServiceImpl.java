package tn.globebusiness.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.globebusiness.spring.Entities.Employee;
import tn.globebusiness.spring.Repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    EmployeeRepository er;

    @Override
    public Employee UpdateEmployee(String employeeName, Employee newEmployee) throws Exception {
        Employee employee  = er.findByName(employeeName);
            if(employee!=null) {
                employee.setName(newEmployee.getName());
                employee.setLastName(newEmployee.getLastName());
                employee.setBirthday(newEmployee.getBirthday());
                employee.setEmail(newEmployee.getEmail());
                employee.setGender(newEmployee.getGender());
                employee.setPhone(newEmployee.getPhone());
            }
            else{ throw new Exception("Employee not found"); }
        return er.save(employee);
    }

    @Override
    public Employee DisplayEmployeeData(String name) throws Exception {
        if(er.findByName(name)!=null) {
            return er.findByName(name);
        }
        else {
            throw new Exception("Employee not found");
        }
    }

}
