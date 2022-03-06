package tn.globebusiness.spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entities.Complaint;

@Repository
public interface ComplaintRepository extends CrudRepository<Complaint,Long>{

	List<Complaint> findByTitle(String title);

	
	
	
}
