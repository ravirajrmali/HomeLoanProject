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
public class Address {
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int adId;
	private String houseNo;
	private String laneNo;
	private String city;
	private long pincode;
	private String district;
	private String state;
	private String country;
	@OneToOne(cascade = CascadeType.ALL)
	private EmploymentDetails ed;
	
}
