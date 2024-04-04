package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EnquiryModel;
import com.example.demo.serviceI.EnquiryServiceI;


@CrossOrigin("*")
@RestController
public class EnquiryController {
	@Autowired
	EnquiryServiceI esi;
	
	@PostMapping("/saveData")
	public String saveEnquiryData(@RequestBody EnquiryModel em) 
	{
		System.out.println("In Controller");
		esi.saveEnquiryData(em);
		
		return "Data Saved Succesfully.....";
	}
	
	@GetMapping("/getAllData")
	public List<EnquiryModel> getAllData()
	{
		List<EnquiryModel> elist=esi.getAllData();
		return elist;
	}
	@GetMapping("getSingleData/{id}")
	public EnquiryModel getSingleData(@PathVariable int id) 
	{
		EnquiryModel em=esi.getSingleData(id);
		return em;
		
	}
	
	@PutMapping("/updateData/{id}")
    public String updateData(@RequestBody EnquiryModel em) 
	{
		esi.saveEnquiryData(em);
		return "Data updated Successfully......";
		
	}
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id) 
	{
		esi.deleteData(id);
		return "Data Deleted successfully";
		
	}
	

}
