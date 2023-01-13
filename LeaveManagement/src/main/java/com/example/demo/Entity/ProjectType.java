package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author Samuel
 *
 */
@Entity
@Table(name = "ProjectType")


public class ProjectType {

	@Id
	private String project_entry_id;

	@Column
	private String wonNumber;

	@Column
	private String empId;

	@Column
	private String empName;

	@OneToOne
	private LeaveType leaveType;

	public String getProject_entry_id() {
		return project_entry_id;
	}

	public void setProject_entry_id(String project_entry_id) {
		this.project_entry_id = project_entry_id;
	}

	public String getWonNumber() {
		return wonNumber;
	}

	public void setWonNumber(String wonNumber) {
		this.wonNumber = wonNumber;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public LeaveType getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(LeaveType leaveType) {
		this.leaveType = leaveType;
	}

	public ProjectType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectType(String project_entry_id, String wonNumber, String empId, String empName, LeaveType leaveType) {
		super();
		this.project_entry_id = project_entry_id;
		this.wonNumber = wonNumber;
		this.empId = empId;
		this.empName = empName;
		this.leaveType = leaveType;
	}

	@Override
	public String toString() {
		return "ProjectType [project_entry_id=" + project_entry_id + ", wonNumber=" + wonNumber + ", empId=" + empId
				+ ", empName=" + empName + ", leaveType=" + leaveType + "]";
	}

	

}
