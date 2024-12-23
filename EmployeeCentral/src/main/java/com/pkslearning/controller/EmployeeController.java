package com.pkslearning.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pkslearning.entity.Employee;
import com.pkslearning.service.EmployeeService;

@RequestMapping("/api/empcentral")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getEmployeesList()
	{
		return employeeService.getEmployeesList();
	}
	
	@GetMapping("/employee/{empid}")
	public Employee getEmployee(@PathVariable("empid") long empid)
	{
		return employeeService.getEmployee(empid);
		
		
	}
	
	@PostMapping("/employee")
	public ResponseEntity<?> addEmployee(@RequestBody Employee newemployee)
	{
		try {
			employeeService.addEmployee(newemployee);
			Map<String, String> response = new HashMap<>();
			response.put("message", "Employee has been added successfully");
			return ResponseEntity.ok(response);
			
		}catch(Exception e)
		{
			Map<String, String> errorResponse =new HashMap<>();
			errorResponse.put("error", e.getMessage());
			return ResponseEntity.badRequest().body(errorResponse);
		}
		
	}
	
	@PutMapping("/updateemployee/{empid}")
	public ResponseEntity<?> updateEmployee(@PathVariable("empid") long empid, @RequestBody Employee updateemployee)
	{
		try {
			employeeService.updateEmployee(empid,updateemployee);			
			Map<String, String> response = new HashMap<>();
			response.put("message", "Employee details has been updated successfully");
			return ResponseEntity.ok(response);
			
		}catch(Exception e)
		{
			Map<String, String> errorResponse =new HashMap<>();
			errorResponse.put("error", e.getMessage());
			return ResponseEntity.badRequest().body(errorResponse);
		}
	}
	
	@DeleteMapping("/{empid}")
	public String removeEmployee(@PathVariable("empid") long empid)
	{
		return employeeService.removeEmployee(empid);
	}
	
}
