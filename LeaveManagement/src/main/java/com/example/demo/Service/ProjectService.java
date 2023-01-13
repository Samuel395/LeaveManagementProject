package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Projects;
import com.example.demo.Repository.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
    ProjectRepository projectRepo; 
	
	
    public List<String> getAllProjects() {
    	List<Projects> projectList = projectRepo.findAll();
    	List<String> projects = new ArrayList<String>();
    	for(Projects project: projectList) {
    		projects.add(project.getId());
    	}
    	return projects;
    	
    }

}
