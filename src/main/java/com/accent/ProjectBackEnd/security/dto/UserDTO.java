package com.accent.ProjectBackEnd.security.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.accent.ProjectBackEnd.security.entity.*;

public class UserDTO {
	
	private Integer id;

	@Size(min = 4, max = 255, message = "Minimum login length: 4 characters")
	@NotNull(message = "username must not be null")
	private String username;
	private String password;
	private String rawPassword;
	
	private String email;

	private String avatar;

	@Size(min = 4, max=40, message = "Minimum full name length: 4 characters & Maximum 50 characters")
	@NotNull(message = "full name must not be null")
	private String fullName;

	private String phone;

	private String fixe;

	private String address;

	private boolean root;

	//List<Role> roles;

	private String theme;
	
	private String token;
	
	private boolean enable;
	
//	private List<Integer> installationIds;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/*public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}*/

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFixe() {
		return fixe;
	}

	public void setFixe(String fixe) {
		this.fixe = fixe;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRawPassword() {
		return rawPassword;
	}

	public void setRawPassword(String rawPassword) {
		this.rawPassword = rawPassword;
	}

	

	public UserDTO(Integer id,
			@Size(min = 4, max = 255, message = "Minimum login length: 4 characters") @NotNull(message = "username must not be null") String username,
			String password, String rawPassword, String email, String avatar,
			@Size(min = 4, max = 40, message = "Minimum full name length: 4 characters & Maximum 50 characters") @NotNull(message = "full name must not be null") String fullName,
			String phone, String fixe, String address, boolean root, String theme, String token, boolean enable) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.rawPassword = rawPassword;
		this.email = email;
		this.avatar = avatar;
		this.fullName = fullName;
		this.phone = phone;
		this.fixe = fixe;
		this.address = address;
		this.root = root;
		this.theme = theme;
		this.token = token;
		this.enable = enable;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	/*public List<Integer> getInstallationIds() {
		return installationIds;
	}

	public void setInstallationIds(List<Integer> installationIds) {
		this.installationIds = installationIds;
	}*/
	
	

}
