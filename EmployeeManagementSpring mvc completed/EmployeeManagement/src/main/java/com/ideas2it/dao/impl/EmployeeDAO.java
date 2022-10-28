package com.ideas2it.dao.impl;

import com.ideas2it.dao.EmployeeDAOInterface;
import com.ideas2it.database.DataBaseConnection;
import com.ideas2it.exception.EmployeeException;
import com.ideas2it.model.Employee;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * To Store Trainer and trainee details
 *
 */
@Component
public class EmployeeDAO implements EmployeeDAOInterface {
	Session session = null;
	SessionFactory sessionFactory = DataBaseConnection.getSessionFactory();

	/**
	 * {@inheritDoc}
	 */
	public Integer insertTrainer(Trainer trainer) throws EmployeeException {
		Integer trainerId = null;

		try {
			session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			trainerId = (Integer) session.save(trainer);
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
		return trainerId;

	}

	/**
	 * {@inheritDoc}
	 */
	public Integer insertTrainee(Trainee trainee) throws EmployeeException {
		Integer traineeId = null;
		try {
			session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			traineeId = (Integer) session.save(trainee);
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
		return traineeId;

	}

	/**
	 * {@inheritDoc}
	 */
	public List<Trainer> retrieveAllTrainers() throws EmployeeException {
		List<Trainer> trainers = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			trainers = (List)session.createQuery("From Trainer").list();
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
		return trainers;
	}

	/**
	 * {@inheritDoc}
	 */
	public List<Trainee> retrieveAllTrainees() throws EmployeeException {
		List<Trainee> trainees = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			Query query =  session.createQuery("From Trainee");
			trainees = (List) query.getResultList();
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
//		} finally {
//			session.close();
		}
		return trainees;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer deleteById(Integer id) throws EmployeeException {
		Integer employeeId = 0;
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			employeeId = employee.getId();
			session.delete(employee);
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
        return employeeId;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer updateEmployee(Employee employee) throws EmployeeException {
		Integer updationStatus = 0;
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			session.update(employee);
			updationStatus = employee.getId();
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
		return updationStatus;
	}

	public Integer updateTrainer(Trainer trainer) throws EmployeeException {
		Integer updationStatus = 0;
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(trainer);
			updationStatus = trainer.getId();
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
		return updationStatus;
	}

	/**
	 * {@inheritDoc}
	 */
	public Employee getEmployeeById(Integer id) throws EmployeeException {
		Employee employee = null;
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction transaction = session.beginTransaction();
			employee = session.get(Employee.class, id);
			transaction.commit();
		} catch (HibernateException exception) {
			throw new EmployeeException(exception.getMessage());
		}
		return employee;
	}
}
