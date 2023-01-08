package com.accent.ProjectBackEnd.controller;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accent.ProjectBackEnd.entity.CategoryEntity;


import com.accent.ProjectBackEnd.dto.CategoryDto;
import com.accent.ProjectBackEnd.service.Icategory;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private ModelMapper modelMapper;

	private Icategory icategory;

	public CategoryController(Icategory icategory) {
		super();
		this.icategory = icategory;
	}

	@GetMapping
	public List<CategoryDto> getAllCategory() {
		
		return icategory.getAllCategory().stream().map(category -> modelMapper.map(category, CategoryDto.class))
				.collect(Collectors.toList());
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<CategoryDto> getCategoryById(@PathVariable(name = "id") int id) {
		CategoryEntity category = icategory.getCategoryById(id);

		// convert entity to DTO
		CategoryDto categoryResponse = modelMapper.map(category, CategoryDto.class);

		//return ResponseEntity.ok().body(categoryResponse);
		return new ResponseEntity<CategoryDto>(categoryResponse, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {

		// convert DTO to entity
		CategoryEntity categoryRequest = modelMapper.map(categoryDto, CategoryEntity.class);

		CategoryEntity category = icategory.createCategory(categoryRequest);

		// convert entity to DTO
		CategoryDto categoryResponse = modelMapper.map(category, CategoryDto.class);

		return new ResponseEntity<CategoryDto>(categoryResponse, HttpStatus.CREATED);
	}

	// change the request for DTO
	// change the response for DTO
	@PutMapping("/{id}")
	public ResponseEntity<CategoryDto> updateCategory(@PathVariable int id, @RequestBody CategoryDto CategoryDto) {

		// convert DTO to Entity
		CategoryEntity categoryRequest = modelMapper.map(CategoryDto, CategoryEntity.class);

		CategoryEntity category = icategory.updateCategory(id, categoryRequest);

		// entity to DTO
		CategoryDto categoryResponse = modelMapper.map(category, CategoryDto.class);

		return ResponseEntity.ok().body(categoryResponse);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteCategory(@PathVariable(name = "id") int id) {
		icategory.deleteCategory(id);
		//ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "zone deleted successfully", HttpStatus.OK);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
