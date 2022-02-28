package tn.globebusiness.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

	
	    public List<Category> findByName(String categoryName);

}
