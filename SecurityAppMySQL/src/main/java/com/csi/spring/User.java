package com.csi.spring;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
//import org.springframework.test.annotation.Commit;

@Entity
public class User {
	@Id
private long id;
private String name;
private String password;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
