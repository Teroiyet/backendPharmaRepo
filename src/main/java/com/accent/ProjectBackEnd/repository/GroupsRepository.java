package com.accent.ProjectBackEnd.repository;

import com.accent.ProjectBackEnd.entity.GroupsEntity;

import antlr.collections.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository 
public interface GroupsRepository extends JpaRepository<GroupsEntity,Integer> {
		
	/*@Query(value = " SELECT g FROM groups g")
	public List getAllGroups();*/
}

