package com.mbugajski.spring.rest.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbugajski.spring.rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> theStudents;
	
	@PostConstruct
	private void loadData() {
		
		theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Anna", "Kowalska"));
		theStudents.add(new Student("Jan", "Nowak"));
		theStudents.add(new Student("Jane", "Brown"));
		theStudents.add(new Student("Mark", "Doe"));
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		return theStudents.get(studentId);
	}
}
