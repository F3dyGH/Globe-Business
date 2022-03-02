package tn.globebusiness.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import tn.globebusiness.spring.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>,JpaRepository <Employee, Long> {

}
