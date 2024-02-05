package com.Technosignia.QuikEstate.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	@Id
	Long id;
	
	String name;
	
	Long contact;
	
	String email;
	
	
	
	
	
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getContact() {
	return contact;
}
public void setContact(Long contact) {
	this.contact = contact;
}
public String getEmail () {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
