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
public class EmploymentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int eid;
	private String type;
	private String companyName;
	private String designation;
	private double monthlyIncome;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DocumentUpload du;
	
	
	
	
	
}
