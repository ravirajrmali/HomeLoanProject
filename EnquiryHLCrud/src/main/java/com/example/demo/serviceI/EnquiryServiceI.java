package com.example.demo.serviceI;

import java.util.List;

import com.example.demo.model.EnquiryModel;

public interface EnquiryServiceI {

	public void saveEnquiryData(EnquiryModel em);

	public List<EnquiryModel> getAllData();

	public void deleteData(int id);

	public EnquiryModel getSingleData(int id);
	
	

}
