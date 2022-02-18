package tn.globebusiness.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.globebusiness.spring.Entities.Domain;

public interface DomainRepository extends CrudRepository<Domain, Long> {
}