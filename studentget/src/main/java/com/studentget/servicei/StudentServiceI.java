package com.studentget.servicei;

import java.util.List;

import com.studentget.model.Student;

public interface StudentServiceI {

	Student getSingleData(int sid);

	List<Student> getAllData();

}
