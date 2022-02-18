package tn.globebusiness.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.globebusiness.spring.Entities.Employee;
import tn.globebusiness.spring.Repositories.EmployeeRepository;

public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    EmployeeRepository er;

    @Override
    public Employee UpdateEmployee(Employee employee) {
        return null;
    }
}
