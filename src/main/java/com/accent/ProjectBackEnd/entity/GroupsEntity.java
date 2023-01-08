package com.accent.ProjectBackEnd.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "groups1", schema = "tricity")

public class GroupsEntity implements Serializable {
    private int id;
    private int nbPhase;
    private byte enabled;
    private String name;
    private String color;
    private int tenantId;
    private String type;
    private Integer threshold;
    private Integer thresholdDay;
    private Integer thresholdNight;
    private Integer thresholdWeek;
    private Integer thresholdWeekDays;
    private Integer thresholdWeekend;
    private Integer thresholdInstCuurent;
    private Integer x;
    private Integer y;
    private Integer z;
    private Integer hauteur;
    private Integer largeur;
    private CategoryEntity category;
    private InstallationEntity installation;
    private Set<PhaseEntity> phases;
    

	public GroupsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}






	public GroupsEntity(int id, int nbPhase, byte enabled, String name, String color, int tenantId, String type,
			Integer threshold, Integer thresholdDay, Integer thresholdNight, Integer thresholdWeek,
			Integer thresholdWeekDays, Integer thresholdWeekend, Integer thresholdInstCuurent, Integer x, Integer y,
			Integer z, Integer hauteur, Integer largeur, CategoryEntity category, InstallationEntity installation,
			Set<PhaseEntity> phases) {
		super();
		this.id = id;
		this.nbPhase = nbPhase;
		this.enabled = enabled;
		this.name = name;
		this.color = color;
		this.tenantId = tenantId;
		this.type = type;
		this.threshold = threshold;
		this.thresholdDay = thresholdDay;
		this.thresholdNight = thresholdNight;
		this.thresholdWeek = thresholdWeek;
		this.thresholdWeekDays = thresholdWeekDays;
		this.thresholdWeekend = thresholdWeekend;
		this.thresholdInstCuurent = thresholdInstCuurent;
		this.x = x;
		this.y = y;
		this.z = z;
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.category = category;
		this.installation = installation;
		this.phases = phases;
	}






	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id", nullable=false)
    @JsonIgnore
	public CategoryEntity getCategory() {
		return category;
	}



	public void setCategory(CategoryEntity category) {
		this.category = category;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

 
    @Basic
    @Column(name = "threshold")
    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }
    
    @Basic
    @Column(name = "threshold_day")
    public Integer getThresholdDay() {
        return thresholdDay;
    }

    public void setThresholdDay(Integer thresholdDay) {
        this.thresholdDay = thresholdDay;
    }

    @Basic
    @Column(name = "threshold_night")
    public Integer getThresholdNight() {
        return thresholdNight;
    }

    public void setThresholdNight(Integer thresholdNight) {
        this.thresholdNight = thresholdNight;
    }

    @Basic
    @Column(name = "threshold_week")
    public Integer getThresholdWeek() {
        return thresholdWeek;
    }

    public void setThresholdWeek(Integer thresholdWeek) {
        this.thresholdWeek = thresholdWeek;
    }

    @Basic
    @Column(name = "threshold_week_days")
    public Integer getThresholdWeekDays() {
        return thresholdWeekDays;
    }

    public void setThresholdWeekDays(Integer thresholdWeekDays) {
        this.thresholdWeekDays = thresholdWeekDays;
    }

    @Basic
    @Column(name = "threshold_weekend")
    public Integer getThresholdWeekend() {
        return thresholdWeekend;
    }

    public void setThresholdWeekend(Integer thresholdWeekend) {
        this.thresholdWeekend = thresholdWeekend;
    }

    @Basic
    @Column(name = "threshold_inst_cuurent")
    public Integer getThresholdInstCuurent() {
        return thresholdInstCuurent;
    }

    public void setThresholdInstCuurent(Integer thresholdInstCuurent) {
        this.thresholdInstCuurent = thresholdInstCuurent;
    }
	
    @Basic
    @Column(name = "x")
    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    @Basic
    @Column(name = "y")
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    @Basic
    @Column(name = "z")
    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Basic
    @Column(name = "hauteur")
    public Integer getHauteur() {
        return hauteur;
    }

    public void setHauteur(Integer hauteur) {
        this.hauteur = hauteur;
    }

    @Basic
    @Column(name = "largeur")
    public Integer getLargeur() {
        return largeur;
    }

    public void setLargeur(Integer largeur) {
        this.largeur = largeur;
    }
    
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="installation_id", nullable=false)
    public InstallationEntity getInstallation() {
        return this.installation;
    }
    
    public void setInstallation(InstallationEntity installation) {
        this.installation = installation;
    }
    
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="groups_phase", catalog="tricity", joinColumns = { 
        @JoinColumn(name="groups_id", nullable=false, updatable=false) }, 
    inverseJoinColumns = { 
        @JoinColumn(name="phase_id", nullable=false, updatable=false) 
    })
    public Set<PhaseEntity> getPhases() {
        return this.phases;
    }
    
    public void setPhases(Set<PhaseEntity> phases) {
        this.phases = phases;
    }
     
}



