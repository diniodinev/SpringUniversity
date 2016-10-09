package com.mycompany.students.entities;

public class Student {

	private Long id;
	private String facultyNumber;
	private String name;

	public Student() {
		super();
	}

	public Student(Long id, String facultyNumber, String name) {
		super();
		this.id = id;
		this.facultyNumber = facultyNumber;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(String facultyNumber) {
		this.facultyNumber = facultyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
