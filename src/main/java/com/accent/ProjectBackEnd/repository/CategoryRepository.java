package com.accent.ProjectBackEnd.repository;

import com.accent.ProjectBackEnd.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer> {
	
}
