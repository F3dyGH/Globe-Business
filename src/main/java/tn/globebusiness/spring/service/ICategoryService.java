package tn.globebusiness.spring.service;

import java.util.List;

import tn.globebusiness.spring.entity.Category;

public interface ICategoryService {
	
	public Category addCategory(Category category);
	public void deleteCategory(int categoryId);
	public List<Category> listAllCategories();
	public Category listCategory(String categoryName);

}
