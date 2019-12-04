package com.csi.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.csi.model.Employee;

@Repository
public class EmployeeDao {
	@Autowired
JdbcTemplate template;
public String sql="select * from Employee";

public List<Employee> getDetails()
{
		
		  List<Employee> list=new ArrayList();
		  List<Map<String,Object>>rows=template.queryForList(sql);
		  
		  for(Map<String,Object> row:rows) {
		  
		  Employee emp=new Employee(); 
		  emp.setId((int)row.get("id"));
		  emp.setName((String)row.get("name"));
		  emp.setAddress((String)row.get("address")); 
		  list.add(emp);
		  
		  
		  }
		  return list;
		 
	
}


public int createEmployee(Employee e){  
    String query="insert into employee values('"+e.getId()+"','"+e.getName()+"','"+e.getAddress()+"')";  
    return template.update(query);  
}  


public int updateEmployee(Employee e){  
    String query="update employee set name='"+e.getName()+"', address='"+e.getAddress()+"' where id='"+e.getId()+"' ";  
    return template.update(query);  
}  


public int deleteEmployee(Employee e){  
    String query="delete from employee where id='"+e.getId()+"' ";  
    return template.update(query);  
} 

}
