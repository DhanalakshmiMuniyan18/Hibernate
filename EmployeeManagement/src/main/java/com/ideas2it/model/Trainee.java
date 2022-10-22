package com.ideas2it.model;

/**
 * Trainee class has getter and setter for trainee.
 *
 * @author Dhanalakshmi
 *
 * @version 1.0 Sep-30-2022
 *
 */
public class Trainee extends Employee {

    private Integer trainingPeriod;
    private String trainingTechnology;
    private Integer trainingTestMark;
    
    public Trainee() {}

    public Trainee(Integer id, String name, String designation, String emailId, Long phoneNumber, 
                   double salary, String dateOfBirth, String bloodGroup, String dateOfJoining,
                   Integer trainingPeriod, String trainingTechnology, Integer trainingTestMark) {
                     
        super(id, name, designation, emailId, phoneNumber, salary, dateOfBirth, 
              bloodGroup, dateOfJoining);
        this.trainingPeriod = trainingPeriod;
        this.trainingTechnology = trainingTechnology;
        this.trainingTestMark = trainingTestMark;
    }
    
    public void setTrainingPeriod(Integer trainingPeriod) {
        this.trainingPeriod = trainingPeriod;
    }

    public void setTrainingTechnology(String trainingTechnology) {
        this.trainingTechnology = trainingTechnology;
    }

    public void setTrainingTestMark(Integer trainingTestMark) {
        this.trainingTestMark = trainingTestMark;
    }

    public Integer getTrainingPeriod() {
        return trainingPeriod;
    }

    public String getTrainingTechnology() {
        return trainingTechnology;
    }

    public Integer getTrainingTestMark() {
        return trainingTestMark;
    }

    public String toString() { 
        return (super.toString() + "\nTraining Period               - " + this.trainingPeriod +  
                "\nTraining Technology           - " + this.trainingTechnology  
                + "\nTraining Test Mark            - " + this.trainingTestMark);
    }

}

   
    
    