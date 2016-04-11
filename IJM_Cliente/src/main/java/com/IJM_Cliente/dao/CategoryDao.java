package com.IJM_Cliente.dao;

import java.util.LinkedHashMap;
import java.util.List;

import com.IJM_Cliente.model.Category;

public interface CategoryDao {

	public void save(Category category);

	public void delete(Category category);

	public List<LinkedHashMap<String, Object>> findAll();

	public Category findById(long id);

	public Category findByName(String name);
	
	public void update(Category category);
}
