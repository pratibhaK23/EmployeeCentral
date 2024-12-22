package com.pkslearning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pkslearning.dao.EmployeeDao;
import com.pkslearning.entity.Employee;

@Service
public class EmployeeServiceImpl {

	@Autowired
	private EmployeeDao employeeDao;
	
	
	public List<Employee> getEmployeesList()
	{
		
	}
	public Employee getEmployee()
	{
		
	}
	public String addEmployee(Employee newemployee)
	{
		
	}
	public Employee updateEmployee()
	{
		
	}
	public String removeEmployee()
	{
		
	}
}
