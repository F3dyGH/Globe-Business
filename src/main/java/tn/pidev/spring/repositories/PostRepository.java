package tn.pidev.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.pidev.spring.entities.Post;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {
	//@Query("select p from Post p where ")
}
