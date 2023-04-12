package com.spring.portal.state.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.portal.state.entity.State_Enitity;

public interface MyStateRepo extends JpaRepository<State_Enitity, Integer> 
   {
          
	  
   }
