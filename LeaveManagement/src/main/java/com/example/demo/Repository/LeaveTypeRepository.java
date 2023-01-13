package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.LeaveType;

public interface LeaveTypeRepository extends JpaRepository<LeaveType, String>{
	
   public LeaveType findByEmpId(String empId);
}
