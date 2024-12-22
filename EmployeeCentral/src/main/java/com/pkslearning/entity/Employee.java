package com.pkslearning.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Employee {

	
	private long employeeid;
	private String name;
	private long phone;
	private String gender;
	private String maritalstatus;
	private String email;
	private String address;
	private String adhar;
	private String bankaccount;
	private String jobtitle;
	private String department;
	private String skills;
	private int rating;
	private Date joiningdate;
	
}
