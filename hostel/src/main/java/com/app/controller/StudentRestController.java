package com.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.repository.StudentRepository;

@RestController
@RequestMapping(value = "/home")
public class StudentRestController {
    @Autowired
	StudentRepository studentRepository;
    
	@PostMapping("/saveStudentDetails")
	public void saveStudentDetails(@RequestBody Student student) {
		studentRepository.save(student);
	}
	@GetMapping(value ="/getStudentDetails/{id}")
	public Student getStudentDetails(@PathVariable Long id) {
		 return studentRepository.findById(id).get();
		
	}
	}
	

