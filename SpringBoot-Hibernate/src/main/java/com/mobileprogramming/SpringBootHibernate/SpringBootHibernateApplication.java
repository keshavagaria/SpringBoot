package com.mobileprogramming.SpringBootHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e=new Employee();
		e.setName("Vishal");
		e.setAddress("Delhi");
		
		session.save(e);
		t.commit();
		session.close();
		
	}

}
