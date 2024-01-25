package com.example.demo.entity;



public class ServiceProvider {
     
	private String sp_name;
	private String sp_code;
	
	private Service service;
	
	
	public String getSp_name() {
		return sp_name;
	}
	public void setSp_name(String sp_name) {
		this.sp_name = sp_name;
	}
	public String getSp_code() {
		return sp_code;
	}
	public void setSp_code(String sp_code) {
		this.sp_code = sp_code;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	
	
}
