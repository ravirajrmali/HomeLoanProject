package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Address;
import com.example.demo.model.DocumentUpload;
import com.example.demo.model.EmploymentDetails;
import com.example.demo.model.PersonalInformation;

import jakarta.transaction.Transactional;
@Repository
public interface regRepository extends CrudRepository<PersonalInformation, Integer>{

	
	


	

}
