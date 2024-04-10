package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PersonalInformation {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String middleName;
	private String surName;
	private String emailId;
	private String username;
	private String password;
	private long mobno;
	private String panNo;
	private String aadharNo;
	@OneToOne(cascade = CascadeType.ALL)
	private Address ad;
	@OneToOne(cascade = CascadeType.ALL)
	private EmploymentDetails ed;
	@OneToOne(cascade = CascadeType.ALL)
	private DocumentUpload du;
	
	

}
