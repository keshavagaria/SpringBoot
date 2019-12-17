package com.mobile;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



import com.oracle.webservices.internal.api.EnvelopeStyle;

@Entity
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int id;
	@Column(name="Employee_Name")
	private String name;
	@Column(name="Employee_Address")
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
