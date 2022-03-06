package tn.globebusiness.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.Entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
