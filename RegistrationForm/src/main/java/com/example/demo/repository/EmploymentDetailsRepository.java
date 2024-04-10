package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EmploymentDetails;

@Repository
public interface EmploymentDetailsRepository extends CrudRepository<EmploymentDetails, Integer>{

}
