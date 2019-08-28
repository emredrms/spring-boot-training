package com.in28minutes.junit;

public class Customer {

	
	private String name;
	private String surname;
	private String email;
	private String id;
	
	public Customer() {
		
	}
	
	public Customer(String name, String surname, String email, String id) {
		this.name = name;
		this.surname= surname;
		this.email = email;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", surname=" + surname + ", email=" + email + ", id=" + id + "]";
	}
}
