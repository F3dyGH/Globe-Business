package tn.globebusiness.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.globebusiness.spring.entity.Category;
import tn.globebusiness.spring.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryRepository.delete(categoryRepository.findById(categoryId).get());
		
	}

	@Override
	public List<Category> listAllCategories() {
		return (List<Category>) categoryRepository.findAll();
	}
	
	@Override
	public Category listCategory(String categoryName) {
		return categoryRepository.findByName(categoryName).get(0);
	}

}
