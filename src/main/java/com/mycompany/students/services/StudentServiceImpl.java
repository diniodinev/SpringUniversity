package com.mycompany.students.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycompany.students.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	private static List<Student> students = new ArrayList<>();
	
	@Override
	public boolean addStudent(Student student) {
		if (student != null) {
			students.add(student);
			return true;
		}
		return false;
	}

	@Override
	public List<Student> getStudents() {
		return students;
	}

}
