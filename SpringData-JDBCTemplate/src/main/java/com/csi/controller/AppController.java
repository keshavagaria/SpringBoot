package com.csi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csi.dao.EmployeeDao;
import com.csi.model.Employee;

@RestController
@RequestMapping("/api")
public class AppController {

	@Autowired
	EmployeeDao empDao;
	
	@GetMapping("/getInfo")
	public List<Employee> getEmpData()
	{
		List<Employee> empList=empDao.getDetails();
		return empList;
	}
	
	@PostMapping("/saveInfo")
	public Employee saveEmpData(@RequestBody Employee emp)
	{
		//Employee emp=new Employee();
		int result=empDao.createEmployee(emp);
		System.out.println(result);
		return emp;
	}
	
	@PutMapping("/updateInfo")
	public Employee updateEmpData(@RequestBody Employee emp)
	{
		//Employee emp=new Employee();
		int result=empDao.updateEmployee(emp);
		System.out.println(result);
		return emp;
	}
	
	@DeleteMapping("/deleteInfo")
	public Employee deleteEmpData(@RequestBody Employee emp)
	{
		//Employee emp=new Employee();
		int result=empDao.deleteEmployee(emp);
		System.out.println(result);
		return emp;
	}
}
