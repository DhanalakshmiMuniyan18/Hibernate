package com.ideas2it.model;

import java.util.Set;

/**
 * Trainer class has getters and setters for trainer.
 *
 * @author Dhanalakshmi
 *
 * @version 1.0 Sep-30-2022 
 *
 */
public class Trainer extends Employee {

    private Integer trainerId;
    private Integer numberOfStudents;
    private String specialisation;
    private Set<Skill> skills;
   
    public Trainer() {}

    public Trainer(Integer id, String name, String designation, String emailId, Long phoneNumber,
                   double salary, String dateOfBirth, String bloodGroup, String dateOfJoining,
                   Integer trainerId, Integer numberOfStudents, String specialisation, Set<Skill> skills) {
        
        super(id, name, designation, emailId, phoneNumber, salary, dateOfBirth, 
              bloodGroup, dateOfJoining);
        this.trainerId = trainerId;
        this.numberOfStudents = numberOfStudents;
        this.specialisation = specialisation;
        this.skills = skills;
    }

    public void setTrainerId (Integer trainerId) {
        this.trainerId = trainerId;
    }
    public Integer getTrainerId () {
        return trainerId;
    }
    public void setNumberOfStudents(Integer numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Integer getNumberOfStudents() {
        return numberOfStudents;
    }    

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Set<Skill> getSkills() {
        return skills;
    }
    
    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public String getSpecialisation() {
        return specialisation;
    }



    public String toString() { 
        return (super.toString() + "\nTotal number of students      - " + this.numberOfStudents + 
                "\nTrainer Specialized           - " + this.specialisation + this.skills
                );
    }

}

