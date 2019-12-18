package com.mobile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDAO empDAO=(EmployeeDAO) context.getBean("employeeDAO");
	
	Employee e=new Employee();
	e.setEmpId(104);
	e.setEmpName("Akarsh");
	e.setEmpSalary(3400.86f);
	
	Employee e2=new Employee();
	e2.setEmpId(105);
	e2.setEmpName("Amit");
	e2.setEmpSalary(9000.56f);
	
	//empDAO.saveEmployee(e);
	//empDAO.saveEmployee(e2);
	
	empDAO.getAllEmployee();

	//empDAO.getById(100);
}
}
