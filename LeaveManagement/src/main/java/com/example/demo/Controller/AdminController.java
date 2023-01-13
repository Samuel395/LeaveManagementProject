package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Entity.ProjectType;
import com.example.demo.Entity.Projects;
import com.example.demo.Repository.ProjectRepository;
import com.example.demo.Security.UserCreationParameters;
import com.example.demo.Service.LeaveTypeService;
import com.example.demo.Service.ProjectService;
import com.example.demo.Service.ProjectTypeService;

@RestController
@RequestMapping
public class AdminController {

	@Autowired
	ProjectTypeService projectTypeService;

	@Autowired
	LeaveTypeService leaveTypeService;

	@Autowired
	UserCreationParameters entryId;
	
	@Autowired
	ProjectService projectService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView entry() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		return mv;
	}

	@RequestMapping(value = "/add-employee", method = RequestMethod.GET)
	public ModelAndView addpage() {
		ModelAndView mv = new ModelAndView();
		System.out.println( projectService.getAllProjects());
		List<String> project = projectService.getAllProjects();
		mv.addObject("projectList", project);
		mv.setViewName("ProjectType");
		return mv;
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public ModelAndView addEmployee(ProjectType type, ModelMap model) {
		type.setProject_entry_id(entryId.IdGenerator());
		projectTypeService.createPojectType(type);
		return new ModelAndView("redirect:/add-employee",model);

	}
}
