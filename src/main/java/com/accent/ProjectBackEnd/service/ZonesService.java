package com.accent.ProjectBackEnd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.entity.ZonesEntity;
import com.accent.ProjectBackEnd.repository.ZonesRepository;
import com.accent.ProjectBackEnd.service.Izones;

@Service
public class ZonesService implements Izones{
	
private final ZonesRepository zonesRepository;
	
	public ZonesService(ZonesRepository zonesRepository) {
		super();
		this.zonesRepository = zonesRepository;
	}

	@Override
	public List<ZonesEntity> getAllZones() {
		List<ZonesEntity>	x  = zonesRepository.findAll();
		System.out.print(x.get(0).getName());
		return x;
	}

	@Override
	public ZonesEntity createZones(ZonesEntity zones) {
		return zonesRepository.save(zones);
	}

	@Override
	public ZonesEntity updateZones(int idZone, ZonesEntity zonesRequest) {
		ZonesEntity zones = zonesRepository.findById(idZone)
				.orElseThrow();
		
		zones.setName(zonesRequest.getName());
		zones.setTenantId(zonesRequest.getTenantId());
		zones.setType(zonesRequest.getType());
		return zonesRepository.save(zones);
	}

	@Override
	public void deleteZones(int idZone) {
		ZonesEntity zones = zonesRepository.findById(idZone)
				.orElseThrow();
		
		zonesRepository.delete(zones);
	}

	@Override
	public ZonesEntity getZonesById(int idZone) {
		ZonesEntity result = zonesRepository.findById(idZone).orElseThrow();
		
			return result;
		
		

	}
}