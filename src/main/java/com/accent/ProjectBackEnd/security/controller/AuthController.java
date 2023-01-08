package com.accent.ProjectBackEnd.security.controller;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accent.ProjectBackEnd.dto.DeviceDto;
import com.accent.ProjectBackEnd.dto.InstallationDto;
import com.accent.ProjectBackEnd.entity.InstallationEntity;
import com.accent.ProjectBackEnd.security.config.JwtUtils;
import com.accent.ProjectBackEnd.security.dto.UserDTO;
import com.accent.ProjectBackEnd.security.entity.UserEntity;
import com.accent.ProjectBackEnd.security.payload.request.LoginRequest;
import com.accent.ProjectBackEnd.security.payload.request.SignupRequest;
import com.accent.ProjectBackEnd.security.payload.response.JwtResponse;
import com.accent.ProjectBackEnd.security.payload.response.MessageResponse;
import com.accent.ProjectBackEnd.security.repository.UserRepository;
import com.accent.ProjectBackEnd.security.service.Iuser;
import com.accent.ProjectBackEnd.security.service.UserDetailsImpl;
import com.accent.ProjectBackEnd.service.Izones;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;
	
	@Autowired
	private ModelMapper modelMapper;
	
	private Iuser iuser;
	
	public AuthController(Iuser iuser) {
		super();
		this.iuser = iuser;
	}
	

	
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
	
		return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getId(),userDetails.getUsername()));
 
	}
	
	


}
