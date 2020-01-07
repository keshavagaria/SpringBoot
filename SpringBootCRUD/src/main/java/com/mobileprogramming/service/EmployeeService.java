package com.mobileprogramming.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mobileprogramming.model.Employee;

@Service
public class EmployeeService {

   List<Employee> list=new ArrayList<>(Arrays.asList(
			new Employee(101,"Vishal","Delhi"),
			new Employee(102,"Vishu","Delhi"),
			new Employee(103,"Raghav","Punjab"),
			new Employee(104,"Amit","Karnal"),
			new Employee(105,"Rahul","Mathura")
			));
	
	public List<Employee> getAllEmp()
	{
		return list;
	}
	
	public Employee getEmployee(Integer id)
	{
		return list.stream().filter(e->e.getId()==(id)).findFirst().get();
		
	}
	
	public void addEmployee(Employee employee)
	{
		list.add(employee);
	}

	public void updateEmployee(Integer id, Employee employee)
	{
		for(int i=0;i<list.size();i++)
		{
			Employee emp=list.get(i);
			if(emp.getId()==(id))
			{
				list.set(i, employee);
				return;
			}
		}
	}
	
	public void deleteEmployee(Integer id)
	{
		list.removeIf(e->e.getId()==(id));
	}
}
