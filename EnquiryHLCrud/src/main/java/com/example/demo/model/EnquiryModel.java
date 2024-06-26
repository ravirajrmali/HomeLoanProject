package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EnquiryModel {

	@Id
	private int id;
	private String fullName;
	private long mobno;
	private long pincode;
	private String address;
	private String typeOfLoan;
	private int cs1;
	private String csStatus;
	
}
