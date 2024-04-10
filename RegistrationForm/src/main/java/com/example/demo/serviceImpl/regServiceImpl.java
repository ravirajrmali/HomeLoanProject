package com.example.demo.serviceImpl;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Address;
import com.example.demo.model.DocumentUpload;
import com.example.demo.model.EmploymentDetails;
import com.example.demo.model.PersonalInformation;
import com.example.demo.repository.AddressREpository;
import com.example.demo.repository.DocumentUploadRepository;
import com.example.demo.repository.EmploymentDetailsRepository;
import com.example.demo.repository.regRepository;
import com.example.demo.serviceI.regServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
@Service
public class regServiceImpl implements regServiceI{
	@Autowired
	regRepository rri;
	@Autowired
	AddressREpository ari;
	@Autowired
	EmploymentDetailsRepository edr;
	@Autowired
	DocumentUploadRepository dur;

	@Override
	public void saveData(String userJason,String addr,String ed,String du, MultipartFile aadharCard,
			MultipartFile panCard, MultipartFile profImage, MultipartFile signUpload) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			PersonalInformation pi=mapper.readValue(userJason, PersonalInformation.class);
			Address ad=mapper.readValue(addr, Address.class);
			EmploymentDetails edd=mapper.readValue(ed, EmploymentDetails.class);
			DocumentUpload duu=mapper.readValue(du, DocumentUpload.class);
			
			
			if(aadharCard!=null) duu.setAadharCard(aadharCard.getBytes());;
			if(panCard!=null) duu.setPanCard(panCard.getBytes());
			if(profImage!=null) duu.setProfImage(profImage.getBytes());
			if(signUpload!=null) duu.setSign(signUpload.getBytes());
			
			
			pi.setAd(ad);
			pi.setEd(edd);
			pi.setDu(duu);
			
			rri.save(pi);
			
			
			
			
			System.out.println(pi);
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
		
		
		
	}


