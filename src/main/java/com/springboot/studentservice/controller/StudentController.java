package com.springboot.studentservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.studentservice.modal.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student/{studentId}")
	public Student getStudentDetail(@PathVariable Integer studentId) {
		Student s1 = new Student(1, "Aarav Gupta","Jr. KG");
		Map<Integer,Student> studentMap = new HashMap<Integer,Student>();
		studentMap.put(1, s1);
		Student student = studentMap.get(studentId);
		return student;
	}

}
