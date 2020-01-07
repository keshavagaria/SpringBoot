package com.mobileprogramming.SpringDataJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmp()
	{
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping("/employees/{id}")
	public Optional<Employee> getEmp( @PathVariable Integer id)
	{
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmp(@RequestBody Employee employee)
	{
		employeeService.saveEmployee(employee);
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
