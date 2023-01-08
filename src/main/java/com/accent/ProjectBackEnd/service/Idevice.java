package com.accent.ProjectBackEnd.service;

import com.accent.ProjectBackEnd.entity.DeviceEntity;
import java.util.List;

public interface Idevice {
	   
		List<DeviceEntity> getAllDevice();

		DeviceEntity createDevice(DeviceEntity device);

		DeviceEntity updateDevice(int id, DeviceEntity device);

		void deleteDevice(int id);

		DeviceEntity getDeviceById(int id);
}
