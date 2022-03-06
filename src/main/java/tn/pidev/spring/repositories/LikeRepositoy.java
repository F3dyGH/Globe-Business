package tn.pidev.spring.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.pidev.spring.entities.Employee;
import tn.pidev.spring.entities.Likee;
import tn.pidev.spring.entities.Post;
@Repository
public interface LikeRepositoy extends CrudRepository<Likee,Long> {
	@Query("select l from Likee l where l.employee= :employee and l.post= :post")
	Optional<Likee> findByIdEmployeeIdPost(@Param("employee") Employee employee,@Param("post") Post post);
	@Query("select count(l) from Likee l where l.post=:post ")
	int likeNumberByPost(@Param("post") Post post );
}
