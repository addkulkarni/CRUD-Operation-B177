package com.StudentAppUpdate.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentAppUpdate.model.Student;
import com.StudentAppUpdate.repository.StudentRepository;
import com.StudentAppUpdate.service.ServiceI;

@Service
public class ServiceImpl implements ServiceI {
	@Autowired
	StudentRepository sr;

	@Override
	public void updateStudent(Student s) {
		sr.save(s);
		
	}

}
