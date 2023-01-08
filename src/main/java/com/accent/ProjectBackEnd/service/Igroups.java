package com.accent.ProjectBackEnd.service;

import com.accent.ProjectBackEnd.entity.GroupsEntity;
import java.util.List;

public interface Igroups {
	   
		List<GroupsEntity> getAllGroups();

		GroupsEntity createGroups(GroupsEntity groups);

		GroupsEntity updateGroups(int id, GroupsEntity groups);

		void deleteGroups(int id);

		GroupsEntity getGroupsById(int id);
}
