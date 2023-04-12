package com.spring.portal.state.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class State_Enitity {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_Id;
	private String s_Name;
	private String s_Short_Name;
	
	
	
	public int getS_Id() {
		return s_Id;
	}
	public void setS_Id(int s_Id) {
		this.s_Id = s_Id;
	}
	public String getS_Name() {
		return s_Name;
	}
	public void setS_Name(String s_Name) {
		this.s_Name = s_Name;
	}
	public String getS_Short_Name() {
		return s_Short_Name;
	}
	public void setS_Short_Name(String s_Short_Name) {
		this.s_Short_Name = s_Short_Name;
	}
	public State_Enitity(int s_Id, String s_Name, String s_Short_Name) {
		super();
		this.s_Id = s_Id;
		this.s_Name = s_Name;
		this.s_Short_Name = s_Short_Name;
	}
	public State_Enitity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "State_Enitity [s_Id=" + s_Id + ", s_Name=" + s_Name + ", s_Short_Name=" + s_Short_Name + "]";
	}
	
	
	
}
