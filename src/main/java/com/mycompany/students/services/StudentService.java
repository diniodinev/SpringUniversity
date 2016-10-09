package com.mycompany.students.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.students.entities.Student;

@Service
public interface StudentService {

	boolean addStudent(final Student student);
	List<Student> getStudents();
}
