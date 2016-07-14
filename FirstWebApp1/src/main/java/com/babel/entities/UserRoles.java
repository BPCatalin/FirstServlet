package com.babel.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "userroles")
public class UserRoles implements Serializable{
	
	
	private static final long serialVersionUID = 1L;


	public UserRoles() {}
	public UserRoles(String Function) {
	      this.Function = Function;
	   }
	@Id
	@GeneratedValue
	@Column(name="UserRolesID")
	private int UserRolesID;
	
	@Column(name="Function")
	private String Function;
	
	
	public int getUserRolesID() {
		return UserRolesID;
	}
	public void setUserRolesID(int userRolesID) {
		UserRolesID = userRolesID;
	}
	
	public String getFunction() {
		return Function;
	}
	public void setFunction(String function) {
		Function = function;
	}
	
	
}