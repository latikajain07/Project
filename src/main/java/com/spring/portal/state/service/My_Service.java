package com.spring.portal.state.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.spring.portal.state.entity.Country_Entity;
import com.spring.portal.state.entity.State_Enitity;
import com.spring.portal.state.repo.MyCountryRepo;
import com.spring.portal.state.repo.MyStateRepo;


@Service
//@Scope(value = "prototype")
public class My_Service {
     
	 @Autowired
     private MyCountryRepo mycountryrepo;
	 
	 @Autowired
	 private MyStateRepo mystaterepo;
	
	public List<Country_Entity> getdata()
	{
		List<Country_Entity> country =mycountryrepo.findAll();
         return country ;
        
	}
	
	 public void savedata(Country_Entity country)
	 {
		 mycountryrepo.save(country);
		 
	 }
	 
	public void deletedata(int id) {
		mycountryrepo.deleteById(id);
		
	}

	public Optional<Country_Entity> getdatabyid(int id) {
		Optional<Country_Entity> country =mycountryrepo.findById(id);
		return country;
		
	}

	public Country_Entity updatedata(int id, Country_Entity country) 
	 {
	          Country_Entity country1  = mycountryrepo.findById(id).get();
			  country1.setC_Name(country.getC_Name());
//			  country1.setC_Short_Name(country.getC_Short_Name());
	          
	          return country1 ;
		      
	 }

	

	public List<State_Enitity> getstatedata() {
		
		 List<State_Enitity> state = mystaterepo.findAll();
		
		return state;
	}

	
	public Optional<State_Enitity> getstatedatabyid(int id) {
		Optional<State_Enitity> state= mystaterepo.findById(id);
		return state;
	}
	
	
}
