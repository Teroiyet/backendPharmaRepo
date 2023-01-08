package com.accent.ProjectBackEnd.repository;

import com.accent.ProjectBackEnd.entity.ZonesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface ZonesRepository extends JpaRepository<ZonesEntity,Integer> {
	
}