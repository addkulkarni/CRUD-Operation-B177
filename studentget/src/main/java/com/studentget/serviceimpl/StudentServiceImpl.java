package com.studentget.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentget.model.Student;
import com.studentget.repository.StudentRepository;
import com.studentget.servicei.StudentServiceI;
@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepository sr;

	@Override
	public Student getSingleData(int sid) {
		// TODO Auto-generated method stub
		return sr.findById(sid).get();
	}

	@Override
	public List<Student> getAllData() {
		return sr.findAll();
	}
}
