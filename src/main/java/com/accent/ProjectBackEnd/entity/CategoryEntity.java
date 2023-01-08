package com.accent.ProjectBackEnd.entity;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "category", schema = "tricity", catalog = "")
public class CategoryEntity implements Serializable{
    private int id;
    private String name;
    private String color;
    private String icon;
	private Set<GroupsEntity> groups ;

   
    public CategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public CategoryEntity(int id, String name, String color, String icon, Set<GroupsEntity> groups) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.icon = icon;
		this.groups = groups;
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
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @OneToMany(fetch=FetchType.LAZY, mappedBy="category")
	public Set<GroupsEntity> getGroups() {
		return groups;
	}


	public void setGroups(Set<GroupsEntity> groups) {
		this.groups = groups;
	}
    
    
}