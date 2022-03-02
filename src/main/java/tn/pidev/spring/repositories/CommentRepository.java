package tn.pidev.spring.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.pidev.spring.entities.Comment;
@Repository
public interface CommentRepository extends CrudRepository<Comment,Long> {

}
