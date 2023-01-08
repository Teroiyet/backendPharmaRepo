package com.accent.ProjectBackEnd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.entity.CategoryEntity;
import com.accent.ProjectBackEnd.repository.CategoryRepository;
import com.accent.ProjectBackEnd.service.Icategory;

@Service
public class CategoryService implements Icategory {
	
//private final CategoryRepository categoryRepository;
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	@Override
	public List<CategoryEntity> getAllCategory() {
		List<CategoryEntity>	x  = categoryRepository.findAll();
		System.out.print(x.get(0).getName());
		return x;
	}

	@Override
	public CategoryEntity createCategory(CategoryEntity category) {
		return categoryRepository.save(category);
	}

	@Override
	public CategoryEntity updateCategory(int id, CategoryEntity categoryRequest) {
		CategoryEntity category = categoryRepository.findById(id)
				.orElseThrow();
	
		category.setName(categoryRequest.getName());
		category.setColor(categoryRequest.getColor());
		category.setIcon(categoryRequest.getIcon());
				
		return categoryRepository.save(category);
	}

	@Override
	public void deleteCategory(int id) {
		CategoryEntity category = categoryRepository.findById(id)
				.orElseThrow();
		
		categoryRepository.delete(category);
	}

	@Override
	public CategoryEntity getCategoryById(int id) {
		CategoryEntity result = categoryRepository.findById(id).orElseThrow();
		
			return result;
		
		

	}
}
