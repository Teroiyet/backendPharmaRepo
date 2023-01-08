package com.accent.ProjectBackEnd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.entity.InstallationEntity;
import com.accent.ProjectBackEnd.repository.InstallationRepository;
import com.accent.ProjectBackEnd.service.Iinstallation;

@Service
public class InstallationService implements Iinstallation{
	
	
private final InstallationRepository installationRepository;

	
	public InstallationService(InstallationRepository installationRepository) {
		super();
		this.installationRepository= installationRepository;
	}

	@Override
	public List<InstallationEntity> getAllInstallation() {
		List<InstallationEntity>	x  = installationRepository.findAll();
		return x;
	}

	@Override
	public InstallationEntity createInstallation(InstallationEntity installation) {
		return installationRepository.save(installation);
	}

	@Override
	public InstallationEntity updateInstallation(int id, InstallationEntity installationRequest) {
		InstallationEntity installation = installationRepository.findById(id)
				.orElseThrow();
			
		installation.setName(installationRequest.getName());
		installation.setGpsLat(installationRequest.getGpsLat());
		installation.setGpsLon(installationRequest.getGpsLon());
		installation.setType(installationRequest.getType());
		installation.setTenantId(installationRequest.getTenantId());
		installation.setSurface(installationRequest.getSurface());
		installation.setColor(installationRequest.getColor());
		installation.setOutputMode(installationRequest.isOutputMode());
		
		return installationRepository.save(installation);
	}

	@Override
	public void deleteInstallation(int id) {
		InstallationEntity installation = installationRepository.findById(id)
				.orElseThrow();
		
		installationRepository.delete(installation);
	}

	@Override
	public InstallationEntity getInstallationById(int id) {
		InstallationEntity result = installationRepository.findById(id).orElseThrow();
		
			return result;
		
		

	}
}