package com.rest.hteoas.practice.pojo;

import org.springframework.hateoas.ResourceSupport;

public class Employee extends ResourceSupport {
	
	

	private String empName;
	private int empId;
	private double empSalary;
	

	
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setEmpID(int empId) {
		this.empId = empId;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}

	}
