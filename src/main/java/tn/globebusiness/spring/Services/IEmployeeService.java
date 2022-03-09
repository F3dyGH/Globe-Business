package tn.globebusiness.spring.Services;

import tn.globebusiness.spring.Entities.Employee;

public interface IEmployeeService {
	//public Employee UpdateEmployee(String employeeName, Employee employee, Employee newEmployee);

    public Employee UpdateEmployee(String employeeName, Employee newEmployee) throws Exception;

    public Employee DisplayEmployeeData(String name) throws Exception;

    //public List<Post> DisplayPostHistory(/*String name,*/ Long id) throws Exception;

    //public List<Post> DisplayPostHistory(String name, Long id) throws Exception;

}
