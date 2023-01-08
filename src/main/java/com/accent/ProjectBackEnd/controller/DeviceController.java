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

import com.accent.ProjectBackEnd.entity.DeviceEntity;


import com.accent.ProjectBackEnd.dto.DeviceDto;
import com.accent.ProjectBackEnd.dto.InstallationDto;
import com.accent.ProjectBackEnd.dto.ZonesDto;
import com.accent.ProjectBackEnd.service.Idevice;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/devices")
public class DeviceController {
	@Autowired
	private ModelMapper modelMapper;

	private Idevice idevice;

	public DeviceController(Idevice idevice) {
		super();
		this.idevice = idevice;
	}

	
	
	/*@GetMapping
	public List<DeviceDto> getAllDevice() {
		
		return idevice.getAllDevice().stream().map(device -> modelMapper.map(device, DeviceDto.class))
				.collect(Collectors.toList());
	}*/
	
	
	@GetMapping
	public ResponseEntity<List<DeviceDto>>getAllDevice() {
		System.out.println("hellllllllllllllo");
		 List <DeviceEntity> devices =idevice.getAllDevice();
		
		System.out.println("devices"+devices);
				
		List<DeviceDto> deviceResponse=	devices.stream().map(
						i->  modelMapper.map(i, DeviceDto.class))
				.collect(Collectors.toList());
		System.out.println("deviceResponse"+deviceResponse);
				
		return new ResponseEntity<List<DeviceDto>>(deviceResponse, HttpStatus.OK);
	}
	
	
	
	

	@GetMapping("/{id}")
	public ResponseEntity<DeviceDto> getDeviceById(@PathVariable(name = "id") int id) {
		DeviceEntity device = idevice.getDeviceById(id);

		// convert entity to DTO
		DeviceDto deviceResponse = modelMapper.map(device, DeviceDto.class);

		//return ResponseEntity.ok().body(deviceResponse);
		return new ResponseEntity<DeviceDto>(deviceResponse, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<DeviceDto> createDevice(@RequestBody DeviceDto deviceDto) {
		
		System.out.println("Ressssss"+deviceDto.getId());
		// convert DTO to entity
		DeviceEntity deviceRequest = modelMapper.map(deviceDto, DeviceEntity.class);

		DeviceEntity device = idevice.createDevice(deviceRequest);

		// convert entity to DTO
		DeviceDto deviceResponse = modelMapper.map(device, DeviceDto.class);

		return new ResponseEntity<DeviceDto>(deviceResponse, HttpStatus.CREATED);
	}

	// change the request for DTO
	// change the response for DTO
	@PutMapping("/{id}")
	public ResponseEntity<DeviceDto> updateDevice(@PathVariable int id, @RequestBody DeviceDto DeviceDto) {

		// convert DTO to Entity
		DeviceEntity deviceRequest = modelMapper.map(DeviceDto, DeviceEntity.class);

		DeviceEntity device = idevice.updateDevice(id, deviceRequest);

		// entity to DTO
		DeviceDto deviceResponse = modelMapper.map(device, DeviceDto.class);

		return ResponseEntity.ok().body(deviceResponse);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteDevice(@PathVariable(name = "id") int id) {
		idevice.deleteDevice(id);
		//ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "zone deleted successfully", HttpStatus.OK);
		return new ResponseEntity<Boolean>(Boolean.TRUE, HttpStatus.OK);
	}
}