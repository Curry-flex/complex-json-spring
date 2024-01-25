package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bank;
import com.example.demo.entity.Service;
import com.example.demo.entity.ServiceProvider;
import com.example.demo.entity.Transaction;

import netscape.javascript.JSObject;

@RestController
@RequestMapping("api/v1/transactions")
public class BankContoller {
    
	@PostMapping
	public Bank getBankTransactions(@RequestBody Bank bank)
	{
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
		
	
		Transaction transaction = new Transaction();
		ServiceProvider provider = new ServiceProvider();
		
		Service service = new Service();
		service.setService_name("Electricity");
		service.setIsGoverment(1);
		
		provider.setSp_name("TANSESCO");
		provider.setSp_code("TN-8579");
		provider.setService(service);
		
		transaction.setId(1);
		transaction.setTrans_date("13-07-2022");
		transaction.setTrans_id("Txn6353");
		transaction.setTrans_type("Deposit");
		transaction.setProvider(provider);
		
		Transaction transaction2 = new Transaction();
		ServiceProvider provider2 = new ServiceProvider();
		
		Service service2 = new Service();
		service2.setService_name("Electricity");
		service2.setIsGoverment(1);
		
		provider2.setSp_name("TANSESCO");
		provider2.setSp_code("TN-8579");
		provider2.setService(service2);
		
		transaction2.setId(2);
		transaction2.setTrans_date("13-07-2022");
		transaction2.setTrans_id("Txn6353");
		transaction2.setTrans_type("Deposit");
		transaction2.setProvider(provider2);
		
		transactionList.add(transaction);
		transactionList.add(transaction2);
		
		Bank bank2= new Bank();
		bank2.setId(1);
		bank2.setBankName("PBZ");
		bank2.setBranch("Malindi");
		bank2.setLocation("Zanzibar");
		bank2.setTransactions(transactionList);
		
		return bank2;
		
	}
}
