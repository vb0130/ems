package com.example.ems.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.model.Employee;
import com.example.ems.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee emp) {
		System.out.println("Request received for creation of employee " + emp.toString());
		return employeeService.createEmployee(emp);

	}

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Employee> getAllEmployees() {
		System.out.println("Request received to get all the employees");
		return employeeService.getAllEmployees();
	}

}
