package com.accent.ProjectBackEnd.dto;

import java.util.Set;

import javax.persistence.*;

import com.accent.ProjectBackEnd.entity.ZonesEntity;

public class InstallationDto {
	private int id;
	private String name;
	private String gpsLat;
	private String gpsLon;
	private String type;
	private int tenantId;
	private Integer surface;
	private String color;
	private boolean outputMode;
	//private String nature;
	private Integer zoneId;
	private Set<DeviceDto> devices;
	private Set<GroupsDto> groupses;
	

    //TO-DO :
    /*
   
    private Set<OutputDto> outputs;*/
    
    
   

	public InstallationDto() {
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGpsLat() {
		return gpsLat;
	}

	public void setGpsLat(String gpsLat) {
		this.gpsLat = gpsLat;
	}

	public String getGpsLon() {
		return gpsLon;
	}

	public void setGpsLon(String gpsLon) {
		this.gpsLon = gpsLon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public Integer getSurface() {
		return surface;
	}

	public void setSurface(Integer surface) {
		this.surface = surface;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOutputMode() {
		return outputMode;
	}

	public void setOutputMode(boolean outputMode) {
		this.outputMode = outputMode;
	}



	/*public String getNature() {
		return nature;
	}



	public void setNature(String nature) {
		this.nature = nature;
	}
*/


	public Integer getZoneId() {
		return zoneId;
	}

	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}
	

	public Set<GroupsDto> getGroupses() {
		return groupses;
	}

	public void setGroupses(Set<GroupsDto> groupses) {
		this.groupses = groupses;
	}

	public Set<DeviceDto> getDevices() {
		return devices;
	}

	public void setDevices(Set<DeviceDto> devices) {
		this.devices = devices;
	}

	@Override
	public String toString() {
		return "InstallationDto [id=" + id + ", name=" + name + ", gpsLat=" + gpsLat + ", gpsLon=" + gpsLon + ", type="
				+ type + ", tenantId=" + tenantId + ", surface=" + surface + ", color=" + color + ", outputMode="
				+ outputMode + ", zoneId=" + zoneId + ", devices=" + devices + ", groupses=" + groupses + "]";
	}
	
	
	
}
