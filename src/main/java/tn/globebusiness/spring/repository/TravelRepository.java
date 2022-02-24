package tn.globebusiness.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entity.Travel;

@Repository
public interface TravelRepository  extends JpaRepository <Travel , Long>{

}
