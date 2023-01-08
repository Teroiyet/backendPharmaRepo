package com.accent.ProjectBackEnd.dto;

import java.util.Set;

public class DeviceDto {
    private Integer id;
    private int nbPhase;
    private byte enabled;
    private int lastId;
    private int tenantId;
    private String protocol;
    private String type;
    private String pool;
    private Byte isFictif;
    private String name;
    private int period;
	private Set<PhaseDto> phases;
	private int installationId;
    
	public DeviceDto() {
		super();
		// TODO Auto-generated constructor stub
	}







	public DeviceDto(Integer id, int nbPhase, byte enabled, int lastId, int tenantId, String protocol, String type,
			String pool, Byte isFictif, String name, int period, Set<PhaseDto> phases, int installationId) {
		super();
		this.id = id;
		this.nbPhase = nbPhase;
		this.enabled = enabled;
		this.lastId = lastId;
		this.tenantId = tenantId;
		this.protocol = protocol;
		this.type = type;
		this.pool = pool;
		this.isFictif = isFictif;
		this.name = name;
		this.period = period;
		this.phases = phases;
		this.installationId = installationId;
	}







	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNbPhase() {
		return nbPhase;
	}

	public void setNbPhase(int nbPhase) {
		this.nbPhase = nbPhase;
	}

	public byte getEnabled() {
		return enabled;
	}

	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}

	public int getLastId() {
		return lastId;
	}

	public void setLastId(int lastId) {
		this.lastId = lastId;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPool() {
		return pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	public Byte getIsFictif() {
		return isFictif;
	}

	public void setIsFictif(Byte isFictif) {
		this.isFictif = isFictif;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}



	public Set<PhaseDto> getPhases() {
		return phases;
	}







	public void setPhases(Set<PhaseDto> phases) {
		this.phases = phases;
	}







	public int getInstallationId() {
		return installationId;
	}


	public void setInstallationId(int installationId) {
		this.installationId = installationId;
	}
    
	
    
}
