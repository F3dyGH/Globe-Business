package tn.globebusiness.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.globebusiness.spring.Entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}