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
    public Employee UpdateEmployee(String employeeName,Employee employee,Employee newEmployee) {
        employee  = er.findByName(employeeName);
        employee.setName(newEmployee.getName());
        employee.setLastName(newEmployee.getLastName());
        employee.setBirthday(newEmployee.getBirthday());
        employee.setEmail(newEmployee.getEmail());
        employee.setGender(newEmployee.getGender());
        employee.setPhone(newEmployee.getPhone());
        return er.save(employee);//Error changes apply only in the first modification, updating for the second time results an error in the api tester
    }

    @Override
    public Employee DisplayEmployeeData(String name) {
        return er.findByName(name);
    }
}
