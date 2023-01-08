package com.accent.ProjectBackEnd.entity;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/*
@Entity
@Table(name = "useralert_1", schema = "tricity", catalog = "")*/
public class UserAlertEntity /*implements Serializable */{
/*
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private DeviceEntity device;
	private GroupsEntity group;
	private PointEntity point;
	private DeviceFroidEntity deviceFroid;
	private SondeEntity sonde;
	private UserAlertType type;
	private boolean isActive;
	private String email;
	private int tenantId;
	private Set<AlertConfigurationEntity> configs = new HashSet<AlertConfigurationEntity>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "type")
	@Enumerated(EnumType.STRING)
	public UserAlertType getType() {
		return type;
	}

	public void setType(UserAlertType type) {
		this.type = type;
	}

	@Column(name = "is_active")
	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "emails")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "tenant_id")
	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(mappedBy = "userAlert", fetch = FetchType.LAZY, orphanRemoval = true, cascade = CascadeType.ALL)
	public Set<AlertConfigurationEntity> getConfigs() {
		return configs;
	}

	public void setConfigs(Set<AlertConfigurationEntity> configs) {
		this.configs = configs;
	}

	public void addConfig(AlertConfigurationEntity config) {
		configs.add(config);
		config.setUserAlert(this);
	}

	public void removeConfig(AlertConfigurationEntity config) {
		configs.remove(config);
		config.setUserAlert(null);
	}
	@ManyToOne
	@JoinColumn(name = "device_id", nullable = true)
	public DeviceEntity getDevice() {
		return device;
	}

	public void setDevice(DeviceEntity device) {
		this.device = device;
	}
	@ManyToOne
	@JoinColumn(name = "group_id", nullable = true)
	public GroupsEntity getGroup() {
		return group;
	}

	public void setGroup(GroupsEntity group) {
		this.group = group;
	}
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "point_id", nullable = true, referencedColumnName = "id"),
		@JoinColumn(name = "point_device_froid_id", nullable = true, referencedColumnName = "device_id")
	})
	public PointEntity getPoint() {
		return point;
	}

	public void setPoint(PointEntity point) {
		this.point = point;
	}
	@ManyToOne
	@JoinColumn(name = "device_froid_id", nullable = true)
	public DeviceFroidEntity getDeviceFroid() {
		return deviceFroid;
	}

	public void setDeviceFroid(DeviceFroidEntity deviceFroid) {
		this.deviceFroid = deviceFroid;
	}
	@ManyToOne
	@JoinColumn(name = "sonde_id", nullable = true)
	public SondeEntity getSonde() {
		return sonde;
	}
	
	public void setSonde(SondeEntity sonde) {
		this.sonde = sonde;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + ((deviceFroid == null) ? 0 : deviceFroid.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + id;
		result = prime * result + (isActive ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((point == null) ? 0 : point.hashCode());
		result = prime * result + ((sonde == null) ? 0 : sonde.hashCode());
		result = prime * result + tenantId;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAlertEntity other = (UserAlertEntity) obj;
		if (device == null) {
			if (other.device != null)
				return false;
		} else if (!device.equals(other.device))
			return false;
		if (deviceFroid == null) {
			if (other.deviceFroid != null)
				return false;
		} else if (!deviceFroid.equals(other.deviceFroid))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (id != other.id)
			return false;
		if (isActive != other.isActive)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (point == null) {
			if (other.point != null)
				return false;
		} else if (!point.equals(other.point))
			return false;
		if (sonde == null) {
			if (other.sonde != null)
				return false;
		} else if (!sonde.equals(other.sonde))
			return false;
		if (tenantId != other.tenantId)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
*/
}
