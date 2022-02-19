package tn.globebusiness.spring.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import tn.globebusiness.spring.Entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    @Query("select e from Employee e where e.name =?1")
    Employee findByName(String name);

}