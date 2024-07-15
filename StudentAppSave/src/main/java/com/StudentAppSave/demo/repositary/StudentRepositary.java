package com.StudentAppSave.demo.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.StudentAppSave.demo.model.Student;

@Repository
public interface StudentRepositary extends CrudRepository<Student, Integer>{

}
