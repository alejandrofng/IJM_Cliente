package com.IJM_Cliente.mapper;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.IJM_Cliente.model.Category;

public class CategoryMapper {

	public static List<Category> deserializeList(List<LinkedHashMap<String, Object>> categoriesMap)
	{
		List<Category> categories = new ArrayList<Category>();
		if(categoriesMap!=null){
            for(LinkedHashMap<String, Object> map : categoriesMap){
            	Category category = new Category();
        		category.setCode((int)map.get("code"));
            	category.setName((String) map.get("name"));
            	/*if(map.get("parent")!=null)
            	{
            		category.setParent(deserializeList((List<LinkedHashMap<String, Object>>)map.get("parent")));
            	}*/
            	categories.add(category);
            }
            return categories;
        }
		else return null;
	}
	public static Category deserialize(Category map){
		Category category = new Category();
		category.setCode(map.getCode());
    	category.setName(map.getName());
    	if(map.getParent()!=null)
    	{
    		category.setParent(deserialize(map.getParent()));
    	}
    	return category;
	}
}
