package tn.globebusiness.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.globebusiness.spring.Entities.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}