package com.example.demo.Controller;

import java.time.LocalDate;

public class DateClass {

	private String empid;

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	private LocalDate datevalue;

	public LocalDate getDatevalue() {
		return datevalue;
	}

	public void setDatevalue(LocalDate datevalue) {
		this.datevalue = datevalue;
	}

	public DateClass(LocalDate datevalue) {
		super();
		this.datevalue = datevalue;
	}

	@Override
	public String toString() {
		return "DateClass [empid=" + empid + ", datevalue=" + datevalue + "]";
	}

}
