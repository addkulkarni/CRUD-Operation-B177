package com.DeleteData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.DeleteData.servicei.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;
	
	@DeleteMapping("/delete/{id}")
	public String DeleteStudent(@PathVariable("id")int id) 
	    
	{
		
		si.deletebyid(id);
		return "delete successfully";
		
		
		
	}

}
