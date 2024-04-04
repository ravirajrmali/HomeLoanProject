package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.EnquiryModel;

@Repository
public interface EnquiryRepository extends CrudRepository<EnquiryModel, Integer>{
	public EnquiryModel findById(int id);

}
