package com.example.demo.serviceI;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.PersonalInformation;

public interface regServiceI {

	public void saveData(String userJason,String addr,String ed,String du, MultipartFile aadharCard, MultipartFile panCard,
			MultipartFile profImage, MultipartFile signUpload);

	

	

}
