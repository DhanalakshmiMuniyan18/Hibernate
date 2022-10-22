package com.ideas2it.servlet;

import com.ideas2it.exception.EmployeeException;
import com.ideas2it.model.Employee;
import com.ideas2it.model.Skill;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import com.ideas2it.service.EmployeeServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.InstantiationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * EmployeeController class gets Trainer and Trainee input and displays it.
 *
 * @author Dhanalakshmi
 *
 * @version 1.0 Oct-03-2022
 *
 */

@Controller
public class EmployeeServlet {

	private EmployeeServiceInterface employeeServiceInterface;

	public EmployeeServlet(EmployeeServiceInterface employeeServiceInterface) {
		this.employeeServiceInterface = employeeServiceInterface;
	}
	private Logger log = LogManager.getLogger(EmployeeServlet.class);
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@GetMapping(value = "/Trainee")
	public ModelAndView traineeForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("trainee", new Trainee());
		modelAndView.addObject("action", "createTrainee");
		modelAndView.setViewName("Trainee");
		return modelAndView;

	}

	@RequestMapping(value = "/createTrainee",method = RequestMethod.POST)
	public String createTrainee(@ModelAttribute("trainee") Trainee trainee) {
		try {
			employeeServiceInterface.addTrainee(trainee);
		} catch (EmployeeException exception) {
			log.error(exception.getMessage());
		}
		return "redirect:/DisplayTrainee";
	}

	@GetMapping(value = "/Trainer")
	public ModelAndView TrainerForm() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("trainer", new Trainer());
		modelAndView.addObject("trainer", new Skill());
		modelAndView.addObject("action", "createTrainer");
		modelAndView.setViewName("Trainer");
		modelAndView.setViewName("/Skill");
		return modelAndView;
	}

	@RequestMapping(value = "/createTrainer")
	public ModelAndView createTrainer(@ModelAttribute("trainer") Trainer trainer) {
		ModelAndView modelAndView = new ModelAndView();
		try {
			int id = employeeServiceInterface.addTrainer(trainer);
			modelAndView.addObject("skill", new Skill());
			modelAndView.addObject("id", id);
			modelAndView.setViewName("/Skill");
		} catch (EmployeeException exception) {
			log.error(exception.getMessage());
		}
		return modelAndView;
	}

	@RequestMapping(value = "/createSkill")
	public String createSkill(@ModelAttribute("skill") Skill skill, int id) {

		try {
			Employee trainer = employeeServiceInterface.getEmployeeById(id);
			Trainer trainerSkill = new Trainer();
			String name = trainer.getName();
			String designation = trainer.getDesignation();
			String mailId = trainer.getEmailId();
			Long phoneNumber = trainer.getPhoneNumber();
			Double salary = trainer.getSalary();
			String dateOfBirth = trainer.getDateOfBirth();
			String bloodGroup = trainer.getBloodGroup();
			String dateOfJoining = trainer.getDateOfJoining();
			Integer numberOfStudents = trainerSkill.getNumberOfStudents();
			String specialisation = trainerSkill.getSpecialisation();
			Set<Skill> skills = new HashSet<Skill>();
			skills.add(skill);
			Trainer employee = new Trainer(id, name, designation, mailId, phoneNumber,
			 salary, dateOfBirth, bloodGroup, dateOfJoining,
					numberOfStudents, specialisation,  skills);
			employeeServiceInterface.addTrainer(employee);
		    }catch (EmployeeException exception) {
		          log.error(exception.getMessage());
		}
		return ("redirect:/ViewTrainer");
	}

	@GetMapping(value = "DisplayTrainer")
	public ModelAndView displayTrainer() {
		List<Trainer> trainers = null;
		ModelAndView modelAndView = null;
		try {
			trainers = employeeServiceInterface.retrieveAllTrainers();
			modelAndView = new ModelAndView("DisplayTrainer");
			modelAndView.addObject("Trainer", trainers);

		} catch (EmployeeException exception) {
			log.error(exception.getMessage());
		}
		return modelAndView;

	}

	@GetMapping(value = "/DeleteEmployee")
	public ModelAndView deleteById() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("action", "DeleteEmployee");
		return modelAndView;

	}

	@RequestMapping (value = "/DeleteEmployee",method = RequestMethod.POST)
	public String deleteEmployee(@RequestParam("id") int id) {
		String status = " ";
		try {
			Employee employee = employeeServiceInterface.getEmployeeById(id);
			if (employee != null) {
				Integer deleteId = employeeServiceInterface.deleteById(id);
				if (deleteId != null) {
					status = "redirect:/DisplayTrainee";
				}
			} else {
				status = "redirect:/DeleteEmployee";
			}

		} catch (EmployeeException exception) {
			log.error(exception.getMessage());
		}
		return status;
	}

	@GetMapping(value = "/GetEmployee")
	public ModelAndView getEmployeeById() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("action", "UpdateEmployee");
		return modelAndView;

	}
	@RequestMapping(value = "/UpdateEmployee",method = RequestMethod.POST)
	public String getEmployeeById(@RequestParam("id") int id) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(id);
		modelAndView.addObject("action", "DeleteEmployee");
		return ("redirect:/UpdateEmployee");
	}

	@RequestMapping(value = "/updateEmployeeById/{id}", method = RequestMethod.GET)
	public String updateEmployeeById(@ModelAttribute("employee") Employee employee) {
		try {
			String status = employeeServiceInterface.updateEmployee(employee);
		} catch (EmployeeException exception) {
			log.error(exception.getMessage());
		}
		return ("redirect:/DisplayTrainee");
	}


}
