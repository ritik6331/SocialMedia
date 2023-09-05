package com.socialmedia.entity;

import java.util.HashSet;
import java.util.Set;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Document(collection = "Users")
public class User {
	@Id
	private String id;
	@NotBlank
	@Size(max=15)
	private String fname;
	@NotBlank
	@Size(max=20)
	private String lname;
	@NotBlank
	@Indexed(unique=true)
	@Size(max=50)
	@Email
	private String email;
	@NotBlank
	@Size(min = 6, max = 40)
	private String password;
	
	
	@DBRef
	private Set<Role> roles = new HashSet<>();
	private boolean isActive;
	
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}




	public User(String id, @NotBlank @Size(max = 15) String fname, @NotBlank @Size(max = 20) String lname,
			@NotBlank @Size(max = 50) @Email String email, @NotBlank @Size(min = 6, max = 40) String password,
			Set<Role> roles, boolean isActive) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.isActive = isActive;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getFname() {
		return fname;
	}




	public void setFname(String fname) {
		this.fname = fname;
	}




	public String getLname() {
		return lname;
	}




	public void setLname(String lname) {
		this.lname = lname;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public Set<Role> getRoles() {
		return roles;
	}




	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}




	public boolean isActive() {
		return isActive;
	}




	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}




	public User(String fname, String lname, String email, String password) {
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", roles=" + roles + ", isActive=" + isActive + "]";
	}
	

	

	
	
}
