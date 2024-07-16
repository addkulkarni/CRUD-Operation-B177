package com.DeleteData.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.DeleteData.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student,Integer> {

}
