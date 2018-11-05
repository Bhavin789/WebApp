package com.bhavin.core.customer.model;

public class Customer{
	String name;
	int age;
	int custID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public Customer(String name, int age, int custID) {
		super();
		this.name = name;
		this.age = age;
		this.custID = custID;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	
	
}