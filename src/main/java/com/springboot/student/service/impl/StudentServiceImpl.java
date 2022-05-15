package com.springboot.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.student.entity.Student;
import com.springboot.student.repository.StudentRepository;
import com.springboot.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
