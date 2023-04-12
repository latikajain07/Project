package com.spring.portal.state.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.portal.state.entity.Country_Entity;

@Repository
public interface MyCountryRepo extends JpaRepository<Country_Entity, Integer>
    {
                 
    }
