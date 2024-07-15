package com.studentget.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.studentget.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
