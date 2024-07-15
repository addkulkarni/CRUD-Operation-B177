package com.studentget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.studentget.model.Student;
import com.studentget.servicei.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	StudentServiceI ssi;
	
	@GetMapping("/getSingleData/{sid}")
	public Student getSingleData(@PathVariable("sid") int sid)
	{
		
		Student s=ssi.getSingleData(sid);
		return s;
	}
	
	@GetMapping("/getAllData")
	public List<Student> getAllData()
	{
		List<Student> slist = ssi.getAllData();
		return slist;
	}
	
}
