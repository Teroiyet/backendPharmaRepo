package com.accent.ProjectBackEnd.service;

import com.accent.ProjectBackEnd.entity.CategoryEntity;
import java.util.List;

public interface Icategory {
	   
		List<CategoryEntity> getAllCategory();

		CategoryEntity createCategory(CategoryEntity category);

		CategoryEntity updateCategory(int id, CategoryEntity category);

		void deleteCategory(int id);

		CategoryEntity getCategoryById(int id);
}
