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

import com.accent.ProjectBackEnd.entity.InstallationEntity;
import com.accent.ProjectBackEnd.dto.InstallationDto;
import com.accent.ProjectBackEnd.service.Iinstallation;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/installation")
public class InstallationController {


	@Autowired
	private ModelMapper modelMapper;

	private InstallationEntity installationEntity;
	private Iinstallation iinstallation;

	public InstallationController(Iinstallation iinstallation) {
		super();
		this.iinstallation = iinstallation;
	}

	@GetMapping
	public ResponseEntity<List<InstallationDto>>getAllInstallation() {
		
		List<InstallationDto> installationResponse =
				iinstallation.getAllInstallation()
				.stream().map(
						i->  modelMapper.map(i, InstallationDto.class))
				.collect(Collectors.toList());
				//.stream()
				//.map(installation -> modelMapper.map(installation, InstallationDto.class))
				//.collect(Collectors.toList());
		return new ResponseEntity<List<InstallationDto>>(installationResponse, HttpStatus.OK);
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<InstallationDto> getInstallationById(@PathVariable(name = "id") int id) {
		InstallationEntity installation = iinstallation.getInstallationById(id);

		// convert entity to DTO
		InstallationDto installationResponse = modelMapper.map(installation, InstallationDto.class);

		//return ResponseEntity.ok().body(installationResponse);
		return new ResponseEntity<InstallationDto>(installationResponse, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<InstallationDto> createInstallation(@RequestBody InstallationDto installationDto) {
		System.out.print("installationRequest1111"+installationDto.toString());

		// convert DTO to entity
		InstallationEntity installationRequest = modelMapper.map(installationDto, InstallationEntity.class);
		
		System.out.print("installationRequest "+installationRequest.toString()+"End");

		InstallationEntity installation = iinstallation.createInstallation(installationRequest);
		System.out.print("installationReques2222"+installation);

		// convert entity to DTO
		InstallationDto installationResponse = modelMapper.map(installation, InstallationDto.class);
		
		System.out.print("installationRequest "+installationResponse.toString()+"End");
		
		return new ResponseEntity<InstallationDto>(installationResponse, HttpStatus.CREATED);
	}

	// change the request for DTO
	// change the response for DTO
	@PutMapping("/{id}")
	public ResponseEntity<InstallationDto> updateInstallation(@PathVariable int id, @RequestBody InstallationDto InstallationDto) {

		// convert DTO to Entity
		InstallationEntity installationRequest = modelMapper.map(InstallationDto, InstallationEntity.class);

		InstallationEntity installation = iinstallation.updateInstallation(id, installationRequest);

		// entity to DTO
		InstallationDto installationResponse = modelMapper.map(installation, InstallationDto.class);

		return ResponseEntity.ok().body(installationResponse);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteInstallation(@PathVariable(name = "id") int id) {
		iinstallation.deleteInstallation(id);
		//ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "zone deleted successfully", HttpStatus.OK);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}
