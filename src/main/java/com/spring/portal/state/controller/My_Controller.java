package com.spring.portal.state.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.portal.state.entity.Country_Entity;
import com.spring.portal.state.entity.State_Enitity;
import com.spring.portal.state.service.My_Service;

@CrossOrigin("http://localhost:4200")
@RestController
public class My_Controller  {
    
	@Autowired
	private My_Service my_Service; 
	
//	Student student = new Student();
	
	@GetMapping("/getcountrydata")
	public List<Country_Entity> getdata()
	{
	List<Country_Entity> country= my_Service.getdata();
		return country ;
	}
	
	@GetMapping("/getcountrydata/{id}")
	public Optional<Country_Entity> getdatabyid(@PathVariable("id") int id)
	{
	Optional<Country_Entity> country= my_Service.getdatabyid(id);
		return country ;
	}
	
	@PostMapping("/savealldata")
	public void savedata(@RequestBody Country_Entity country)
	{	
		my_Service.savedata(country);
	    
	}
	  
	@DeleteMapping("/deletecountrydata/{id}")
	  public void deletedata(@PathVariable ("id") int id)
	  {
		  my_Service.deletedata(id);
	  }
	
	@PutMapping("/update/{id}")
	public Country_Entity updateemployee(@PathVariable("id") int id , @RequestBody Country_Entity country)
	{
		Country_Entity country1= my_Service.updatedata(id, country);
		 
		 return country1 ;
		
	}
	 
	@GetMapping("/getstatedata")
	public List<State_Enitity> getstatedata()
	{
	List<State_Enitity> state= my_Service.getstatedata();
		return state ;
	}
	  @GetMapping("/getstatedatabyid/{id}")
	  public Optional<State_Enitity> getstatedatabyid(@PathVariable("id")int id)
	  {
	    Optional<State_Enitity> state= my_Service.getstatedatabyid(id);
		return state ;
	  } 
	
    }
