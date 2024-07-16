package com.InsertMicroService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.InsertMicroService.model.Student;
import com.InsertMicroService.servicei.ServiceI;
@RestController
public class HomeController {
	
//	@GetMapping("/")
//	public String home()
//	{
//		return "Client is UP";
//	}
	
	
    @Autowired
	ServiceI si;
	
	@PostMapping("/saveData")
	public String saveStudent(@RequestBody Student s) {
		 
		si.saveStudent(s);
		 return "data Saved";
	
	}

}
