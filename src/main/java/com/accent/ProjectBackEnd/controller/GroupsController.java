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

import com.accent.ProjectBackEnd.entity.GroupsEntity;


import com.accent.ProjectBackEnd.dto.GroupsDto;
import com.accent.ProjectBackEnd.service.Igroups;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/groups")
public class GroupsController {
	@Autowired
	private ModelMapper modelMapper;

	private Igroups igroups;

	public GroupsController(Igroups igroups) {
		super();
		this.igroups = igroups;
	}

	@GetMapping
	public List<GroupsDto> getAllGroups() {
		
		return igroups.getAllGroups().stream().map(groups -> modelMapper.map(groups, GroupsDto.class))
				.collect(Collectors.toList());
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<GroupsDto> getGroupsById(@PathVariable(name = "id") int id) {
		GroupsEntity groups = igroups.getGroupsById(id);

		// convert entity to DTO
		GroupsDto groupsResponse = modelMapper.map(groups, GroupsDto.class);

		//return ResponseEntity.ok().body(groupsResponse);
		return new ResponseEntity<GroupsDto>(groupsResponse, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<GroupsDto> createGroups(@RequestBody GroupsDto groupsDto) {

		// convert DTO to entity
		GroupsEntity groupsRequest = modelMapper.map(groupsDto, GroupsEntity.class);

		GroupsEntity groups = igroups.createGroups(groupsRequest);

		// convert entity to DTO
		GroupsDto groupsResponse = modelMapper.map(groups, GroupsDto.class);

		return new ResponseEntity<GroupsDto>(groupsResponse, HttpStatus.CREATED);
	}

	// change the request for DTO
	// change the response for DTO
	@PutMapping("/{id}")
	public ResponseEntity<GroupsDto> updateGroups(@PathVariable int id, @RequestBody GroupsDto GroupsDto) {

		// convert DTO to Entity
		GroupsEntity groupsRequest = modelMapper.map(GroupsDto, GroupsEntity.class);

		GroupsEntity groups = igroups.updateGroups(id, groupsRequest);

		// entity to DTO
		GroupsDto groupsResponse = modelMapper.map(groups, GroupsDto.class);

		return ResponseEntity.ok().body(groupsResponse);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteGroups(@PathVariable(name = "id") int id) {
		igroups.deleteGroups(id);
		//ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "zone deleted successfully", HttpStatus.OK);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}


