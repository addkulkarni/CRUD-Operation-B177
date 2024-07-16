package com.DeleteData.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DeleteData.repository.StudentRepository;
import com.DeleteData.servicei.ServiceI;

@Service
public class ServiceImpl implements ServiceI {

	
	@Autowired
	StudentRepository sr;
	
	
	@Override
	public void deletebyid(int id) {
		sr.deleteById(id);
		
	}

}
