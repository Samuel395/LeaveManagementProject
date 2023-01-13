package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Projects;

public interface ProjectRepository extends JpaRepository<Projects,String>{

}
