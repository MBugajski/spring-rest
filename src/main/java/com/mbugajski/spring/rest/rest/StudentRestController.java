package com.mbugajski.spring.rest.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbugajski.spring.rest.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> theStudents = new ArrayList<>();
		
		theStudents.add(new Student("Anna", "Kowalska"));
		theStudents.add(new Student("Jan", "Nowak"));
		theStudents.add(new Student("Jane", "Brown"));
		theStudents.add(new Student("Mark", "Doe"));
		
		return theStudents;
	}
}
