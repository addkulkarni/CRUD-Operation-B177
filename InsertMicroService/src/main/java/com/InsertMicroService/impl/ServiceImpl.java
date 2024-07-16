package com.InsertMicroService.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsertMicroService.model.Student;
import com.InsertMicroService.repository.StudentRepository;
import com.InsertMicroService.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
         @Autowired
	     StudentRepository sr;
	 
	@Override
	public void saveStudent(Student s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

}
