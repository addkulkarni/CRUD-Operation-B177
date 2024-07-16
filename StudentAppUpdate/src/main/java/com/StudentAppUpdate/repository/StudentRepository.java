package com.StudentAppUpdate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.StudentAppUpdate.model.Student;
@Repository
public interface StudentRepository  extends CrudRepository<Student,Integer>{



}
