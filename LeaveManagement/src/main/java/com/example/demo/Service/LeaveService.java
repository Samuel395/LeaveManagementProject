package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Leaves;
import com.example.demo.Repository.LeaveRepository;
import com.example.demo.Security.UserCreationParameters;

@Service
public class LeaveService {
	
	@Autowired
	LeaveRepository repo;
	
	@Autowired
	UserCreationParameters userparam;
	
	@Autowired
	LeaveTypeService leaveTypeservice;
	
	public String generateEntryId() {
		return userparam.IdGenerator();
	}

	public void createLeave(Leaves leaves) {
		leaves.setLeaveentryId(generateEntryId());
		repo.save(leaves);
		leaveTypeservice.upateLeaveType(leaves);
		
	}
	
	
}
