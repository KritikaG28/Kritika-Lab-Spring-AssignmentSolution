package com.greatLearning.studentMS.service;

import java.util.List;
import com.greatLearning.studentMS.entity.Student;

public interface StudentService {
	public List<Student> findAll();

	public Student findById(int studentId);

	public void save(Student student);

	public void deleteById(int studentId);

}
