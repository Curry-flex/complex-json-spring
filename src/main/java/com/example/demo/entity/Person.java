package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
 
	@JsonProperty("Id")
	private int Id;
	private String fname;
	private String lname;
	private String gender;
	@JsonProperty("Address")
	private Address address;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
	
	
}
