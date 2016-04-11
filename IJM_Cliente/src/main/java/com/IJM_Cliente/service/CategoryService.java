package com.IJM_Cliente.service;

import java.util.LinkedHashMap;
import java.util.List;

import com.IJM_Cliente.model.Category;

public interface CategoryService {
	public void saveCategory(Category  category);
	
	void updateCategory(Category category);
	
	public void deleteCategory(long code);

	public List<Category> findAllCategories();
	
	public Category findCategoryByCode (long code);
	
	public boolean isCategoryNameAlreadyExists (Category category);
	
	public boolean isCategoryExists(long code);
}
