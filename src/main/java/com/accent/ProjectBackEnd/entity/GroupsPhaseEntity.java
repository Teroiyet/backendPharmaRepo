package com.accent.ProjectBackEnd.entity;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "groups_phase", schema = "tricity")
public class GroupsPhaseEntity implements Serializable {
    private int groupsId;
    private int phaseId;

    @Id
    @Column(name = "groups_id")
    public int getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(int groupsId) {
        this.groupsId = groupsId;
    }

    @Id
    @Column(name = "phase_id")
    public int getPhaseId() {
        return phaseId;
    }

    public void setPhaseId(int phaseId) {
        this.phaseId = phaseId;
    }


  
}
