package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Address;
import com.example.demo.entity.Person;

@RestController
@RequestMapping("api/v1/data")
public class PersonController {

	@PostMapping
	public Person getPersonInfo(@RequestBody Person personRequest)
	{
		System.out.println(personRequest);
		Address address = new Address();
		address.setId(personRequest.getAddress().getId());
		address.setCity(personRequest.getAddress().getCity());
		address.setEmail(personRequest.getAddress().getEmail());
		address.setZipCode(personRequest.getAddress().getZipCode());
		address.setPhone(personRequest.getAddress().getPhone());
		
		
		Person person = new Person();
		person.setId(personRequest.getId());
		person.setFname(personRequest.getFname());
		person.setLname(personRequest.getLname());
		person.setGender(personRequest.getGender());
		person.setAddress(address);
		
		
		 return person;
	}
}
