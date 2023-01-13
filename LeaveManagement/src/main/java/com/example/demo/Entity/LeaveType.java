package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "leaveType")
public class LeaveType {

	@Id
	private String LeaveTypeentryId;

	@Column
	private String empId;

	@Column(columnDefinition = "varchar(255) default '0'")
	private int casual;

	@Column(columnDefinition = "varchar(255) default '0'")
	private int sick;

	@Column(columnDefinition = "varchar(255) default '0'")
	private int earned;

	@Column(columnDefinition = "varchar(255) default '0'")
	private int flexi;


	public String getLeaveTypeentryId() {
		return LeaveTypeentryId;
	}

	public void setLeaveTypeentryId(String leaveTypeentryId) {
		LeaveTypeentryId = leaveTypeentryId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public int getCasual() {
		return casual;
	}

	public void setCasual(int casual) {
		this.casual = casual;
	}

	public int getSick() {
		return sick;
	}

	public void setSick(int sick) {
		this.sick = sick;
	}

	public int getEarned() {
		return earned;
	}

	public void setEarned(int earned) {
		this.earned = earned;
	}

	public int getFlexi() {
		return flexi;
	}

	public void setFlexi(int flexi) {
		this.flexi = flexi;
	}

	public LeaveType(String leaveTypeentryId, String empId, int casual, int sick, int earned, int flexi) {
		super();
		LeaveTypeentryId = leaveTypeentryId;
		this.empId = empId;
		this.casual = casual;
		this.sick = sick;
		this.earned = earned;
		this.flexi = flexi;
	}

	public LeaveType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LeaveType [LeaveTypeentryId=" + LeaveTypeentryId + ", empId=" + empId + ", casual=" + casual + ", sick="
				+ sick + ", earned=" + earned + ", flexi=" + flexi + "]";
	}
	
	

}