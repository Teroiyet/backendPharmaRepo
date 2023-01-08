package com.accent.ProjectBackEnd.dto;

import java.util.List;

public class GroupsDto {
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
    private int categoryId;
    private int installationId;
    private List<PhaseDto> phases; 
    
    
	


	
	public GroupsDto(int id, int nbPhase, byte enabled, String name, String color, int tenantId, String type,
			Integer threshold, Integer thresholdDay, Integer thresholdNight, Integer thresholdWeek,
			Integer thresholdWeekDays, Integer thresholdWeekend, Integer thresholdInstCuurent, Integer x, Integer y,
			Integer z, Integer hauteur, Integer largeur, int categoryId, int installationId, List<PhaseDto> phases) {
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
		this.categoryId = categoryId;
		this.installationId = installationId;
		this.phases = phases;
	}



	public int getInstallationId() {
		return installationId;
	}



	public void setInstallationId(int installationId) {
		this.installationId = installationId;
	}



	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public GroupsDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}



	public Integer getThreshold() {
		return threshold;
	}

	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

	public Integer getThresholdDay() {
		return thresholdDay;
	}

	public void setThresholdDay(Integer thresholdDay) {
		this.thresholdDay = thresholdDay;
	}

	public Integer getThresholdNight() {
		return thresholdNight;
	}

	public void setThresholdNight(Integer thresholdNight) {
		this.thresholdNight = thresholdNight;
	}

	public Integer getThresholdWeek() {
		return thresholdWeek;
	}

	public void setThresholdWeek(Integer thresholdWeek) {
		this.thresholdWeek = thresholdWeek;
	}

	public Integer getThresholdWeekDays() {
		return thresholdWeekDays;
	}

	public void setThresholdWeekDays(Integer thresholdWeekDays) {
		this.thresholdWeekDays = thresholdWeekDays;
	}

	public Integer getThresholdWeekend() {
		return thresholdWeekend;
	}

	public void setThresholdWeekend(Integer thresholdWeekend) {
		this.thresholdWeekend = thresholdWeekend;
	}

	public Integer getThresholdInstCuurent() {
		return thresholdInstCuurent;
	}

	public void setThresholdInstCuurent(Integer thresholdInstCuurent) {
		this.thresholdInstCuurent = thresholdInstCuurent;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public Integer getZ() {
		return z;
	}

	public void setZ(Integer z) {
		this.z = z;
	}

	public Integer getHauteur() {
		return hauteur;
	}

	public void setHauteur(Integer hauteur) {
		this.hauteur = hauteur;
	}

	public Integer getLargeur() {
		return largeur;
	}

	public void setLargeur(Integer largeur) {
		this.largeur = largeur;
	}



	public List<PhaseDto> getPhases() {
		return phases;
	}



	public void setPhases(List<PhaseDto> phases) {
		this.phases = phases;
	}
    
	
	
    
}
