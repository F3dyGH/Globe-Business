package tn.globebusiness.spring.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import tn.globebusiness.spring.entities.Complaint;

public interface ComplaintRepository extends CrudRepository<Complaint,Long>{
	
	@Query ("select c from Complaint c where c.description =?1")
    Complaint findByDescription(String description);

}
