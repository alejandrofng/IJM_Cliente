package com.IJM_Cliente.service;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IJM_Cliente.dao.CategoryDao;
import com.IJM_Cliente.mapper.CategoryMapper;
import com.IJM_Cliente.model.Category;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryDao categoryDao;
	@Override
	public void saveCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(long code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public  Category[] findAllCategories() {
		return categoryDao.findAll();
		//return CategoryMapper.deserializeList(categoriesMap);
	}

	@Override
	public Category findCategoryByCode(long code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCategoryNameAlreadyExists(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCategoryExists(long code) {
		// TODO Auto-generated method stub
		return false;
	}

}
