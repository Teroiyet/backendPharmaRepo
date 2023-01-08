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

import com.accent.ProjectBackEnd.entity.PhaseEntity;


import com.accent.ProjectBackEnd.dto.PhaseDto;
import com.accent.ProjectBackEnd.service.Iphase;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/phases")
public class PhaseController {
	@Autowired
	private ModelMapper modelMapper;

	private Iphase iphase;

	public PhaseController(Iphase iphase) {
		super();
		this.iphase = iphase;
	}

	@GetMapping
	public List<PhaseDto> getAllPhase() {
		
		return iphase.getAllPhase().stream().map(phase -> modelMapper.map(phase, PhaseDto.class))
				.collect(Collectors.toList());
	}
	
	
	
	
	

	@GetMapping("/{id}")
	public ResponseEntity<PhaseDto> getPhaseById(@PathVariable(name = "id") int id) {
		PhaseEntity phase = iphase.getPhaseById(id);

		// convert entity to DTO
		PhaseDto phaseResponse = modelMapper.map(phase, PhaseDto.class);

		//return ResponseEntity.ok().body(phaseResponse);
		return new ResponseEntity<PhaseDto>(phaseResponse, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<PhaseDto> createPhase(@RequestBody PhaseDto phaseDto) {

		// convert DTO to entity
		PhaseEntity phaseRequest = modelMapper.map(phaseDto, PhaseEntity.class);

		PhaseEntity phase = iphase.createPhase(phaseRequest);

		// convert entity to DTO
		PhaseDto phaseResponse = modelMapper.map(phase, PhaseDto.class);

		return new ResponseEntity<PhaseDto>(phaseResponse, HttpStatus.CREATED);
	}

	// change the request for DTO
	// change the response for DTO
	@PutMapping("/{id}")
	public ResponseEntity<PhaseDto> updatePhase(@PathVariable int id, @RequestBody PhaseDto PhaseDto) {

		// convert DTO to Entity
		PhaseEntity phaseRequest = modelMapper.map(PhaseDto, PhaseEntity.class);

		PhaseEntity phase = iphase.updatePhase(id, phaseRequest);

		// entity to DTO
		PhaseDto phaseResponse = modelMapper.map(phase, PhaseDto.class);

		return ResponseEntity.ok().body(phaseResponse);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deletePhase(@PathVariable(name = "id") int id) {
		iphase.deletePhase(id);
		//ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "zone deleted successfully", HttpStatus.OK);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}