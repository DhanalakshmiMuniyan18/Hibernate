package com.ideas2it.service.impl;

import com.ideas2it.dao.EmployeeDAOInterface;
import com.ideas2it.exception.EmployeeException;
import com.ideas2it.model.Employee;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import com.ideas2it.service.EmployeeServiceInterface;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.regex.Pattern;

/**
 * EmployeeService class acts like intermediate collects details from
 * EmployeeController and pass it to EmployeeDAO
 *
 * @author Dhanalakshmi
 *
 * @version 1.0 Oct-16-2022
 *
 */
@Component
@Service
public class EmployeeService implements EmployeeServiceInterface {

	private EmployeeDAOInterface employeeDao;

	public EmployeeService(EmployeeDAOInterface employeeDao) {
		this.employeeDao = employeeDao;

	}
	/**
	 * {@inheritDoc}
	 */
	public Integer addTrainer(Trainer trainer) throws EmployeeException {
		Integer trainerId = employeeDao.insertTrainer(trainer);
		return trainerId;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer addTrainee(Trainee trainee) throws EmployeeException {
		Integer traineeId = employeeDao.insertTrainee(trainee);
		return traineeId;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Trainer> retrieveAllTrainers() throws EmployeeException {
		List<Trainer> trainers = employeeDao.retrieveAllTrainers();
		return trainers;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Trainee> retrieveAllTrainees() throws EmployeeException {
		List<Trainee> trainees = employeeDao.retrieveAllTrainees();
		System.out.println(trainees);
		return trainees;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer deleteById(Integer removeId) throws EmployeeException {
		Integer isDeleted = employeeDao.deleteById(removeId);
		return isDeleted;

	}

	/**
	 * {@inheritDoc}
	 */
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		Employee trainer = employeeDao.getEmployeeById(id);
		return trainer;
	}

	/**
	 * {@inheritDoc}
	 */
	public String updateEmployee(Employee employee) throws EmployeeException {
		String updatedComment;

		Integer isUpdated = employeeDao.updateEmployee(employee);
		if (isUpdated != 0) {
			updatedComment = "Updated successfully";
		} else {
			updatedComment = "Not updated";
		}
		return updatedComment;
	}
	
	/**
	 * calculates the age and experience
	 *
	 * @param {String }date
	 *
	 * @return Integer
	 *
	 */
	public Integer calculateYears(Date date) {
		LocalDate currentDate = LocalDate.now();
		LocalDate newDate = date.toLocalDate();
		return Period.between(newDate, currentDate).getYears();
	}

	/**
	 * It validates a emailId
	 *
	 * @param {String} date
	 *
	 * @return Boolean
	 *
	 */
	public Boolean emailId(String emailId) {
		boolean result = false;
		result = Pattern.matches("^([a-zA-Z])([\\w]{2,50})([\\.||\\_])?([\\w])*([\\@])" 
		                         + "([\\w]){2,10}([\\.]){1}([a-zA-Z]){0,5}+$", emailId);
		return result;
	}

	/**
	 * To validate a phoneNumber
	 *
	 * @param{String} phoneNumber
	 *
	 * @return Boolean
	 *
	 */
	public Boolean phoneNumber(String phoneNumber) {
		Boolean result = false;
		if ((phoneNumber.length() == 10) && ((phoneNumber.charAt(0) >= 54) && 
			(phoneNumber.charAt(0) <= 57))) {
			for (int index = 1; index < 10; index++) {
				if ((phoneNumber.charAt(index) >= 48) && (phoneNumber.charAt(index) <= 57)) {
					result = true;
				}
			}

		}
		return result;

	}

}