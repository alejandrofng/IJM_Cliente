package com.IJM_Cliente.dao;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
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
	public Category[] findAll() {
		RestTemplate restTemplate = new RestTemplate();
        @SuppressWarnings("unchecked")
      //  List<LinkedHashMap<String, Object>> categoriesMap = restTemplate.getForObject(REST_SERVICE_URI+"/category/", List.class);
        ResponseEntity<Category[]> response = restTemplate.getForEntity(REST_SERVICE_URI+"/category/", Category[].class);
        return response.getBody();
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
