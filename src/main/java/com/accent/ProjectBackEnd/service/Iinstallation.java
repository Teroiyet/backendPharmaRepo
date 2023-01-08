package com.accent.ProjectBackEnd.service;

import java.util.List;

import com.accent.ProjectBackEnd.entity.InstallationEntity;

public interface Iinstallation {
	
	List<InstallationEntity> getAllInstallation();

	InstallationEntity createInstallation(InstallationEntity installation);

	InstallationEntity updateInstallation(int id, InstallationEntity installation);

	void deleteInstallation(int id);

	InstallationEntity getInstallationById(int id);
}
