package com.StudentAppSave.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentAppSave.demo.model.Student;
import com.StudentAppSave.demo.servicei.StudentServiceI;


@RestController
public class StudentController {

	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("/saveData")
	public String SaveStudentData(@RequestBody Student s)
	{
		ssi.saveStudentData(s);
		
		return "Data Save Successfully";
	}
}
