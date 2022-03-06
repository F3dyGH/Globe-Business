package tn.pidev.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.pidev.spring.entities.Travel;
@Repository
public interface TravelRepository extends CrudRepository<Travel,Long> {

}
