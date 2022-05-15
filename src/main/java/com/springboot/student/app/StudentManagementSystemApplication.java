package com.springboot.student.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

import com.springboot.student.entity.Student;
import com.springboot.student.repository.StudentRepository;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
	Student student1 = new Student("Ramesh","Kumar","ramesh@gmail.com");
	studentRepository.save(student1);
	Student student2 = new Student("Shankar","Desai","shankar@gmail.com");
	studentRepository.save(student2);
	Student student3 = new Student("Arjun","Nayak","arjun@gmail.com");
	studentRepository.save(student3);
	
		
	}

}
