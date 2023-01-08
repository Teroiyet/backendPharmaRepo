package com.accent.ProjectBackEnd.entity;
import java.util.Set;
import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Where;

@Entity
@Table(name = "zones", schema = "tricity", catalog = "")
public class ZonesEntity implements Serializable{
	private int idZone;
	private String name;
	private int tenantId;
	private String type;
	private Set<InstallationEntity> installations ;
	
	public ZonesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
   public ZonesEntity(int idZone, String name, int tenantId, String type, Set<InstallationEntity> installations) {
		this.idZone = idZone;
		this.name = name;
		this.tenantId = tenantId;
		this.type = type;
		this.installations = installations;
	}
	
	


	@Id
    @Column(name = "id_zone")
    public int getIdZone() {
        return idZone;
    }




	public void setIdZone(int idZone) {
        this.idZone = idZone;
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
    @Column(name = "tenant_id")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
    
    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	@OneToMany(fetch=FetchType.LAZY, mappedBy="zone")
    public Set<InstallationEntity> getInstallations() {
        return this.installations;
    }
    
    public void setInstallations(Set<InstallationEntity> installations) {
        this.installations = installations;
    }



    
    
    

    
}

    