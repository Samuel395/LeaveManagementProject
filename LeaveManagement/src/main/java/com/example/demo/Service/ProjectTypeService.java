package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LeaveType;
import com.example.demo.Entity.ProjectType;
import com.example.demo.Repository.ProjectTypeRepository;
import com.example.demo.Security.UserCreationParameters;


@Service
public class ProjectTypeService{
	
	@Autowired
	private ProjectTypeRepository repo;
	
	@Autowired
	private LeaveTypeService service;
	
	public void createPojectType(ProjectType projectType) {
		LeaveType leave_type= service.createLeaveType(projectType);
		projectType.setLeaveType(leave_type);
		repo.save(projectType);
		
	}

}
