package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
	
	@JsonProperty("Id")
	private int Id;
	private String city;
	private String zipCode;
	private String email;
	private String phone;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Address [Id=" + Id + ", city=" + city + ", zipCode=" + zipCode + ", email=" + email + ", phone=" + phone
				+ "]";
	}
	
	
	

}
