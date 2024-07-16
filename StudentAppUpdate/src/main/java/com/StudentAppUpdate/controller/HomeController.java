package com.StudentAppUpdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentAppUpdate.model.Student;
import com.StudentAppUpdate.service.ServiceI;

@RestController
public class HomeController {
	@Autowired
	ServiceI si;
	@PutMapping("/update/{sid}")
	public String updateStudent(@RequestBody Student s,@PathVariable("sid") int sid) 
	{
		
		si.updateStudent( s);
		return "data updated";
		
	}

}
