package com.ideas2it.service;

import com.ideas2it.exception.EmployeeException;
import com.ideas2it.model.Employee;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;

import java.util.List;

public interface EmployeeServiceInterface {
	/**
	 * This method is used to add trainer Details
	 *
	 * @param Trainer
	 * @return Integer
	 */
	Integer addTrainer(Trainer trainer) throws EmployeeException;
	
	/**
	 * This method is used to add trainee Details
	 *
	 * @param Trainee
	 * 
	 * @return Integer
	 */
	Integer addTrainee(Trainee trainee) throws EmployeeException;
	
	/**
	 * This method displays trainer Details
	 *
	 * @param
	 *
	 * @return List<Trainer>
	 */
	List<Trainer> retrieveAllTrainers() throws EmployeeException;
	
	/**
	 * This method is used to display trainee Details
	 *
	 * @param
	 *
	 * @return List<Trainee>
	 */
	List<Trainee> retrieveAllTrainees() throws EmployeeException;
	
	/**
	 * This method is used to delete the particular trainer Detail by taking
	 * employeeId as reference.
	 *
	 * @param Integer removeId
	 *
	 * @return Boolean
	 */
	Integer deleteById(Integer removeId) throws EmployeeException;
	
	/**
	 * This method is used to search the particular trainer Detail by taking Id as
	 * reference.
	 *
	 * @param Integer Id
	 * 
	 * @return Employee
	 */
	Employee getEmployeeById(Integer id) throws EmployeeException;
	
	/**
	 * This method is used to update the particular Trainer or Trainee detail by
	 * taking employee id as reference.
	 *
	 * @param Employee employee
	 *
	 * @return String
	 */
	String updateEmployee(Employee employee) throws EmployeeException;

	/**
	 * This method is used to update the particular Trainer or Trainee detail by
	 * taking employee id as reference.
	 *
	 * @param Trainer trainer
	 *
	 * @return String
	 */
	String updateTrainer(Trainer trainer) throws EmployeeException;
	
}