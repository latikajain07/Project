package com.spring.portal.state.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Country_Entity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_Id;
	private String c_Name;
	private String c_Short_Name;
	
	
	@OneToMany(targetEntity = State_Enitity.class ,cascade = CascadeType.ALL)
	@JoinColumn(name="gggg")
	private List<State_Enitity> state ;
	
	public Country_Entity(int c_Id, String c_Name, String c_Short_Name) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		this.c_Short_Name = c_Short_Name;
	}


	public Country_Entity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getC_Id() {
		return c_Id;
	}


	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}


	public String getC_Name() {
		return c_Name;
	}


	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}


	public String getC_Short_Name() {
		return c_Short_Name;
	}


	public void setC_Short_Name(String c_Short_Name) {
		this.c_Short_Name = c_Short_Name;
	}


	@Override
	public String toString() {
		return "Country_Entity [c_Id=" + c_Id + ", c_Name=" + c_Name + ", c_Short_Name=" + c_Short_Name + "]";
	}


	public List<State_Enitity> getState() {
		return state;
	}


	public void setState(List<State_Enitity> state) {
		this.state = state;
	}
	
	

}
