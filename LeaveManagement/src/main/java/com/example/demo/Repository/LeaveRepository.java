package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Leaves;

public interface LeaveRepository extends JpaRepository<Leaves, String>{

}
