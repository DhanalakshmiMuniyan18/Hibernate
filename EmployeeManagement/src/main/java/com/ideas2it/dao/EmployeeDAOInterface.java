package com.ideas2it.dao;

import java.util.List;

import com.ideas2it.exception.EmployeeException;
import com.ideas2it.model.Employee;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;

public interface EmployeeDAOInterface { 
	/**
	 * To add trainer detail
	 *
	 * @param Trainer trainer
	 *
	 * @return Boolean
	 */
	Integer insertTrainer(Trainer trainer) throws EmployeeException;
	
	/**
	 * It adds trainee detail
	 *
	 * @param Trainee trainee
	 *
	 * @return Integer
	 */	
	Integer insertTrainee(Trainee trainee) throws EmployeeException;
	
	/**
	 * To fetch all the trainer details
	 *
	 * @param
	 *
	 * List<Trainer>
	 */	
	List<Trainer> retrieveAllTrainers() throws EmployeeException;
	
	/**
	 * It fetch all the trainee details
	 *
	 * @param
	 *
	 * @return List<Trainee>
	 */	
	List<Trainee> retrieveAllTrainees() throws EmployeeException;
	
	/**
	 * This method deletes the particular trainee or trainer by taking Id as reference
	 *
	 * @param Integer id
	 *
	 * @return Boolean
	 */	
	Integer deleteById(Integer id) throws EmployeeException;
	
	/**
	 * To update particular trainer or trainee detail by taking id as reference
	 *
	 * @param Employee employee
	 *
	 * @return Boolean
	 */
	Integer updateEmployee(Employee employee) throws EmployeeException;
	
	/**
	 * To get particular trainer or trainee detail by taking id as reference
	 *
	 * @param Integer id
	 *
	 * @return Employee
	 */
	Employee getEmployeeById(Integer id) throws EmployeeException;	
	
}