package tn.globebusiness.spring.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.Entities.Post;

@Repository
public interface PostRepository extends CrudRepository<Post,Long> {
	//@Query("select p from Post p where ")
}
