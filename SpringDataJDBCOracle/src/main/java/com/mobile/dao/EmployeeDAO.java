package com.mobile.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mobile.model.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate template;
	
	
	//GEt
	public List<Employee> getDetails(){
	
		List<Employee> list=new ArrayList();
	
	   String query="select * from Employee";
	  List<Map<String,Object>> rows=template.queryForList(query);
	  
	  for(Map<String,Object> row:rows) {
	  
	  Employee emp=new Employee(); 
	  emp.setId((int)row.get("id"));
	  emp.setName((String)row.get("name"));
	  emp.setAddress((String)row.get("address")); 
	  list.add(emp);
	}
	  return list;
}
	
	//CREATE
	public int createEmployee(Employee e){  
	    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getAddress()+"')";  
	    return template.update(query);  
	}  

//UPDATE
	public int updateEmployee(Employee e){  
	    String query="update employee set name='"+e.getName()+"', address='"+e.getAddress()+"' where id='"+e.getId()+"' ";  
	    return template.update(query);  
	}  

//DELETE
	public int deleteEmployee(Employee e){  
	    String query="delete from employee where id='"+e.getId()+"' ";  
	    return template.update(query);  
}
}