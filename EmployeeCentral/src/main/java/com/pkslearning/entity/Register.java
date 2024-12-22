package com.pkslearning.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Register {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
	private long regId;
    
    @Column
	private String firstname;
    
    @Column
	private String lastname;
    
    @Column(unique = true, nullable = false)
	private String email;
    
    @Column(nullable = false)
	private String password;
    
    @Column
	private String role;
	

	public Register() {
		super();
	}

	public Register(long regId, String firstname, String lastname, String email, String password, String role) {
		super();
		this.regId = regId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	public long getRegId() {
		return regId;
	}

	public void setRegId(long regId) {
		this.regId = regId;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	


	@Override
	public String toString() {
		return "Register [regId=" + regId + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}

	

	
	
	

	
}
