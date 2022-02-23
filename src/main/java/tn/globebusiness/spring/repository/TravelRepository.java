package tn.globebusiness.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entity.Travel;

@Repository
public interface TravelRepository  extends CrudRepository <Travel , Long>{

}
