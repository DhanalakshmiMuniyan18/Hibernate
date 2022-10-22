package com.ideas2it.model;

import java.util.Set;

import com.ideas2it.model.Trainer;

public class Skill {
   
	private Integer skillId;
    private String skillSet;
    private Boolean skillCertification;
    private String skillProficiency;
    private Set<Trainer> trainers;

    public Skill() {}

    public Skill (String skillSet, Boolean skillCertification, String skillProficiency) {
        this.skillSet = skillSet;
        this.skillCertification = skillCertification;
        this.skillProficiency = skillProficiency;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;	
    }
    
    public Integer getSkillId() {
    	return skillId;
    }
    
    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillCertification(Boolean skillCertification) {
        this.skillCertification = skillCertification;
    }

    public Boolean getSkillCertification() {
        return skillCertification;
    }

    public void setSkillProficiency(String skillProficiency) {
        this.skillProficiency = skillProficiency;
    }

    public String getSkillProficiency() {
        return skillProficiency;
    }
    
    public void setTrainers(Set<Trainer> trainers) {
        this.trainers = trainers;	
    }
    
    public Set<Trainer> getTrainers() {
    	return trainers;
    }
    
    public String toString() {  
        return ("\nSkill                         - " +  this.skillSet
                + "\nTrainer Certified or not      - " + this.skillCertification
                + "\nSkill Proficiency             - " + this.skillProficiency);
    }
}