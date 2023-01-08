package com.accent.ProjectBackEnd.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "phase", schema = "tricity", catalog = "")
public class PhaseEntity {
    private int id;
    private String color;
    private String name;
    private int fixedSign;
    private byte isFictif;
    private String formule;
    private DeviceEntity device;
    private Set<GroupsEntity> groupses;
        
    //TO-DO
   /*  private Integer confId;
    
     ;*/
    

	public PhaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public PhaseEntity(int id, String color, String name, int fixedSign, byte isFictif, String formule,
			DeviceEntity device, Set<GroupsEntity> groupses) {
		super();
		this.id = id;
		this.color = color;
		this.name = name;
		this.fixedSign = fixedSign;
		this.isFictif = isFictif;
		this.formule = formule;
		this.device = device;
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
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    @Column(name = "fixed_sign")
    public int getFixedSign() {
        return fixedSign;
    }

    public void setFixedSign(int fixedSign) {
        this.fixedSign = fixedSign;
    }

    @Basic
    @Column(name = "is_fictif")
    public byte getIsFictif() {
        return isFictif;
    }

    public void setIsFictif(byte isFictif) {
        this.isFictif = isFictif;
    }

    @Basic
    @Column(name = "formule")
    public String getFormule() {
        return formule;
    }

    public void setFormule(String formule) {
        this.formule = formule;
    }


/*
     @Basic
    @Column(name = "conf_id")
    public Integer getConfId() {
        return confId;
    }

    public void setConfId(Integer confId) {
        this.confId = confId;
    }
    */
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="device_id", nullable=false)
    public DeviceEntity getDevice() {
        return this.device;
    }
    
    public void setDevice(DeviceEntity device) {
        this.device = device;
    }


	@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="groups_phase", catalog="tricity", joinColumns = { 
        @JoinColumn(name="phase_id", nullable=false, updatable=false) }, 
    inverseJoinColumns = { 
        @JoinColumn(name="groups_id", nullable=false, updatable=false) 
    })
    public Set<GroupsEntity> getGroupses() {
        return this.groupses;
    }
    
    public void setGroupses(Set<GroupsEntity> groupses) {
        this.groupses = groupses;
    }
 
    

}
