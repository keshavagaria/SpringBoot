package com.mobileprogramming.SpringDataJPA;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
private EmployeeRepository employeeRepository;
	
	//Get All Employees
	public List<Employee> getAllEmployee()
	{
		List<Employee> list=new ArrayList<Employee>();
		employeeRepository.findAll().forEach(list::add);
		return list;
		
	}
	
	//Get Employee By Id
	public Optional<Employee> getEmployee(Integer id)
	{
		return employeeRepository.findById(id);
		
	}
	
	//Create
	public void saveEmployee(Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	//Update
	public void updateEmployee(Integer id,Employee employee)
	{
		employeeRepository.save(employee);
	}
	
	//Delete
	public void deleteEmployee(Integer id)
	{
		employeeRepository.deleteById(id);
	}
}
