package com.accent.ProjectBackEnd.repository;

import com.accent.ProjectBackEnd.entity.PhaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface PhaseRepository extends JpaRepository<PhaseEntity,Integer> {
	
}
