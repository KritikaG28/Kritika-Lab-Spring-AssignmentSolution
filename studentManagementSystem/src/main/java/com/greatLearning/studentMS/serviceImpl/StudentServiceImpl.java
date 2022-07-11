package com.greatLearning.studentMS.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.studentMS.entity.Student;
import com.greatLearning.studentMS.repository.StudentRepository;
import com.greatLearning.studentMS.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int studentId) {
		return studentRepository.findById(studentId).get();
	}

	@Override
	public void save(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteById(int studentId) {
		studentRepository.deleteById(studentId);
	}

}
