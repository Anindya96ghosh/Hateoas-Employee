package com.rest.hteoas.practice.dao;

import java.util.Set;

import com.rest.hteoas.practice.pojo.Employee;

public interface Dao {

	public void addNewEmployee(Employee emp);
	public Set<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
}
