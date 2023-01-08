package com.accent.ProjectBackEnd.service;

import com.accent.ProjectBackEnd.entity.ZonesEntity;
import java.util.List;

public interface Izones {
   
	List<ZonesEntity> getAllZones();

	ZonesEntity createZones(ZonesEntity zones);

	ZonesEntity updateZones(int idZone, ZonesEntity zones);

	void deleteZones(int idZone);

	ZonesEntity getZonesById(int idZone);
}

