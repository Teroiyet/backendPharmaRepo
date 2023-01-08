package com.accent.ProjectBackEnd.controller;


import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accent.ProjectBackEnd.dto.ZonesDto;
import com.accent.ProjectBackEnd.entity.ZonesEntity;
import com.accent.ProjectBackEnd.service.Izones;


@RestController @CrossOrigin(origins = "*")
@RequestMapping("/api/zones")
public class ZonesController {

	@Autowired
	private ModelMapper modelMapper;

	private Izones izones;

	public ZonesController(Izones izones) {
		super();
		this.izones = izones;
	}
	/////////////
	@MessageMapping("/list-zones")
	@SendTo("/topic/list-zones")
	@GetMapping
	public List<ZonesDto> getAllZones() {
	 	
		return  izones.getAllZones().stream().map((ZonesEntity zone)->{
		zone.setInstallations(new HashSet());
		return modelMapper.map(zone, ZonesDto.class);
		} )
				.collect(Collectors.toList());
	}
	
	
	
	
	
	
	@GetMapping("/{idZone}")
	public ResponseEntity<ZonesDto> getZonesById(@PathVariable(name = "idZone") int idZone) {
		ZonesEntity zones = izones.getZonesById(idZone);

		// convert entity to DTO
		ZonesDto zonesResponse = modelMapper.map(zones, ZonesDto.class);

		//return ResponseEntity.ok().body(zonesResponse);
		return new ResponseEntity<ZonesDto>(zonesResponse, HttpStatus.OK);
	}

	
	@PostMapping
	public ResponseEntity<ZonesDto> createZones(@RequestBody ZonesDto zonesDto) {

		// convert DTO to entity
		ZonesEntity zonesRequest = modelMapper.map(zonesDto, ZonesEntity.class);

		ZonesEntity zones = izones.createZones(zonesRequest);

		// convert entity to DTO
		ZonesDto zonesResponse = modelMapper.map(zones, ZonesDto.class);

		return new ResponseEntity<ZonesDto>(zonesResponse, HttpStatus.CREATED);
	}

	// change the request for DTO
	// change the response for DTO
	
	
	@PutMapping("/{idZone}")
	public ResponseEntity<ZonesDto> updateZones(@PathVariable int idZone, @RequestBody ZonesDto ZonesDto) {

		// convert DTO to Entity
		ZonesEntity zonesRequest = modelMapper.map(ZonesDto, ZonesEntity.class);

		ZonesEntity zones = izones.updateZones(idZone, zonesRequest);

		// entity to DTO
		ZonesDto zonesResponse = modelMapper.map(zones, ZonesDto.class);

		return ResponseEntity.ok().body(zonesResponse);
	}

	
	@DeleteMapping("/{idZone}")
	public ResponseEntity<Boolean> deleteZones(@PathVariable(name = "idZone") int idZone) {
		izones.deleteZones(idZone);
		//ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "zone deleted successfully", HttpStatus.OK);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}