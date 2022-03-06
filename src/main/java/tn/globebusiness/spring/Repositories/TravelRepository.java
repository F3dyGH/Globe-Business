package tn.globebusiness.spring.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.Entities.Travel;
@Repository
public interface TravelRepository extends CrudRepository<Travel,Long> {

}
