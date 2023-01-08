package com.accent.ProjectBackEnd.security.service;


import com.accent.ProjectBackEnd.security.entity.UserEntity;
import java.util.List;

public interface Iuser {
   
	List<UserEntity> getAllUsers();

	UserEntity createUser(UserEntity user);

	UserEntity updateUser(int id, UserEntity user);
	UserEntity activateUser(int id, UserEntity user);
	UserEntity deactivateUser(int id, UserEntity user);

	
	void deleteUser(int id);

	UserEntity getUserById(int id);
}
