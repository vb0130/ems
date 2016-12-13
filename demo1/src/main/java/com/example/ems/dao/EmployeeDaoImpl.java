package com.example.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.example.ems.common.ConnectionFactory;
import com.example.ems.constants.EMSSql;
import com.example.ems.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static Logger logger = Logger.getLogger(EmployeeDaoImpl.class);

	@Override
	public Employee createEmployee(Employee emp) {

		try {
			Connection conn = ConnectionFactory.getConnection();
			PreparedStatement ps = conn.prepareStatement(EMSSql.INSERT_EMPLOYEE);
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getSalary());
			ps.setString(3, emp.getEmpStatus());
			
			int n = ps.executeUpdate();
			logger.info("Numer of record inserted into Database : " + n);
		} catch (Exception e) {
			logger.error("Error occured while inserting the data into the employee table "+ e);
		}
		return emp;

	}

	@Override
	public Collection<Employee> getAllEmployees() {
		return null;
	}

}
