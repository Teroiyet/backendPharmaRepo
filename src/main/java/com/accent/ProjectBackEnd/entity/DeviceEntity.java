package com.accent.ProjectBackEnd.entity;


import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "device", schema = "tricity", catalog = "")
public class DeviceEntity implements Serializable{
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
    private String period;
    private InstallationEntity installation;
    private Set<PhaseEntity> phases;
    
    //TO-DO
    /*
 
     */
    
    public DeviceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public DeviceEntity(Integer id, int nbPhase, byte enabled, int lastId, int tenantId, String protocol, String type,
			String pool, Byte isFictif, String name, String period, InstallationEntity installation,
			Set<PhaseEntity> phases) {
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
		this.installation = installation;
		this.phases = phases;
	}







	@Id
    @Column(name = "id")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

    @Basic
    @Column(name = "nb_phase")
	public int getNbPhase() {
		return nbPhase;
	}
	public void setNbPhase(int nbPhase) {
		this.nbPhase = nbPhase;
	}
	
    @Basic
    @Column(name = "enabled")
	public byte getEnabled() {
		return enabled;
	}
	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}
	
    @Basic
    @Column(name = "last_id")
	public int getLastId() {
		return lastId;
	}
	public void setLastId(int lastId) {
		this.lastId = lastId;
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
    @Column(name = "protocol")
	public String getProtocol() {
		return protocol;
	}
	public void setProtocol(String protocol) {
		this.protocol = protocol;
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
    @Column(name = "pool")
	public String getPool() {
		return pool;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	
    @Basic
    @Column(name = "is_fictif")
	public Byte getIsFictif() {
		return isFictif;
	}
	public void setIsFictif(Byte isFictif) {
		this.isFictif = isFictif;
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
    @Column(name = "period")
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="installation_id", nullable=false)
    @JsonIgnore
    public InstallationEntity getInstallation() {
        return this.installation;
    }

    
    public void setInstallation(InstallationEntity installation) {
        this.installation = installation;
    }
    
   @OneToMany(fetch=FetchType.LAZY, mappedBy="device")
    public Set<PhaseEntity> getPhases() {
        return this.phases;
    }
    
    public void setPhases(Set<PhaseEntity> phases) {
        this.phases = phases;
    }
}