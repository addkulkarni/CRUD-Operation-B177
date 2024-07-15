package com.StudentAppSave.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentAppSave.demo.model.Student;
import com.StudentAppSave.demo.repositary.StudentRepositary;
import com.StudentAppSave.demo.servicei.StudentServiceI;

@Service
public class StudentServiceImpl implements StudentServiceI{

	
	 @Autowired
	 StudentRepositary sr;
	 
	@Override
	public void saveStudentData(Student s)
	{
         sr.save(s);
	}

}
