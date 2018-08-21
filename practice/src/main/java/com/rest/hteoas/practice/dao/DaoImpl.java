package com.rest.hteoas.practice.dao;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;

import com.rest.hteoas.practice.controller.Controller;
import com.rest.hteoas.practice.pojo.Employee;

public class DaoImpl implements Dao {

	Set<Employee> set = new LinkedHashSet<>();

	@Override
	public void addNewEmployee(Employee emp) {

		Link link = ControllerLinkBuilder.linkTo(Controller.class)
				.slash(emp.getEmpName()).withSelfRel();
		
		Link deleteLink = ControllerLinkBuilder.linkTo(Controller.class)
				.slash("delete").slash(emp.getEmpId()).withSelfRel();
		
		emp.add(link, deleteLink);
		set.add(emp);
	}

	@Override
	public Set<Employee> viewAllEmployee() {

		return set;
	}

	@Override
	public void deleteEmployee(int empId) {

		for (Employee emp : set) {
			if (emp.getEmpId() == empId) {
				System.out.println("employee Id " + empId);
				set.remove(emp);
				break;
			}
		}

	}

	public void updateEmployee(Employee emp) {

		for (Employee employee : set) {
			if (emp.getEmpId() == employee.getEmpId()) {
				set.remove(employee);
				set.add(emp);
			}
		}
	}

	public Employee searchEmployee(String empName) {
		for (Employee employee : set) {
			if (employee.getEmpName().equals(empName)) {
				employee.removeLinks();
				return employee;
			}
		}
		return null;
	}

}
