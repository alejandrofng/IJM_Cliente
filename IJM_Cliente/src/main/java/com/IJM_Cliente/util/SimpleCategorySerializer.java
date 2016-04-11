package com.IJM_Cliente.util;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.IJM_Cliente.model.Category;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class SimpleCategorySerializer extends JsonSerializer<Set<Category>>{
	public void serialize(final Set<Category> categories, final JsonGenerator generator,
        final SerializerProvider provider) throws IOException, JsonProcessingException {
        final Set<SimpleCategory> simpleCategories = new HashSet<SimpleCategory>();
        for (final Category category : categories) {
        	SimpleCategory simpleCategory = new SimpleCategory();
        	simpleCategory.setCode(category.getCode());
        	simpleCategory.setName(category.getName());
        	simpleCategories.add(simpleCategory);                
        }
        generator.writeObject(simpleCategories);
    }

    static class SimpleCategory {

        private Long code;

        private String name;

		public Long getCode() {
			return code;
		}

		public void setCode(Long code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

        // constructors, getters/setters

    }

}
