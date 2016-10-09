package com.mycompany.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.students.constants.StudentConstants;
import com.mycompany.students.entities.Student;
import com.mycompany.students.services.StudentService;

@Controller
public class StudentsController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = StudentConstants.STUDENT_REGISTER_URL, method = RequestMethod.GET)
	public String studentsRegistry(Model model) {
		model.addAttribute("students", studentService.getStudents());
		model.addAttribute("addStudentUrl",StudentConstants.ADD_STDUDENT);
		return "studentsRegistry";
	}

	@RequestMapping(value = StudentConstants.ADD_STDUDENT, method = RequestMethod.GET)
	public String addStudent(Model model) {
		return "addStudent";
	}

	@RequestMapping(value = StudentConstants.ADD_STUDENT_SAVE, method = RequestMethod.POST)
	public String addStudentSave(Model model, @ModelAttribute(value = "studentModelAttribute") Student student) {
		studentService.addStudent(student);

		model.addAttribute("students", studentService.getStudents());
		return "studentsRegistry";
	}

}
