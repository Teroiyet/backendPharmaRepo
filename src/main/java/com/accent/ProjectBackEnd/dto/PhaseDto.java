package com.accent.ProjectBackEnd.dto;


public class PhaseDto {
    private int id;
    private String color;
    private String name;
    private int fixedSign;
    private byte isFictif;
    private String formule;
    private int idPhaseDevice;
    private int device_id;
    private int groupsId;
    
    
	public PhaseDto() {
		super();
		// TODO Auto-generated constructor stub
	}






	public PhaseDto(int id, String color, String name, int fixedSign, byte isFictif, String formule, int idPhaseDevice,
			int device_id, int groupsId) {
		super();
		this.id = id;
		this.color = color;
		this.name = name;
		this.fixedSign = fixedSign;
		this.isFictif = isFictif;
		this.formule = formule;
		this.idPhaseDevice = idPhaseDevice;
		this.device_id = device_id;
		this.groupsId = groupsId;
	}






	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFixedSign() {
		return fixedSign;
	}
	public void setFixedSign(int fixedSign) {
		this.fixedSign = fixedSign;
	}
	public byte getIsFictif() {
		return isFictif;
	}
	public void setIsFictif(byte isFictif) {
		this.isFictif = isFictif;
	}
	public String getFormule() {
		return formule;
	}
	public void setFormule(String formule) {
		this.formule = formule;
	}
	

	public int getDevice_id() {
		return device_id;
	}



	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}



	public int getIdPhaseDevice() {
		return idPhaseDevice;
	}



	public void setIdPhaseDevice(int idPhaseDevice) {
		this.idPhaseDevice = idPhaseDevice;
	}






	public int getGroupsId() {
		return groupsId;
	}






	public void setGroupsId(int groupsId) {
		this.groupsId = groupsId;
	}
    
    
}
