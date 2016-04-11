package com.IJM_Cliente.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.IJM_Cliente.model.Category;


@Repository("categoryDao")
public class CategoryDaoImpl extends AbstractDao implements CategoryDao{

	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Category category) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LinkedHashMap<String, Object>> findAll() {
		RestTemplate restTemplate = new RestTemplate();
        @SuppressWarnings("unchecked")
        List<LinkedHashMap<String, Object>> categoriesMap = restTemplate.getForObject(REST_SERVICE_URI+"/category/", List.class);
        return categoriesMap;
	}

	@Override
	public Category findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		
	}

}
