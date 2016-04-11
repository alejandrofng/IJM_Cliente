package com.IJM_Cliente.model;

import com.IJM_Cliente.util.SimpleCategorySerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Category {

	private long code;
	
	private String name;
	
	@JsonSerialize(using = SimpleCategorySerializer.class)
	private Category parent;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}
	
}
