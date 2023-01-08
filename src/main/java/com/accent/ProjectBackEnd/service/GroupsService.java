package com.accent.ProjectBackEnd.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.entity.GroupsEntity;
import com.accent.ProjectBackEnd.repository.GroupsRepository;
import com.accent.ProjectBackEnd.service.Igroups;

@Service
public class GroupsService implements Igroups{
	
private final GroupsRepository groupsRepository;
	
	public GroupsService(GroupsRepository groupsRepository) {
		super();
		this.groupsRepository = groupsRepository;
	}

	@Override
	public List<GroupsEntity> getAllGroups() {
		List<GroupsEntity>	x  = groupsRepository.findAll();
		System.out.print(x.get(0).getName());
		return x;
	}

	@Override
	public GroupsEntity createGroups(GroupsEntity groups) {
		return groupsRepository.save(groups);
	}

	@Override
	public GroupsEntity updateGroups(int id, GroupsEntity groupsRequest) {
		GroupsEntity groups = groupsRepository.findById(id)
				.orElseThrow();
		
	 
		groups.setNbPhase(groupsRequest.getNbPhase());
		groups.setEnabled(groupsRequest.getEnabled());
		groups.setName(groupsRequest.getName());
		groups.setColor(groupsRequest.getColor());
		groups.setTenantId(groupsRequest.getTenantId());
		groups.setType(groupsRequest.getType());
		groups.setThreshold(groupsRequest.getThreshold());
		groups.setThresholdDay(groupsRequest.getThresholdDay());
		groups.setThresholdNight(groupsRequest.getThresholdNight());
		groups.setThresholdWeek(groupsRequest.getThresholdWeek());
		groups.setThresholdWeekDays(groupsRequest.getThresholdWeekDays());
		groups.setThresholdWeekend(groupsRequest.getThresholdWeekend());
		groups.setThresholdInstCuurent(groupsRequest.getThresholdInstCuurent());
		groups.setX(groupsRequest.getX());
		groups.setY(groupsRequest.getY());
		groups.setZ(groupsRequest.getZ());
		groups.setHauteur(groupsRequest.getHauteur());
		groups.setLargeur(groupsRequest.getHauteur());
		return groupsRepository.save(groups);
	}

	@Override
	public void deleteGroups(int id) {
		GroupsEntity groups = groupsRepository.findById(id)
				.orElseThrow();
		
		groupsRepository.delete(groups);
	}

	@Override
	public GroupsEntity getGroupsById(int id) {
		GroupsEntity result = groupsRepository.findById(id).orElseThrow();
		
			return result;
		
		

	}
}
