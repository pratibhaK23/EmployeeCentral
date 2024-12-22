package com.pkslearning.service;



import java.util.List;

import com.pkslearning.entity.Employee;

public interface EmployeeService {
	public List<Employee> getEmployeesList();
	public Employee getEmployee(Long empid);
	public String addEmployee(Employee newemployee);
	public Employee updateEmployee(long empid,Employee updateemployee);
	public String removeEmployee(Long empid);
}
