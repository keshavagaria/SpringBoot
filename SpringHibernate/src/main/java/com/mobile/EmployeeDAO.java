package com.mobile;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployeeDAO {
	
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Transaction transaction=session.beginTransaction();

public void addDetails(int id,String empName,String empAddress) {
	
	Employee e=new Employee();
	e.setId(id);
	e.setName(empName);
	e.setAddress(empAddress);
	
	session.save(e);
	transaction.commit();
	session.close();
}
	
	
}
