package com.InsertMicroService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.InsertMicroService.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
