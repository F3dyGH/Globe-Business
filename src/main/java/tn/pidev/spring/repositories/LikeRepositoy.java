package tn.pidev.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.pidev.spring.entities.Like;
@Repository
public interface LikeRepositoy extends CrudRepository<Like,Long> {

}
