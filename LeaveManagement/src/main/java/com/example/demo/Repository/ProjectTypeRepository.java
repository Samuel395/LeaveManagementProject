package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ProjectType;

public interface ProjectTypeRepository extends JpaRepository<ProjectType, String>{

	void deleteByempId(String id);

}
