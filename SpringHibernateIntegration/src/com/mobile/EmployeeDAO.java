package com.mobile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDAO {
	

		//@Autowired
		HibernateTemplate hibernateTemplate;

		public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
			this.hibernateTemplate = hibernateTemplate;
		}
		
		
		
	/*
	 * public HibernateTemplate getHibernateTemplate() { return hibernateTemplate; }
	 */



		public void saveEmployee(Employee e)
		{
			hibernateTemplate.save(e);
		}
		
		
		public void updateEmployee(Employee e)
		{
			hibernateTemplate.update(e);
		}
		
		public void deleteEmployee(Employee e)
		{
			hibernateTemplate.delete(e);
		}
		
		public Employee getById(int id)
		{
			Employee e=(Employee)hibernateTemplate.get(Employee.class, id);
			return e;
		}
		
		public List<Employee> getAllEmployee()
		{
			List<Employee> list=new ArrayList<>();
			list=hibernateTemplate.loadAll(Employee.class);
			return list;
		}
}
