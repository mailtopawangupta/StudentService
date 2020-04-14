package com.springboot.studentservice.modal;

public class Student {
	private Integer studentId;
	private String studentName;
	private String studentClass;
	public Student(Integer studentId, String studentName, String studentClass) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	public Student() {
		
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	
	

	
}
