package com.rest.hteoas.practice.controller;

import java.util.Set;

import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.hteoas.practice.pojo.Employee;
import com.rest.hteoas.practice.service.ServiceImpl;

@RestController("/employee")
public class Controller {

	ServiceImpl serviceImpl=new ServiceImpl();
	
	
	@RequestMapping(value="/add", method=RequestMethod.POST, consumes="application/json")
	public void addNewEmployee(@RequestBody Employee emp) {
		System.out.println(emp);
		serviceImpl.addNewEmployee(emp);
	}

	@RequestMapping(value="/view", method=RequestMethod.GET /*, produces =  MediaTypes.HAL_JSON_VALUE*/)
	public Set<Employee> viewAllEmployee() {

		return serviceImpl.viewAllEmployee();
	}
	
	@RequestMapping(value="/delete/{empId}", method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable int empId) {

		 serviceImpl.deleteEmployee(empId);
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT,  consumes="application/json")
	public void updateEmployee(@RequestBody Employee emp) {
		
		System.out.println(emp);
		 serviceImpl.updateEmployee(emp);
	}
	
	@RequestMapping(value="/{empName}", method=RequestMethod.GET/*, produces =  MediaTypes.HAL_JSON_VALUE*/)
	public Employee employeeDetails(@PathVariable String empName) {
		
		 return serviceImpl.searchEmployee(empName);
	}
	
}
