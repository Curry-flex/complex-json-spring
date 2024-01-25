package com.example.demo.entity;



public class Transaction {
 // @JsonProperty("Id")
  private int Id;
  private String trans_type;
  private String trans_date;
  private String trans_id;
  private ServiceProvider provider;
  
   
//  
//	public Transaction(int id, String trans_type, String trans_date, String trans_id) {
//	super();
//	Id = id;
//	this.trans_type = trans_type;
//	this.trans_date = trans_date;
//	this.trans_id = trans_id;
//}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public String getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	
	
	
	public ServiceProvider getProvider() {
		return provider;
	}
	public void setProvider(ServiceProvider provider) {
		this.provider = provider;
	}
	@Override
	public String toString() {
		return "Transaction [Id=" + Id + ", trans_type=" + trans_type + ", trans_date=" + trans_date + ", trans_id="
				+ trans_id + "]";
	}
	
	
  
  
}
