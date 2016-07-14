package com.babel.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
@Entity
@Table(name = "users")
public class Users implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	//private Set<UserRoles> roles= new HashSet <UserRoles>(0);

	public Users() {}
	   public Users(String Name, String Username, String Password) {
	      this.Name = Name;
	      this.Username = Username;
	      this.Password = Password;
	   }
	@Id
	@GeneratedValue
	@Column(name="UserID")
	private int UserID;

	
	@Column(name="Name")
	private String Name;

	@Column(name="Username")
	private String Username;
		
	@Column(name="Password")
	private String Password;


	
/*	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="UserRoles_has_Users", 
				joinColumns={@JoinColumn(name="UserID")}, 
				inverseJoinColumns={@JoinColumn(name="UserRolesID")})
	*/
	//Getters and Setters
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int UserID) {
		this.UserID = UserID;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String UserName) {
		this.Username = UserName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
/*	public Set<UserRoles> getRoles() {
		return roles;
	}
	public void setRoles(Set<UserRoles> roles) {
		this.roles = roles;
	}*/

}