package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EnquiryModel;
import com.example.demo.repository.EnquiryRepository;
import com.example.demo.serviceI.EnquiryServiceI;

@Service
public class EnquiryServiceImpl implements EnquiryServiceI{
	
	@Autowired
	EnquiryRepository er;

	@Override
	public void saveEnquiryData(EnquiryModel em) {
		er.save(em);
		
	}

	@Override
	public List<EnquiryModel> getAllData() {
		List<EnquiryModel>elist=(List<EnquiryModel>) er.findAll();
		return elist;
	}

	@Override
	public void deleteData(int id) {
		er.deleteById(id);
		
	}

	@Override
	public EnquiryModel getSingleData(int id) {
		EnquiryModel em=er.findById(id);
		return em;
	}

}
