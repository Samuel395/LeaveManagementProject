package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.LeaveType;
import com.example.demo.Entity.Leaves;
import com.example.demo.Entity.ProjectType;
import com.example.demo.Repository.LeaveTypeRepository;
import com.example.demo.Security.UserCreationParameters;

@Service
public class LeaveTypeService {

	@Autowired
	UserCreationParameters param;

	@Autowired
	LeaveTypeRepository leaveTypeRepo;

	public LeaveType createLeaveType(ProjectType projectType) {

		LeaveType type = new LeaveType();

		type.setLeaveTypeentryId(param.IdGenerator());

		type.setEmpId(projectType.getEmpId());

		leaveTypeRepo.save(type);

		return type;

	}

	public void upateLeaveType(Leaves leaves) {

		LeaveType type = leaveTypeRepo.findByEmpId(leaves.getEmpId());

		switch (leaves.getTypeOfLeave()) {
		case "CL":
			type.setCasual(type.getCasual() + 1);
			break;
		case "FL":
			type.setFlexi(type.getFlexi() + 1);
			break;
		case "EL":
			type.setEarned(type.getEarned() + 1);
			break;
		case "SL":
			type.setSick(type.getSick() + 1);
			break;

		}
		leaveTypeRepo.save(type);

	}

}
