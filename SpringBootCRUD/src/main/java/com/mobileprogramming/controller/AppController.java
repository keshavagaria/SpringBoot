package com.mobileprogramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileprogramming.model.Employee;
import com.mobileprogramming.service.EmployeeService;

@RestController
public class AppController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmp();
	}
	
	@RequestMapping("/employees/{id}")
	public Employee getEmployee( @PathVariable Integer id)
	{
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmp(@RequestBody Employee employee)
	{
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/employees/{id}")
	public void updateEmp(@RequestBody Employee employee, @PathVariable Integer id)
	{
		employeeService.updateEmployee(id, employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/employees/{id}")
	public void deleteEmp(@PathVariable Integer id)
	{
		employeeService.deleteEmployee(id);
	}
}
