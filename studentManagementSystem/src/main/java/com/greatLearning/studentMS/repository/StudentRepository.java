package com.greatLearning.studentMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.studentMS.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
