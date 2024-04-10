package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Address;
import com.example.demo.model.PersonalInformation;
import com.example.demo.serviceI.regServiceI;
@RestController
public class RegController {
	@Autowired
	regServiceI rsi;
	
	
	@PostMapping("/saveData")
	public ResponseEntity<String> saveData(@RequestPart("a") String userJason,@RequestPart("b") String addr,@RequestPart("c") String ed,
			@RequestPart("d") String du,
			
			
			@RequestPart("aadhar") MultipartFile aadharCard,
			@RequestPart("pan") MultipartFile panCard,
			@RequestPart("prof") MultipartFile profImage,
			@RequestPart("sign") MultipartFile signUpload)
			
	{
		rsi.saveData(userJason,addr,ed,du, aadharCard, panCard, profImage, signUpload);
		return new ResponseEntity<String>("Saved.....", HttpStatus.CREATED);
	}

}
