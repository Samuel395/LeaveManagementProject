package com.example.demo.Entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaves")
public class Leaves {

	@Id
	private String LeaveentryId;

	@Column
	private String empId;

	@Column
	private LocalDate date;

	@Column
	private String typeOfLeave;

	public String getLeaveentryId() {
		return LeaveentryId;
	}

	public void setLeaveentryId(String leaveentryId) {
		LeaveentryId = leaveentryId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTypeOfLeave() {
		return typeOfLeave;
	}

	public void setTypeOfLeave(String typeOfLeave) {
		this.typeOfLeave = typeOfLeave;
	}

	public Leaves() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Leaves(String leaveentryId, String empId, LocalDate date, String typeOfLeave) {
		super();
		LeaveentryId = leaveentryId;
		this.empId = empId;
		this.date = date;
		this.typeOfLeave = typeOfLeave;
	}

	@Override
	public String toString() {
		return "Leaves [LeaveentryId=" + LeaveentryId + ", empId=" + empId + ", date=" + date + ", typeOfLeave="
				+ typeOfLeave + "]";
	}
	
	


}