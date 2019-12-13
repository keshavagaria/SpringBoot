package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.dao.EmployeeDAO;
import com.mobile.model.Employee;

@RestController
@RequestMapping("/api")
public class AppController {

	
	@Autowired
	private EmployeeDAO empDAO;
	
	//GET
	@GetMapping("/get")
	public List<Employee> getData()
	{
		List<Employee> list=empDAO.getDetails();
		return list;
	}
	@PostMapping("/create")
	public Employee createData(@RequestBody Employee emp)
	{
		int result=empDAO.createEmployee(emp);
		return emp;
	}
	
	//UPDATE
	@PutMapping("/update")
	public Employee updateData(@RequestBody Employee emp)
	{
		int result=empDAO.updateEmployee(emp);
		return emp;
	}
	//DELETE
	@DeleteMapping("/delete")
	public Employee deleteData(@RequestBody Employee emp)
	{
		int result=empDAO.deleteEmployee(emp);
		return emp;
	}
}
