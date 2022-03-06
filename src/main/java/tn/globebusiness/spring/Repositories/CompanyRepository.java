package tn.globebusiness.spring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.globebusiness.spring.Entities.Category;
import tn.globebusiness.spring.Entities.Company;
import tn.globebusiness.spring.Entities.Event;

public interface CompanyRepository extends CrudRepository<Company, Long> {
    Company findByName(String name);
    
}