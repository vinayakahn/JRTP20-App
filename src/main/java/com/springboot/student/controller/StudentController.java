package com.springboot.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.student.service.StudentService;

@Controller 
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	//Handler method to handle list of students and return model and view
	@GetMapping("/students")
	public String listStudents(Model model)
	{
		model.addAttribute("students", studentService.getAllStudents() );
		return "students";
		
	}
}
