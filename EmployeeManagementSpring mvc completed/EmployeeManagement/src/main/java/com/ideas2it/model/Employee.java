package com.ideas2it.model;

/**
 * Employee class contains common details of both Trainer and Trainee.
 *
 * @author Dhanalakshmi
 *
 * @version 1.0 Sep-30-2022.
 *
 */
public class Employee {    
    private Integer id;
    private String name;
    private String designation;
    private String emailId;
    private Long phoneNumber;
    private Double salary;
    private String dateOfBirth;
    private String bloodGroup;
    private String dateOfJoining;

    public Employee() {}

    public Employee(Integer id, String name, String designation, String emailId, 
                    Long phoneNumber, Double salary, String dateOfBirth,
                    String bloodGroup, String dateOfJoining) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
        this.bloodGroup = bloodGroup;
        this.dateOfJoining = dateOfJoining;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;    
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
  
    public String getDesignation() {
        return designation;
    }

    public String getEmailId() {
        return emailId;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }


    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }


    public String toString() { 
        return("Name                          - " + this.name 
               + "\nID                            - " + this.id 
               + "\nDesignation                   - "  + this.designation 
               + "\nEmail-Id                      - " + this.emailId 
               + "\nBloodGroup                    - " + this.bloodGroup 
               + "\nPhoneNumber                   - " + this.phoneNumber);
    }

}