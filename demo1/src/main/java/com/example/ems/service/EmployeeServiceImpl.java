package com.example.ems.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.dao.EmployeeDao;
import com.example.ems.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public Employee createEmployee(Employee emp) {
		return employeeDao.createEmployee(emp);
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	@Override
	public Collection<Employee> getEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> getAllEmployees(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> getAllEmployeesSortedByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Employee> getAllEmployeesSortedById() {
		// TODO Auto-generated method stub
		return null;
	}

}
