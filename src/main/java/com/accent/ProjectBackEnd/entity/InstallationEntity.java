package com.accent.ProjectBackEnd.entity;

import javax.persistence.*;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.accent.ProjectBackEnd.entity.Type.InstallationType;
import java.io.Serializable;
@Entity
@Table(name = "installation", schema = "tricity", catalog = "")
public class InstallationEntity  implements Serializable  {

	private int id;
	private String name;
	private String gpsLat;
	private String gpsLon;
	private String type;
	private int tenantId;
	private Integer surface;
	private String color;
	private boolean outputMode;
	//protected String nature;

	private ZonesEntity zone;
	private Set<DeviceEntity> devices ;
	
	
	private Set<GroupsEntity> groupses;

	
	   
	// TO-DO
	/*  
	 * 	private List<UserEntity> users;
		private Set<OutputEntity> outputs; 
	 * 
	*/

	public InstallationEntity() {
		super();
	}



  

	public InstallationEntity(int id, String name, String gpsLat, String gpsLon, String type, int tenantId,
			Integer surface, String color, boolean outputMode, ZonesEntity zone,
			Set<DeviceEntity> devices, Set<GroupsEntity> groupses) {
		
		this.id = id;
		this.name = name;
		this.gpsLat = gpsLat;
		this.gpsLon = gpsLon;
		this.type = type;
		this.tenantId = tenantId;
		this.surface = surface;
		this.color = color;
		this.outputMode = outputMode;
		//this.nature = nature;
		this.zone = zone;
		this.devices = devices;
		this.groupses = groupses;
	}





	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "gps_lat")
	public String getGpsLat() {
		return gpsLat;
	}

	public void setGpsLat(String gpsLat) {
		this.gpsLat = gpsLat;
	}

	@Basic
	@Column(name = "gps_lon")
	public String getGpsLon() {
		return gpsLon;
	}

	public void setGpsLon(String gpsLon) {
		this.gpsLon = gpsLon;
	}

	@Basic
	@Column(name = "type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Basic
	@Column(name = "tenant_id")
	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	@Basic
	@Column(name = "surface")
	public Integer getSurface() {
		return surface;
	}

	public void setSurface(Integer surface) {
		this.surface = surface;
	}

	@Basic
	@Column(name = "color")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Column(name = "outputs_auto_mode")
	public boolean isOutputMode() {
		return outputMode;
	}

	public void setOutputMode(boolean outputMode) {
		this.outputMode = outputMode;
	}


	
	/*@Column(name = "nature")
	public String getNature() {
		return nature;
	}



	public void setNature(String nature) {
		this.nature = nature;
	}*/
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="zone_id", nullable=false)
  	public ZonesEntity getZone() {
        return this.zone;
    }
    
    public void setZone(ZonesEntity zone) {
        this.zone = zone;
    }
    
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="installation")
    public Set<DeviceEntity> getDevices() {
        return this.devices;
    }
    
    public void setDevices(Set<DeviceEntity> devices) {
        this.devices = devices;
    }
    
 
    @OneToMany(fetch=FetchType.LAZY, mappedBy="installation")
    public Set<GroupsEntity> getGroupses() {
        return this.groupses;
    }
    
    public void setGroupses(Set<GroupsEntity> groupses) {
        this.groupses = groupses;
    }





	@Override
	public String toString() {
		return "InstallationEntity [id=" + id + ", name=" + name + ", gpsLat=" + gpsLat + ", gpsLon=" + gpsLon
				+ ", type=" + type + ", tenantId=" + tenantId + ", surface=" + surface + ", color=" + color
				+ ", outputMode=" + outputMode + ", zone=" + zone + ", devices=" + devices + ", groupses=" + groupses
				+ "]";
	}
    
	

	/*// if the type of nature is InstallationType
    @Basic
	@Enumerated(EnumType.STRING)
    @Column(name = "nature", insertable = false, updatable = false)
    public InstallationType getNature() {
		return nature;
	}
    
    public void setNature(InstallationType nature) {
		this.nature = nature;
	}*/
	
 

}
