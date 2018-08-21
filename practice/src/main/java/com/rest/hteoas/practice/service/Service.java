package com.rest.hteoas.practice.service;

import java.util.Set;

import com.rest.hteoas.practice.pojo.Employee;

public interface Service {

	public void addNewEmployee(Employee emp);
	public Set<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
}
