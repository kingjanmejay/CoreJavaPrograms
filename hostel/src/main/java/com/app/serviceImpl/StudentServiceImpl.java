package com.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;
import com.app.services.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
 StudentRepository studentRepository;
	@Override
	public void save(Student student) {
studentRepository.save(student);
	}

}
