package com.accent.ProjectBackEnd.dto;

import java.util.List;

public class CategoryDto {
	 	private int id;
	    private String name;
	    private String color;
	    private String icon;
	    private List<GroupsDto> Groups;
	    
		public CategoryDto() {
			super();
			// TODO Auto-generated constructor stub
		}


	

		public CategoryDto(int id, String name, String color, String icon, List<GroupsDto> groups) {
			super();
			this.id = id;
			this.name = name;
			this.color = color;
			this.icon = icon;
			Groups = groups;
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

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}




		public List<GroupsDto> getGroups() {
			return Groups;
		}




		public void setGroups(List<GroupsDto> groups) {
			Groups = groups;
		}
	    
	    
		

}
