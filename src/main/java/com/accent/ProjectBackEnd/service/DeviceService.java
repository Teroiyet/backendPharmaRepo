package com.accent.ProjectBackEnd.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.accent.ProjectBackEnd.entity.DeviceEntity;
import com.accent.ProjectBackEnd.repository.DeviceRepository;
import com.accent.ProjectBackEnd.service.Idevice;

@Service
public class DeviceService implements Idevice{
	
private final DeviceRepository deviceRepository;
	
	public DeviceService(DeviceRepository deviceRepository) {
		super();
		this.deviceRepository = deviceRepository;
	}

	@Override
	public List<DeviceEntity> getAllDevice() {
		List<DeviceEntity>	x  = deviceRepository.findAll();
		System.out.print(x.get(0).getName());
		return x;
	}

	@Override
	public DeviceEntity createDevice(DeviceEntity device) {
		return deviceRepository.save(device);
	}

	@Override
	public DeviceEntity updateDevice(int id, DeviceEntity deviceRequest) {
		DeviceEntity device = deviceRepository.findById(id)
				.orElseThrow();
		device.setInstallation(deviceRequest.getInstallation());
	    device.setNbPhase(deviceRequest.getNbPhase());
	    device.setEnabled(deviceRequest.getEnabled());
	    device.setLastId(deviceRequest.getLastId());
	    device.setTenantId(deviceRequest.getTenantId());
	    device.setProtocol(deviceRequest.getProtocol());
	    device.setType(deviceRequest.getType());
	    device.setPool(deviceRequest.getPool());
	    device.setIsFictif(deviceRequest.getIsFictif());
	    device.setName(deviceRequest.getName());
		device.setPeriod(deviceRequest.getPeriod());
		
		return deviceRepository.save(device);
	}

	@Override
	public void deleteDevice(int id) {
		DeviceEntity device = deviceRepository.findById(id)
				.orElseThrow();
		
		deviceRepository.delete(device);
	}

	@Override
	public DeviceEntity getDeviceById(int id) {
		DeviceEntity result = deviceRepository.findById(id).orElseThrow();
		
			return result;
		
		

	}
}
