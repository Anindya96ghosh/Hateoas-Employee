package com.rest.hteoas.practice.service;

import java.util.Set;

import com.rest.hteoas.practice.dao.DaoImpl;
import com.rest.hteoas.practice.pojo.Employee;


public class ServiceImpl implements Service {
	DaoImpl dao= new DaoImpl();
	
	@Override
	
	public void addNewEmployee(Employee emp) {
		
		dao.addNewEmployee(emp);
	}

	@Override
	public Set<Employee> viewAllEmployee() {

		return dao.viewAllEmployee();
	}

	@Override
	public void deleteEmployee(int empId) {
		
		dao.deleteEmployee(empId);
		
	}

	public void updateEmployee(Employee emp) {
		dao.updateEmployee(emp);
	}

	public Employee searchEmployee(String empName) {
		
		return dao.searchEmployee(empName);
	}

}
