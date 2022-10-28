package com.ideas2it.servlet;

import com.ideas2it.exception.EmployeeException;
import com.ideas2it.model.Employee;
import com.ideas2it.model.Skill;
import com.ideas2it.model.Trainee;
import com.ideas2it.model.Trainer;
import com.ideas2it.service.EmployeeServiceInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
 * @version 1.0 Oct-03-2022
 */

@Controller
public class EmployeeServlet {

    private EmployeeServiceInterface employeeServiceInterface;
    private Logger log = LogManager.getLogger(EmployeeServlet.class);

    public EmployeeServlet(EmployeeServiceInterface employeeServiceInterface) {
        this.employeeServiceInterface = employeeServiceInterface;
    }

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

    @RequestMapping(value = "/createTrainee", method = RequestMethod.POST)
    public String createTrainee(@ModelAttribute("trainee") Trainee trainee) {
        try {
            employeeServiceInterface.addTrainee(trainee);
        } catch (EmployeeException exception) {
            log.error(exception.getMessage());
        }
        return "redirect:/DisplayTrainee";
    }

    @RequestMapping(value = "/Trainer")
    public String TrainerForm(Model model) {
        model.addAttribute("trainer", new Trainer());
        return "Trainer";
    }

    @RequestMapping(value = "/createTrainer")
    public ModelAndView createTrainer(@ModelAttribute("trainer") Trainer trainer) {
        ModelAndView modelAndView = new ModelAndView();
        Integer id;
        try {
            id = employeeServiceInterface.addTrainer(trainer);
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
            Trainer trainer = (Trainer) employeeServiceInterface.getEmployeeById(id);
            Set<Skill> skills = new HashSet<Skill>();
            skills.add(skill);
            trainer.setSkills(skills);
            employeeServiceInterface.updateTrainer(trainer);
        } catch (EmployeeException exception) {
            log.error(exception.getMessage());
        }
        return "redirect:/DisplayTrainer";
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

    @GetMapping(value = "DisplayTrainee")
    public ModelAndView displayTrainee() {
        List<Trainee> trainees = null;
        ModelAndView modelAndView = null;
        try {
            trainees = employeeServiceInterface.retrieveAllTrainees();
            modelAndView = new ModelAndView("DisplayTrainee");
            modelAndView.addObject("Trainee", trainees);

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

    @RequestMapping(value = "/DeleteEmployee", method = RequestMethod.POST)
    public String deleteEmployee(@RequestParam("id") int id) {
        String status = " ";
        try {
            Employee employee = employeeServiceInterface.getEmployeeById(id);
            if (employee != null) {
                Integer deleteId = employeeServiceInterface.deleteById(id);
                status = "redirect:/DisplayTrainer";
            } else {
                status = "redirect:/DeleteEmployee";
            }
        } catch (EmployeeException exception) {
            log.error(exception.getMessage());
        }
        return status;
    }

    @GetMapping(value = "/GetEmployee")
    public ModelAndView updateById() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("action", "updateEmployee");
        return modelAndView;

    }

    @RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
    public ModelAndView updateEmployee(@RequestParam("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        try {
            Employee employee = employeeServiceInterface.getEmployeeById(id);
            modelAndView.addObject("employee", employee);
            String emp = employeeServiceInterface.updateEmployee(employee);
            modelAndView.setViewName("UpdateEmployee");
        } catch (EmployeeException exception) {
            log.error(exception.getMessage());
        }
        return modelAndView;

    }

    @RequestMapping(value = "/UpdatedEmployee", method = RequestMethod.POST)
    public String createTrainee(@ModelAttribute("employee") Employee employee) {
        Employee employee1 = new Trainer();
        Trainer trainer = (Trainer) employee1;
        try {
            employeeServiceInterface.updateEmployee(employee);
        } catch (EmployeeException exception) {
            log.error(exception.getMessage());
        }
        return ("redirect:/DisplayTrainer");
    }

}
