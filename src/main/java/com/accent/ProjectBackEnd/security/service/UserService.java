package com.accent.ProjectBackEnd.security.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.security.entity.UserEntity;
import com.accent.ProjectBackEnd.security.repository.UserRepository;
import com.accent.ProjectBackEnd.security.service.Iuser;

@Service
public class UserService implements Iuser{
	
private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<UserEntity> getAllUsers() {
		
		List<UserEntity>	x  = userRepository.findAll();
		//System.out.print(x.get(0).getName());
		return x;
	}

	@Override
	public UserEntity createUser(UserEntity user) {
		return userRepository.save(user);
	}

	@Override
	public UserEntity updateUser(int id, UserEntity userRequest) {
		UserEntity user = userRepository.findById(id)
				.orElseThrow();
		
		user.setUsername(userRequest.getUsername());
		user.setFullName(userRequest.getFullName());
		user.setPhone(userRequest.getPhone());
		user.setFixe(userRequest.getFixe());
		user.setAddress(userRequest.getAddress());
		user.setHaveAvatar(userRequest.isHaveAvatar());
		user.setEmail(userRequest.getEmail());
		user.setPassword(userRequest.getPassword());
		user.setHaveAvatar(userRequest.isHaveAvatar());
		user.setEmail(userRequest.getEmail());
		return userRepository.save(user);
	}
	
	public UserEntity activateUser(int id, UserEntity userRequest) {
		UserEntity user = userRepository.findById(id)
				.orElseThrow();
		
		user.setEnable(true);
			return userRepository.save(user);
	}
	
	public UserEntity deactivateUser(int id, UserEntity userRequest) {
		UserEntity user = userRepository.findById(id)
				.orElseThrow();
		
		user.setEnable(false);
			return userRepository.save(user);
	}

	@Override
	public void deleteUser(int id) {
		UserEntity user = userRepository.findById(id)
				.orElseThrow();
		
		userRepository.delete(user);
	}

	@Override
	public UserEntity getUserById(int id) {
		UserEntity result = userRepository.findById(id).orElseThrow();
		
			return result;
		
		

	}
}